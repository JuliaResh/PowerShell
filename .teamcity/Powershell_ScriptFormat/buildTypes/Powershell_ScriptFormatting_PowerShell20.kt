package Powershell_ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptFormatting_PowerShell20 : BuildType({
    template(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormatting_ScriptOutput)
    uuid = "e851e205-63d8-4f59-bba2-2e2553dd3b07"
    extId = "Powershell_ScriptFormatting_PowerShell20"
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_110")
    }
    
    disableSettings("RQ_122")
})
