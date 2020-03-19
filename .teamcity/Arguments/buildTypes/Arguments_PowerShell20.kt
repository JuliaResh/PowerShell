package Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object Arguments_PowerShell20 : BuildType({
    name = "PowerShell 2.0"
    paused = true

    steps {
        powerShell {
            name = "One argument with space A"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """"one test-message"""")
        }
    }

    requirements {
        equals("powershell_x86", "2.0")
    }
})
