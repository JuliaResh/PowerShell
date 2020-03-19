package ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptOutput_PowerShell40 : BuildType({
    templates(ScriptOutput_ScriptOutput)
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_118")
    }
    
    disableSettings("RQ_41")
})
