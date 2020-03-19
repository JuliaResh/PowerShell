package TemporaryScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object TemporaryScriptDeletion_CheckedOutScriptIsLaunche : BuildType({
    name = "Checked out script is launched with arguments"
    paused = true

    params {
        param("file_name", "filename with spaces.ps1")
    }

    vcs {
        root(DslContext.settingsRoot)

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
