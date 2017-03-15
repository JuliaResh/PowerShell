package Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell40underNet50 : BuildType({
    uuid = "5f9d7d2f-237e-497e-915a-0ae1b0bf028e"
    extId = "Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell40underNet50"
    name = "PowerShell 4.0 under .Net 5.0"
    paused = true


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Cmdlet not found"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v4_0
            formatStderrAsError = true
            scriptMode = script {
                content = """
                    Write-Output "Foo"
                    Not-Found "With parameter"
                    Write-Output "After"
                """.trimIndent()
            }
            noProfile = false
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
