package ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptFormat_PowerShell50 : BuildType({
    templates(ScriptFormat_ScriptOutput)
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_42")
    }
    
    disableSettings("RQ_122")
})
