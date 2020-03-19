package TemporaryScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object TemporaryScriptDeletion_TemporaryScriptIsDeleted : Template({
    name = "Temporary script is deleted"

    vcs {
        root(DslContext.settingsRoot)

        checkoutMode = CheckoutMode.ON_AGENT
    }

    steps {
        powerShell {
            name = """Source Code & "-Command""""
            id = "RUNNER_187"
            scriptMode = script {
                content = """Write-Output "Hello, world!""""
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
            param("jetbrains_powershell_script_file", "week.ps1")
        }
        script {
            name = "Check that script was deleted"
            id = "RUNNER_188"
            scriptContent = """
                if exist "%system.teamcity.build.tempDir%\powershell*.ps1" (
                    echo File exists
                    del "%system.teamcity.build.tempDir%\powershell*.ps1"
                    echo ##teamcity[buildProblem description='PowerShell script was not deleted from temp directory']
                    exit 1
                ) else (
                    echo File is deleted
                    echo %system.teamcity.build.tempDir%\powershell*.ps1
                    exit 0
                )
            """.trimIndent()
        }
        powerShell {
            name = """Source Code & "-File""""
            id = "RUNNER_189"
            scriptMode = script {
                content = """Write-Output "Hello, world!""""
            }
            noProfile = false
            param("jetbrains_powershell_script_file", "week.ps1")
        }
        script {
            name = "Check that script was deleted (1)"
            id = "RUNNER_190"
            scriptContent = """
                if exist "%system.teamcity.build.tempDir%\powershell*.ps1" (
                    echo File exists
                    del "%system.teamcity.build.tempDir%\powershell*.ps1"
                    echo ##teamcity[buildProblem description='PowerShell script was not deleted from temp directory']
                    exit 1
                ) else (
                    echo File is deleted
                    echo %system.teamcity.build.tempDir%\powershell*.ps1
                    exit 0
                )
            """.trimIndent()
        }
    }
})
