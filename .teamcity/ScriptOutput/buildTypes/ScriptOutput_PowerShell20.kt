package ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptOutput_PowerShell20 : BuildType({
    templates(ScriptOutput_ScriptOutput)
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_46")
    }
    
    disableSettings("RQ_41")
})
