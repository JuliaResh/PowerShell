package Powershell_ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptOutput_PowerShell30 : BuildType({
    template(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_ScriptOutput)
    uuid = "c204fa17-b16c-403c-92fb-3694c0019d49"
    extId = "Powershell_ScriptOutput_PowerShell30"
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_87")
    }
    
    disableSettings("RQ_41")
})
