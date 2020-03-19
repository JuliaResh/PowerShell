package BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_TerminatingErrors_PowerShell20 : BuildType({
    templates(BuildStepFailure_TerminatingErrors_ScriptsWithTer)
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_80")
    }
    
    disableSettings("RQ_59")
})
