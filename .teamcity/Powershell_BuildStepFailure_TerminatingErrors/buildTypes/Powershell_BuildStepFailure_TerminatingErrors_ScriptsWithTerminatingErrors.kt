package Powershell_BuildStepFailure_TerminatingErrors.buildTypes

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

object Powershell_BuildStepFailure_TerminatingErrors_ScriptsWithTerminatingErrors : Template({
    uuid = "c4432cef-9db5-4e91-8dc9-2079a5401590"
    extId = "Powershell_BuildStepFailure_TerminatingErrors_ScriptsWithTerminatingErrors"
    name = "Scripts with terminating errors"


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "File with syntax error as external file"
            id = "RUNNER_50"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "weekerr.ps1"
            }
            noProfile = false
        }
        powerShell {
            name = "Source script with syntax error as external file"
            id = "RUNNER_52"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
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
            id = "RUNNER_54"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
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
            id = "RUNNER_61"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
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
            id = "RUNNER_9"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = script {
                content = "Exit 7"
            }
            noProfile = false
        }
        powerShell {
            name = "Trap error and exit with code 5"
            id = "RUNNER_127"
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
            id = "BUILD_EXT_56"
            conditionType = BuildFailureOnText.ConditionType.CONTAINS
            pattern = "Process exited with code 0"
            reverse = false
        }
        failOnText {
            id = "BUILD_EXT_67"
            enabled = false
            conditionType = BuildFailureOnText.ConditionType.CONTAINS
            pattern = "Process exited with code 7"
            failureMessage = "Exit code from Exit cmdlet was ignored"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_68"
            enabled = false
            conditionType = BuildFailureOnText.ConditionType.CONTAINS
            pattern = "Process exited with code 5"
            failureMessage = "Exit code from Trap block was ignored"
            reverse = true
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
        equals("powershell_x86", "", "RQ_59")
    }
})
