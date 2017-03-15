package Powershell_WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Powershell_WorkingDirectory_CheckFileWasCreatedInSpecifiedWorkingDirectory : Template({
    uuid = "ec8035c2-b5cd-4dc0-a108-ed52b9941990"
    extId = "Powershell_WorkingDirectory_CheckFileWasCreatedInSpecifiedWorkingDirectory"
    name = "Check file was created in specified working directory"


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_AGENT
    }

    steps {
        powerShell {
            name = "Create file in working directory via PowerShell script"
            id = "RUNNER_10"
            workingDir = "%path%"
            scriptMode = file {
                path = "write_to_file.ps1"
            }
            noProfile = false
        }
        script {
            name = "Check file was created where expected"
            id = "RUNNER_11"
            scriptContent = """
                if exist "%path%\%file%" (
                    echo File found
                    rmdir "%path%" /s /q
                    echo Directory deleted
                ) else (
                    echo File is missing in %path%
                    echo ##teamcity[buildProblem description='Output file is not found where expected']
                    exit 1
                )
            """.trimIndent()
        }
    }
})
