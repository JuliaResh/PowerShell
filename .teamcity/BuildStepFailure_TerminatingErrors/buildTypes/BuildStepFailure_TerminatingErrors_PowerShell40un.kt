package BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v2019_2.failureConditions.failOnText

object BuildStepFailure_TerminatingErrors_PowerShell40un : BuildType({
    name = "PowerShell 4.0 under .Net 5.0"
    paused = true

    vcs {
        root(DslContext.settingsRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "File with syntax error as external file"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minRequiredVersion = "4.0"
            scriptMode = file {
                path = "weekerr.ps1"
            }
            noProfile = false
        }
        powerShell {
            name = "Source script with syntax error as external file"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minRequiredVersion = "4.0"
            scriptMode = script {
                content = """
                    param (
                        [string]${'$'}PowerShellParam = "value",
                    )
                    Write-Host "Current week number: ${'$'}(get-Date -uformat %W)"
                """.trimIndent()
            }
            noProfile = false
        }
        powerShell {
            name = "Throw exception"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minRequiredVersion = "4.0"
            scriptMode = script {
                content = """
                    throw "Oops!"
                    Write-Output "After"
                """.trimIndent()
            }
            noProfile = false
        }
        powerShell {
            name = "Write-error with stop"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minRequiredVersion = "4.0"
            scriptMode = script {
                content = """
                    Write-Error 'Lorem ipsum' -ErrorAction Stop
                    Write-Output "After"
                """.trimIndent()
            }
            noProfile = false
        }
        powerShell {
            name = "Exit with code 7"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minRequiredVersion = "4.0"
            scriptMode = script {
                content = "Exit 7"
            }
            noProfile = false
        }
        powerShell {
            name = "Trap error and exit with code 5"
            minRequiredVersion = "4.0"
            scriptMode = script {
                content = """
                    Trap {
                      Write-Host 'Trapped error in script' 
                      Exit 5
                    }
                    abracadabra
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
            reverse = false
        }
    }

    requirements {
        equals("powershell_x86", "5.0")
    }
})
