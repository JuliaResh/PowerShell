package Docker.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object Docker_Linux : BuildType({
    name = "Linux"

    artifactRules = """
        test.txt
        *
    """.trimIndent()

    params {
        param("tag", "latest")
    }

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        powerShell {
            scriptMode = file {
                path = "host.ps1"
            }
            noProfile = false
            param("plugin.docker.pull.enabled", "true")
            param("plugin.docker.imageId", "microsoft/powershell:%tag%")
        }
        powerShell {
            formatStderrAsError = true
            scriptMode = script {
                content = """
                    Write-Output "foo"
                    Write-Host "bar"
                    ${'$'}s=”some text”
                    
                    
                    1..10| % { 
                         ${'$'}s >> "./test.txt" 
                    }
                """.trimIndent()
            }
            param("jetbrains_powershell_script_file", "Not-Found_CmdLet.ps1")
            param("plugin.docker.imageId", "microsoft/powershell")
            param("jetbrains_powershell_scriptArguments", "qq ww ee")
        }
    }

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Linux")
    }
})
