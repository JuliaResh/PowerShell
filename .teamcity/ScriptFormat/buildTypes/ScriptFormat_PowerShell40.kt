package ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptFormat_PowerShell40 : BuildType({
    templates(ScriptFormat_ScriptOutput)
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_27")
    }
    
    disableSettings("RQ_122")
})
