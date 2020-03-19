package WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object WorkingDirectory_CheckFileWasCreatedInSpecifiedWo : Template({
    name = "Check file was created in specified working directory"

    vcs {
        root(DslContext.settingsRoot)

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
