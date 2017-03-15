package Powershell_ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Powershell_ScriptFormatting_ScriptOutput : Template({
    uuid = "b4ab3e43-0d98-4864-be87-cfc48b26457a"
    extId = "Powershell_ScriptFormatting_ScriptOutput"
    name = "Script Output"


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

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

    requirements {
    }
})
