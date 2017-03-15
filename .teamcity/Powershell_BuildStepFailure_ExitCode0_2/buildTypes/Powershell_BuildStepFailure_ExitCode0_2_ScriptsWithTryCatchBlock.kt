package Powershell_BuildStepFailure_ExitCode0_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.Swabra.*
import jetbrains.buildServer.configs.kotlin.v10.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText.*
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.failOnText

object Powershell_BuildStepFailure_ExitCode0_2_ScriptsWithTryCatchBlock : Template({
    uuid = "8affacd1-a4c5-4d20-9ec1-f29ec14b3efa"
    extId = "Powershell_BuildStepFailure_ExitCode0_2_ScriptsWithTryCatchBlock"
    name = "Scripts with try catch block"


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Source script with try catch block"
            id = "RUNNER_150"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = script {
                content = """
                    try {
                        abracadabra
                    } catch {
                        Write-Output "Error caught"
                        Exit 6
                    }
                """.trimIndent()
            }
            noProfile = false
        }
    }

    failureConditions {
        testFailure = false
        nonZeroExitCode = false
        failOnText {
            id = "BUILD_EXT_70"
            conditionType = BuildFailureOnText.ConditionType.CONTAINS
            pattern = "Process exited with code 0"
            failureMessage = "step wasn't failed"
            reverse = false
        }
    }

    features {
        swabra {
            id = "swabra"
            enabled = false
            forceCleanCheckout = true
        }
    }

    requirements {
        equals("powershell_x86", "", "RQ_63")
    }
})
