package Powershell_ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell

object Powershell_ScriptFormat_PowerShell40underNet50 : BuildType({
    uuid = "66ed84a3-93c0-4af3-91be-b466c5c24cd7"
    extId = "Powershell_ScriptFormat_PowerShell40underNet50"
    name = "PowerShell 4.0 under .Net 5.0"
    paused = true


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = """Source Code & "-Command-" with brackets"""
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v4_0
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
            minVersion = PowerShellStep.Version.v4_0
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
            minVersion = PowerShellStep.Version.v4_0
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
