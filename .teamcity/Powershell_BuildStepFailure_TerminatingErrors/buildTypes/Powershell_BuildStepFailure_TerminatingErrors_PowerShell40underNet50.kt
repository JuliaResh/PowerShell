package Powershell_BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText.*
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.failOnText

object Powershell_BuildStepFailure_TerminatingErrors_PowerShell40underNet50 : BuildType({
    uuid = "728ac499-96f0-4a95-87db-674ba58ed5a6"
    extId = "Powershell_BuildStepFailure_TerminatingErrors_PowerShell40underNet50"
    name = "PowerShell 4.0 under .Net 5.0"
    paused = true


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "File with syntax error as external file"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v4_0
            scriptMode = file {
                path = "weekerr.ps1"
            }
            noProfile = false
        }
        powerShell {
            name = "Source script with syntax error as external file"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v4_0
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
            minVersion = PowerShellStep.Version.v4_0
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
            minVersion = PowerShellStep.Version.v4_0
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
            minVersion = PowerShellStep.Version.v4_0
            scriptMode = script {
                content = "Exit 7"
            }
            noProfile = false
        }
        powerShell {
            name = "Trap error and exit with code 5"
            minVersion = PowerShellStep.Version.v4_0
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
