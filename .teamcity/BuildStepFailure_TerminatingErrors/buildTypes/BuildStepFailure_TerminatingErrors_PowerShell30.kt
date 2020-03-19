package BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_TerminatingErrors_PowerShell30 : BuildType({
    templates(BuildStepFailure_TerminatingErrors_ScriptsWithTer)
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_18")
    }
    
    disableSettings("RQ_59")
})
