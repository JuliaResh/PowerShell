package ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptFormat_PowerShell20 : BuildType({
    templates(ScriptFormat_ScriptOutput)
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_110")
    }
    
    disableSettings("RQ_122")
})
