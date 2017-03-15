package Powershell_ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptOutput_PowerShell50 : BuildType({
    template(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_ScriptOutput)
    uuid = "71f64b40-1517-41fc-bd70-e388d64a42e0"
    extId = "Powershell_ScriptOutput_PowerShell50"
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_83")
    }
    
    disableSettings("RQ_41")
})
