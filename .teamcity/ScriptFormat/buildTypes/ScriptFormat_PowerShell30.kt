package ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptFormat_PowerShell30 : BuildType({
    templates(ScriptFormat_ScriptOutput)
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_40")
    }
    
    disableSettings("RQ_122")
})
