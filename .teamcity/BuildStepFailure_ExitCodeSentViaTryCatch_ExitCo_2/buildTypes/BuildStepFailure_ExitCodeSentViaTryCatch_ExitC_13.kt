package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v2019_2.failureConditions.failOnText

object BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_13 : BuildType({
    name = "PowerShell 4.0 under .Net 5.0"
    paused = true

    vcs {
        root(DslContext.settingsRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Source script with try catch block"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minRequiredVersion = "4.0"
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
