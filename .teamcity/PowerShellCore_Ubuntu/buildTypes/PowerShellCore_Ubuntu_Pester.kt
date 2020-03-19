package PowerShellCore_Ubuntu.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object PowerShellCore_Ubuntu_Pester : BuildType({
    name = "Pester"

    vcs {
        root(DslContext.settingsRoot)

        checkoutMode = CheckoutMode.ON_SERVER
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
