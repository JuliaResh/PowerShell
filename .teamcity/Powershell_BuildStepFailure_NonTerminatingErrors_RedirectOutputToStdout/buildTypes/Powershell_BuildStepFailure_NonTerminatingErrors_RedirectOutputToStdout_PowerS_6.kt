package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_6 : BuildType({
    uuid = "435e3cce-121f-43fe-bb80-47971191a589"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_6"
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
            minVersion = PowerShellStep.Version.v4_0
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

    requirements {
        equals("powershell_x86", "5.0")
    }
})
