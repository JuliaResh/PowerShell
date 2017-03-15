package Powershell_ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptOutput_PowerShell40 : BuildType({
    template(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_ScriptOutput)
    uuid = "aef1ced0-8a1e-426a-99d9-d70eac27190e"
    extId = "Powershell_ScriptOutput_PowerShell40"
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_118")
    }
    
    disableSettings("RQ_41")
})
