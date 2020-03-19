package BuildStepFailure_NonTerminatingErrors_RedirectO_4.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_Redirect_10 : BuildType({
    templates(BuildStepFailure_NonTerminatingErrors_RedirectO_8)
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_82")
    }
    
    disableSettings("RQ_51")
})
