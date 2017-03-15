package Powershell_Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_Arguments_PowerShell20 : BuildType({
    template(Powershell_Arguments.buildTypes.Powershell_Arguments_Arguments_2)
    uuid = "62d37198-9144-490f-a56e-f068a002d30b"
    extId = "Powershell_Arguments_PowerShell20"
    name = "PowerShell 2.0"
    paused = true
    
    steps {
        powerShell {
            name = "One argument with space A"
            id = "RUNNER_55_A"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """"one test-message"""")
        }
    }

    requirements {
        equals("powershell_x86", "2.0", "RQ_28")
    }
})
