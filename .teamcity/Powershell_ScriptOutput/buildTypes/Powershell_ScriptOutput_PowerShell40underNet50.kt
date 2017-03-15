package Powershell_ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText.*
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.failOnText

object Powershell_ScriptOutput_PowerShell40underNet50 : BuildType({
    uuid = "57095a52-efd7-4b64-995f-bb37be8d1aae"
    extId = "Powershell_ScriptOutput_PowerShell40underNet50"
    name = "PowerShell 4.0 under .Net 5.0"
    paused = true


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = """Source Code & "-Command-""""
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v4_0
            scriptMode = script {
                content = """Write-Output "Write-Output output from Source and Command""""
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
        }
        powerShell {
            name = """Source Code & "-File""""
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v4_0
            scriptMode = script {
                content = """Write-Output "Write-Output output from Source and File""""
            }
            noProfile = false
        }
        powerShell {
            name = """File & "-Command-""""
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v4_0
            scriptMode = file {
                path = "output_command.ps1"
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
            param("jetbrains_powershell_script_code", """Write-Output "Write-Output out from Source and File"""")
        }
        powerShell {
            name = """File & "-File""""
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v4_0
            scriptMode = file {
                path = "output_file.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_script_code", """Write-Output "Write-Output out from Source and File"""")
        }
        powerShell {
            name = "Week Script"
            minVersion = PowerShellStep.Version.v4_0
            scriptMode = file {
                path = "week.ps1"
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
        }
        powerShell {
            name = "Week script executed as external file"
            minVersion = PowerShellStep.Version.v4_0
            scriptMode = file {
                path = "week.ps1"
            }
            noProfile = false
        }
    }

    failureConditions {
        errorMessage = true
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^Write-Output output from Source and Command${'$'}"
            reverse = true
        }
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^Write-Output output from Source and File${'$'}"
            reverse = true
        }
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^Write-Output output with Command option${'$'}"
            reverse = true
        }
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^Write-Output output with File option${'$'}"
            reverse = true
        }
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = """^Current week number \(out\)"""
            reverse = true
        }
    }

    requirements {
        equals("powershell_x86", "5.0")
    }
})
