package TemporaryScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object TemporaryScriptDeletion_TemporaryScriptIsNotDelet : BuildType({
    name = "Temporary script is not deleted with powershell.keep.generated"
    paused = true

    params {
        param("powershell.keep.generated", "true")
    }

    vcs {
        root(DslContext.settingsRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = """Source Code & "-Command""""
            scriptMode = script {
                content = """Write-Output "Hello, world!""""
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
            param("jetbrains_powershell_script_file", "week.ps1")
        }
        script {
            name = "Check that script was NOT deleted"
            scriptContent = """
                if not exist "%system.teamcity.build.tempDir%\powershell*.ps1" (
                    echo File is deleted
                    del "%system.teamcity.build.tempDir%\powershell*.ps1"
                    echo ##teamcity[buildProblem description='PowerShell script was not deleted from temp directory']
                    exit 1
                ) else (
                    echo File is not deleted
                    echo %system.teamcity.build.tempDir%\powershell*.ps1
                    exit 0
                )
            """.trimIndent()
        }
        powerShell {
            name = """Source Code & "-File""""
            scriptMode = script {
                content = """Write-Output "Hello, world!""""
            }
            noProfile = false
            param("jetbrains_powershell_script_file", "week.ps1")
        }
        script {
            name = "Check that script was NOT deleted (1)"
            scriptContent = """
                if not exist "%system.teamcity.build.tempDir%\powershell*.ps1" (
                    echo File is deleted
                    del "%system.teamcity.build.tempDir%\powershell*.ps1"
                    echo ##teamcity[buildProblem description='PowerShell script was not deleted from temp directory']
                    exit 1
                ) else (
                    echo File is not deleted
                    echo %system.teamcity.build.tempDir%\powershell*.ps1
                    exit 0
                )
            """.trimIndent()
        }
    }
})
