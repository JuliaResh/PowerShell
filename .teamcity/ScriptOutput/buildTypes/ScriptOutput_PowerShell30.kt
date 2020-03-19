package ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptOutput_PowerShell30 : BuildType({
    templates(ScriptOutput_ScriptOutput)
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_87")
    }
    
    disableSettings("RQ_41")
})
