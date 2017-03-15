package Powershell_BuildStepFailure_ExitCode0.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Powershell_BuildStepFailure_ExitCode0_PowerShell40underNet50 : BuildType({
    uuid = "a812ecfb-414d-42fe-b61d-ed209a69e376"
    extId = "Powershell_BuildStepFailure_ExitCode0_PowerShell40underNet50"
    name = "PowerShell 4.0 under .Net 5.0"
    paused = true


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Source script with try catch block"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v4_0
            scriptMode = script {
                content = """
                    try {
                        abracadabra
                    } catch {
                        Write-Output "Error caught"
                        Exit 0
                    }
                """.trimIndent()
            }
            noProfile = false
        }
    }

    failureConditions {
        testFailure = false
        nonZeroExitCode = false
    }

    requirements {
        equals("powershell_x86", "5.0")
    }
})
