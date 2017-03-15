package Powershell_ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText.*
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.failOnText

object Powershell_ScriptOutput_ScriptOutput : Template({
    uuid = "0004d90f-74df-465c-affe-ed66ebc83cce"
    extId = "Powershell_ScriptOutput_ScriptOutput"
    name = "Script Output"


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = """Source Code & "-Command-""""
            id = "RUNNER_171"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = script {
                content = """Write-Output "Write-Output output from Source and Command""""
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
        }
        powerShell {
            name = """Source Code & "-File""""
            id = "RUNNER_172"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = script {
                content = """Write-Output "Write-Output output from Source and File""""
            }
            noProfile = false
        }
        powerShell {
            name = """File & "-Command-""""
            id = "RUNNER_173"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "output_command.ps1"
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
            param("jetbrains_powershell_script_code", """Write-Output "Write-Output out from Source and File"""")
        }
        powerShell {
            name = """File & "-File""""
            id = "RUNNER_174"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "output_file.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_script_code", """Write-Output "Write-Output out from Source and File"""")
        }
        powerShell {
            name = "Week Script"
            id = "RUNNER_139"
            scriptMode = file {
                path = "week.ps1"
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
        }
        powerShell {
            name = "Week script executed as external file"
            id = "RUNNER_199"
            scriptMode = file {
                path = "week.ps1"
            }
            noProfile = false
        }
    }

    failureConditions {
        errorMessage = true
        failOnText {
            id = "BUILD_EXT_35"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^Write-Output output from Source and Command${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_36"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^Write-Output output from Source and File${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_37"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^Write-Output output with Command option${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_38"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^Write-Output output with File option${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_27"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = """^Current week number \(out\)"""
            reverse = true
        }
    }

    requirements {
    }
})
