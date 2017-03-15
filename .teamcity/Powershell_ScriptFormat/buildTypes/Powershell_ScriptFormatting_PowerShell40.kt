package Powershell_ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptFormatting_PowerShell40 : BuildType({
    template(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormatting_ScriptOutput)
    uuid = "682133f6-2a34-4b17-818c-1ddd61ff620f"
    extId = "Powershell_ScriptFormatting_PowerShell40"
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_27")
    }
    
    disableSettings("RQ_122")
})
