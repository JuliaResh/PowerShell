package Powershell_BuildStepFailure_ExitCode0.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Powershell_BuildStepFailure_ExitCode0_ScriptsWithTerminatingErrors : Template({
    uuid = "0acdd70f-30f7-43c0-8c62-f9d3d4dc7644"
    extId = "Powershell_BuildStepFailure_ExitCode0_ScriptsWithTerminatingErrors"
    name = "Scripts with try catch block"


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Source script with try catch block"
            id = "RUNNER_149"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
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

    features {
        swabra {
            id = "swabra"
            enabled = false
            forceCleanCheckout = true
        }
    }

    requirements {
        equals("powershell_x86", "", "RQ_90")
    }
})
