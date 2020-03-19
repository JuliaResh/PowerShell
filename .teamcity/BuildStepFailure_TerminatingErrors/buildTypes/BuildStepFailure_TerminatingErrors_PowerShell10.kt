package BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_TerminatingErrors_PowerShell10 : BuildType({
    templates(BuildStepFailure_TerminatingErrors_ScriptsWithTer)
    name = "PowerShell 1.0"
    paused = true

    requirements {
        equals("powershell_x86", "1.0", "RQ_22")
    }
    
    disableSettings("RQ_59")
})
