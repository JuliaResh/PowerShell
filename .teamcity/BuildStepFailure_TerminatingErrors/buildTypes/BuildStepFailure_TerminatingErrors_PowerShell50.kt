package BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_TerminatingErrors_PowerShell50 : BuildType({
    templates(BuildStepFailure_TerminatingErrors_ScriptsWithTer)
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_101")
    }
    
    disableSettings("RQ_59")
})
