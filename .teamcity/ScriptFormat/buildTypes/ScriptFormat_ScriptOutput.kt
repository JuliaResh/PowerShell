package ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object ScriptFormat_ScriptOutput : Template({
    name = "Script Output"

    vcs {
        root(DslContext.settingsRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = """Source Code & "-Command-" with brackets"""
            id = "RUNNER_196"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = script {
                content = """
                    if (${'$'}true) {
                        Write-Output "Write-Output out from brackets"
                    }
                """.trimIndent()
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
        }
        powerShell {
            name = """Source Code & "-Command-" with tab"""
            id = "RUNNER_197"
            enabled = false
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = script {
                content = """
                    if (${'$'}true) {
                    	Write-Output "Write-Output out from brackets"
                    }
                """.trimIndent()
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
        }
        powerShell {
            name = """Source Code & "-File" with tab"""
            id = "RUNNER_3"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = script {
                content = """
                    if (${'$'}true) {
                    	Write-Output "Output File with tab"
                    }
                """.trimIndent()
            }
            noProfile = false
        }
        powerShell {
            name = """TW-36815 & "-Command""""
            id = "RUNNER_34"
            enabled = false
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = script {
                content = """
                    ${'$'}test= "C:\temp\test"
                    if(-not (Test-Path ${'$'}test)){ 
                        md ${'$'}test
                    }
                    if (${'$'}error -or ${'$'}LASTEXITCODE) { exit 1 }
                """.trimIndent()
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
        }
        powerShell {
            name = "TW-36815 from external file"
            id = "RUNNER_35"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = script {
                content = """
                    ${'$'}test= "C:\temp\test"
                    if(-not (Test-Path ${'$'}test)){ 
                        md ${'$'}test
                    }
                    if (${'$'}error -or ${'$'}LASTEXITCODE) { exit 1 }
                """.trimIndent()
            }
            noProfile = false
        }
    }

    failureConditions {
        errorMessage = true
    }
})
