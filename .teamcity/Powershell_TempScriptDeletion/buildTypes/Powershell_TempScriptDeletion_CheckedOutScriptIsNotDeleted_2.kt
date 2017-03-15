package Powershell_TempScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeleted_2 : Template({
    uuid = "601310fa-515b-4115-9854-f1a1f6ac20cb"
    extId = "Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeleted_2"
    name = "Checked out script is not deleted"


    params {
        param("file_name", "week.ps1")
    }

    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_AGENT
    }

    steps {
        powerShell {
            name = """File & "-Command""""
            id = "RUNNER_192"
            scriptMode = file {
                path = "%file_name%"
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
            noProfile = false
            param("jetbrains_powershell_script_code", """Write-Output "Hello, world!"""")
        }
        script {
            name = "Check that script was deleted"
            id = "RUNNER_193"
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
        powerShell {
            name = """File & "-File""""
            id = "RUNNER_194"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "%file_name%"
            }
            noProfile = false
            param("jetbrains_powershell_script_code", """Write-Output "Hello, world!"""")
        }
        script {
            name = "Check that script was deleted (1)"
            id = "RUNNER_195"
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
        moreThanVer("powershell_x86", "1.0", "RQ_106")
    }
})
