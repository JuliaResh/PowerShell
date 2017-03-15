package Powershell_ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptOutput_PowerShell10 : BuildType({
    template(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_ScriptOutput)
    uuid = "4f63bcfa-c4d6-473f-9a82-5702f68522d7"
    extId = "Powershell_ScriptOutput_PowerShell10"
    name = "PowerShell 1.0"
    paused = true

    requirements {
        equals("powershell_x86", "1.0", "RQ_19")
    }
    
    disableSettings("RQ_41")
})
