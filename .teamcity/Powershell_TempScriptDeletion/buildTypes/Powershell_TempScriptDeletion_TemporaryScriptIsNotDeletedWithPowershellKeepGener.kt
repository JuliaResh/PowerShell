package Powershell_TempScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Powershell_TempScriptDeletion_TemporaryScriptIsNotDeletedWithPowershellKeepGener : BuildType({
    uuid = "a7a2f266-642e-42cc-9ceb-97dd7cbb399f"
    extId = "Powershell_TempScriptDeletion_TemporaryScriptIsNotDeletedWithPowershellKeepGener"
    name = "Temporary script is not deleted with powershell.keep.generated"
    paused = true


    params {
        param("powershell.keep.generated", "true")
    }

    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

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
