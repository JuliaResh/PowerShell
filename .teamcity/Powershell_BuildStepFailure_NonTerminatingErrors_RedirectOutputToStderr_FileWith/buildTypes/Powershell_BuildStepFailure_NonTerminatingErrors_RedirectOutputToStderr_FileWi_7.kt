package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_7 : BuildType({
    uuid = "40e861da-8a1a-488d-85bb-3d373958276e"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_7"
    name = "PowerShell 4.0 under .Net 5.0"
    paused = true


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Write-Error"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v4_0
            formatStderrAsError = true
            scriptMode = file {
                path = "write-error.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_script_code", """
                Write-Output "Foo"
                Not-Found "With parameter"
                Write-Output "After"
            """.trimIndent())
        }
        powerShell {
            name = "Check that build status is failing"
            minVersion = PowerShellStep.Version.v4_0
            scriptMode = script {
                content = """
                    if( ${'$'}Host -and ${'$'}Host.UI -and ${'$'}Host.UI.RawUI ) {
                      ${'$'}rawUI = ${'$'}Host.UI.RawUI
                      ${'$'}oldSize = ${'$'}rawUI.BufferSize
                      ${'$'}typeName = ${'$'}oldSize.GetType( ).FullName
                      ${'$'}newSize = New-Object ${'$'}typeName (500, ${'$'}oldSize.Height)
                      ${'$'}rawUI.BufferSize = ${'$'}newSize
                    }
                    
                    ${'$'}url = "%teamcity.serverUrl%/guestAuth/app/rest/builds/%teamcity.build.id%/status"
                    ${'$'}client = New-Object System.Net.WebCLient
                    ${'$'}buildStatus = ${'$'}client.DownloadString(${'$'}url)
                    
                    if (${'$'}buildStatus -eq "FAILURE")  {
                        Write-Output "##teamcity[buildStatus status='SUCCESS']"
                    } else {
                        Write-Output "##teamcity[buildStatus status='FAILURE' text='{build.status.text} build failure condition did not fire']"
                    }
                """.trimIndent()
            }
            noProfile = false
        }
    }

    failureConditions {
        testFailure = false
        nonZeroExitCode = false
        errorMessage = true
    }

    requirements {
        equals("powershell_x86", "5.0")
    }
})
