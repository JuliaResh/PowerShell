package BuildStepFailure_NonTerminatingErrors_RedirectO_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_Redirect_17 : BuildType({
    templates(BuildStepFailure_NonTerminatingErrors_Redirect_14)
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_31")
    }
    
    disableSettings("RQ_35")
})
