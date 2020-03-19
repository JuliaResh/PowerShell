package BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_TerminatingErrors_PowerShell40 : BuildType({
    templates(BuildStepFailure_TerminatingErrors_ScriptsWithTer)
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_52")
    }
    
    disableSettings("RQ_59")
})
