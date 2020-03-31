package PowerShellCore_Windows.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object PowerShellCore_Windows_Build : BuildType({
    name = "Build"

    vcs {
        root(DslContext.settingsRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            platform = PowerShellStep.Platform.x64
            edition = PowerShellStep.Edition.Desktop
            scriptMode = file {
                path = "host.ps1"
            }
        }
        powerShell {
            platform = PowerShellStep.Platform.x86
            scriptMode = file {
                path = "host.ps1"
            }
        }
    }
})
