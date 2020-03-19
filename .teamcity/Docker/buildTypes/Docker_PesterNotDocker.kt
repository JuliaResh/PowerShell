package Docker.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object Docker_PesterNotDocker : BuildType({
    name = "Pester (not docker)"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        powerShell {
            edition = PowerShellStep.Edition.Core
            scriptMode = file {
                path = "pester.ps1"
            }
            noProfile = false
        }
    }
})
