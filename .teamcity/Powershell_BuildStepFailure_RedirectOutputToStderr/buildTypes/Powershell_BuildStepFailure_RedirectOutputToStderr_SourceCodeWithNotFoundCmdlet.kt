package Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Powershell_BuildStepFailure_RedirectOutputToStderr_SourceCodeWithNotFoundCmdlet : Template({
    uuid = "5e1c9cd6-d802-4669-9d26-22ce48e091f8"
    extId = "Powershell_BuildStepFailure_RedirectOutputToStderr_SourceCodeWithNotFoundCmdlet"
    name = "Source code with Not-Found cmdlet"


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Cmdlet not found"
            id = "RUNNER_22"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
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
            id = "RUNNER_24"
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

    features {
        swabra {
            id = "swabra"
            enabled = false
            forceCleanCheckout = true
        }
    }

    requirements {
        equals("powershell_x86", "", "RQ_51")
    }
})
