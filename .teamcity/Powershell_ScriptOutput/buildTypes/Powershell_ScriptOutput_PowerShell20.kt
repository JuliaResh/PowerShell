package Powershell_ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptOutput_PowerShell20 : BuildType({
    template(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_ScriptOutput)
    uuid = "e074372f-6e99-439d-b094-2c415a7c79e4"
    extId = "Powershell_ScriptOutput_PowerShell20"
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_46")
    }
    
    disableSettings("RQ_41")
})
