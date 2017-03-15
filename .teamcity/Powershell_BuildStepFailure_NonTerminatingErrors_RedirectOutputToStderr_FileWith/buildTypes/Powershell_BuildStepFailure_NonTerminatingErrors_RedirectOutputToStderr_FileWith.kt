package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Template_Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith : Template({
    uuid = "0cfd4855-5f65-4d86-b4a9-275b378a7d5e"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith"
    name = "File with Write-Error"


    params {
        param("buildFailing", "true")
    }

    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Write-Error"
            id = "RUNNER_30"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
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
            id = "RUNNER_31"
            enabled = false
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
        script {
            id = "RUNNER_609"
            executionMode = BuildStep.ExecutionMode.RUN_ON_SUCCESS
            scriptContent = """
                echo ##teamcity[setParameter name='buildFailing' value='false']
                exit 0
            """.trimIndent()
        }
        powerShell {
            name = "Check that build status is failing 2"
            id = "RUNNER_610"
            scriptMode = script {
                content = """
                    if ("%buildFailing%" -eq "true")  {
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

    features {
        swabra {
            id = "swabra"
            enabled = false
            forceCleanCheckout = true
        }
    }

    requirements {
        equals("powershell_x86", "", "RQ_126")
    }
})
