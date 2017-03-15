package PowerShell_FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText.*
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.failOnText

object PowerShell_FileModeWithPowershellUseFile_FileExecutionMode : Template({
    uuid = "4bef4f66-16e7-45ee-a812-c40b20b89e52"
    extId = "PowerShell_FileModeWithPowershellUseFile_FileExecutionMode"
    name = "-File execution mode"


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Script from source code"
            id = "RUNNER_37"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = script {
                content = """Write-Output "Hello, World!""""
            }
            noProfile = false
        }
        powerShell {
            name = "Script from file"
            id = "RUNNER_40"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
        }
        powerShell {
            name = "File with spaces"
            id = "RUNNER_41"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "filename with spaces.ps1"
            }
            noProfile = false
        }
        powerShell {
            name = "With arguments"
            id = "RUNNER_42"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """
                "one message"
                two messages
            """.trimIndent())
        }
    }

    failureConditions {
        failOnText {
            id = "BUILD_EXT_53"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^one message${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_54"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^two${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_55"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^messages${'$'}"
            reverse = true
        }
    }

    requirements {
        equals("powershell_x86", "", "RQ_16")
    }
})
