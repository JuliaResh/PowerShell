package Powershell_ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptFormatting_PowerShell10 : BuildType({
    template(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormatting_ScriptOutput)
    uuid = "19c37c10-7eae-4e8c-afc0-a5143786d9c0"
    extId = "Powershell_ScriptFormatting_PowerShell10"
    name = "PowerShell 1.0"
    paused = true

    requirements {
        equals("powershell_x86", "1.0", "RQ_128")
    }
    
    disableSettings("RQ_122")
})
