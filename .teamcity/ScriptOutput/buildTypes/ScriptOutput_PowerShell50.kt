package ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptOutput_PowerShell50 : BuildType({
    templates(ScriptOutput_ScriptOutput)
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_83")
    }
    
    disableSettings("RQ_41")
})
