package Docker.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object Docker_Windows : BuildType({
    name = "Windows"

    artifactRules = """
        test.txt
        *
    """.trimIndent()

    params {
        param("teamcity.powershell.virtual.executable", """C:\Program Files\PowerShell\latest\pwsh.exe""")
        param("tag", "windowsservercore")
    }

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        powerShell {
            minRequiredVersion = "6.0.5"
            platform = PowerShellStep.Platform.x64
            scriptMode = file {
                path = "host.ps1"
            }
            noProfile = false
            param("plugin.docker.imagePlatform", "windows")
            param("plugin.docker.imageId", "microsoft/powershell:%tag%")
        }
        powerShell {
            name = "New build step (1)"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            platform = PowerShellStep.Platform.x86
            edition = PowerShellStep.Edition.Desktop
            scriptMode = file {
                path = "host.ps1"
            }
            noProfile = false
            param("plugin.docker.imageId", "microsoft/powershell:%tag%")
        }
        powerShell {
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            platform = PowerShellStep.Platform.x86
            edition = PowerShellStep.Edition.Core
            formatStderrAsError = true
            scriptMode = file {
                path = "host.ps1"
            }
            param("jetbrains_powershell_script_code", """
                Write-Output "foo"
                Write-Host "bar"
                ${'$'}s=”some text”
                
                
                1..10| % { 
                     ${'$'}s >> "./test.txt" 
                }
            """.trimIndent())
            param("plugin.docker.imageId", "microsoft/powershell:%tag%")
            param("jetbrains_powershell_scriptArguments", "qq ww ee")
        }
        powerShell {
            name = "New build step"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            platform = PowerShellStep.Platform.x64
            edition = PowerShellStep.Edition.Core
            formatStderrAsError = true
            scriptMode = file {
                path = "host.ps1"
            }
            param("jetbrains_powershell_script_code", """
                Write-Output "foo"
                Write-Host "bar"
                ${'$'}s=”some text”
                
                
                1..10| % { 
                     ${'$'}s >> "./test.txt" 
                }
            """.trimIndent())
            param("plugin.docker.imageId", "microsoft/powershell:%tag%")
            param("jetbrains_powershell_scriptArguments", "qq ww ee")
        }
    }

    requirements {
        startsWith("teamcity.agent.jvm.os.name", "Windows")
    }
})
