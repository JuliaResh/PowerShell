package ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object ScriptFormat_PowerShell40underNet50 : BuildType({
    name = "PowerShell 4.0 under .Net 5.0"
    paused = true

    vcs {
        root(DslContext.settingsRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = """Source Code & "-Command-" with brackets"""
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minRequiredVersion = "4.0"
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
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minRequiredVersion = "4.0"
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
            name = "TW-36815 from external file"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minRequiredVersion = "4.0"
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
        equals("powershell_x86", "5.0")
    }
})
