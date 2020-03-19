package BuildStepFailure_NonTerminatingErrors_RedirectO_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_Redirect_19 : BuildType({
    templates(BuildStepFailure_NonTerminatingErrors_Redirect_14)
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_127")
    }
    
    disableSettings("RQ_35")
})
