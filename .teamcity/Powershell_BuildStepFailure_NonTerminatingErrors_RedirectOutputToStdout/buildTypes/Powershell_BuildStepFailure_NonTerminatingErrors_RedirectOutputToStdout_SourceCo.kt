package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_SourceCo : Template({
    uuid = "05a0e9c7-099a-417f-a127-0f54425d92ee"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_SourceCo"
    name = "Non-terminating errors"


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Cmdlet not found"
            id = "RUNNER_46"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
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
            name = "File with Write-Error"
            id = "RUNNER_48"
            scriptMode = file {
                path = "write-error.ps1"
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
        equals("powershell_x86", "", "RQ_35")
    }
})
