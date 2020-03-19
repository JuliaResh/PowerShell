package Docker.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object Docker_CommandLine : BuildType({
    name = "Command Line"
    description = "get image properties"

    steps {
        script {
            name = "New build step"
            scriptContent = "docker info"
        }
        script {
            scriptContent = """
                echo %%PATH%%
                dir C:\Windows\System32\WindowsPowerShell\v1.0
                dir "C:\Program Files\PowerShell\latest"
                if exist C:\Windows\sysnative\WindowsPowerShell\v1.0 echo true else echo false
            """.trimIndent()
            dockerImage = "microsoft/powershell:windowsservercore"
        }
    }
})
