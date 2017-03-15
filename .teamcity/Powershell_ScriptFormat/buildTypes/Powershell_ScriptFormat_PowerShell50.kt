package Powershell_ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptFormat_PowerShell50 : BuildType({
    template(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormatting_ScriptOutput)
    uuid = "41fe70f1-717e-4033-89f4-2dae77dd225c"
    extId = "Powershell_ScriptFormat_PowerShell50"
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_42")
    }
    
    disableSettings("RQ_122")
})
