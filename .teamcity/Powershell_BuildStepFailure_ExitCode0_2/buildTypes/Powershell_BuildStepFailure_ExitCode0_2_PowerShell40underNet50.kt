package Powershell_BuildStepFailure_ExitCode0_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText.*
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.failOnText

object Powershell_BuildStepFailure_ExitCode0_2_PowerShell40underNet50 : BuildType({
    uuid = "163c791e-d0dd-41f6-8848-dd9388f0c127"
    extId = "Powershell_BuildStepFailure_ExitCode0_2_PowerShell40underNet50"
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
            conditionType = BuildFailureOnText.ConditionType.CONTAINS
            pattern = "Process exited with code 0"
            failureMessage = "step wasn't failed"
            reverse = false
        }
    }

    requirements {
        equals("powershell_x86", "4.0")
    }
})
