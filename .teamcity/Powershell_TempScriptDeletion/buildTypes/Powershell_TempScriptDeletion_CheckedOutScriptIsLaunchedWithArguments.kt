package Powershell_TempScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Powershell_TempScriptDeletion_CheckedOutScriptIsLaunchedWithArguments : BuildType({
    uuid = "5f25f228-1fc8-4356-baac-167fab7160aa"
    extId = "Powershell_TempScriptDeletion_CheckedOutScriptIsLaunchedWithArguments"
    name = "Checked out script is launched with arguments"
    paused = true


    params {
        param("file_name", "filename with spaces.ps1")
    }

    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = """File & "-File""""
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "%file_name%"
            }
            noProfile = false
            param("jetbrains_powershell_script_code", """Write-Output "Hello, world!"""")
            param("jetbrains_powershell_scriptArguments", """
                param1
                param2 param3
            """.trimIndent())
        }
        script {
            name = "Check that script was deleted"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptContent = """
                if exist "%teamcity.build.checkoutDir%\%file_name%" (
                    echo File exists
                    exit 0
                ) else (
                    echo File is deleted
                    echo %teamcity.build.checkoutDir%\%file_name%
                    echo ##teamcity[buildProblem description='PowerShell script was deleted from checkout directory']
                    exit 1
                )
            """.trimIndent()
        }
    }

    requirements {
        moreThanVer("powershell_x86", "1.0")
    }
})
