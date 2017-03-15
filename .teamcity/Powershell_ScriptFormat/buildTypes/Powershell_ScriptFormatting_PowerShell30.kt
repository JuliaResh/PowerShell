package Powershell_ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptFormatting_PowerShell30 : BuildType({
    template(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormatting_ScriptOutput)
    uuid = "640caf78-345f-48fa-be27-f0b612d848c8"
    extId = "Powershell_ScriptFormatting_PowerShell30"
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_40")
    }
    
    disableSettings("RQ_122")
})
