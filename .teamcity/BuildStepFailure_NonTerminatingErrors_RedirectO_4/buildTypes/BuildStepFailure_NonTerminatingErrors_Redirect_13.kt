package BuildStepFailure_NonTerminatingErrors_RedirectO_4.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_Redirect_13 : BuildType({
    templates(BuildStepFailure_NonTerminatingErrors_RedirectO_8)
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_95")
    }
    
    disableSettings("RQ_51")
})
