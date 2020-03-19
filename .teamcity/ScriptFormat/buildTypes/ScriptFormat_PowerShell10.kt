package ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptFormat_PowerShell10 : BuildType({
    templates(ScriptFormat_ScriptOutput)
    name = "PowerShell 1.0"
    paused = true

    requirements {
        equals("powershell_x86", "1.0", "RQ_128")
    }
    
    disableSettings("RQ_122")
})
