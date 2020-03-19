package Docker.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object Docker_Pester : BuildType({
    name = "Pester"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        powerShell {
            scriptMode = file {
                path = "pester.ps1"
            }
            noProfile = false
            param("plugin.docker.imageId", "microsoft/powershell")
        }
    }
})
