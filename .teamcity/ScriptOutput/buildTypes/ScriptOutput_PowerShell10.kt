package ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptOutput_PowerShell10 : BuildType({
    templates(ScriptOutput_ScriptOutput)
    name = "PowerShell 1.0"
    paused = true

    requirements {
        equals("powershell_x86", "1.0", "RQ_19")
    }
    
    disableSettings("RQ_41")
})
