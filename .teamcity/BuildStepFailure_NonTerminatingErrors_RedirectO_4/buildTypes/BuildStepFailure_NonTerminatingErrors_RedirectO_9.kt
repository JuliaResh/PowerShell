package BuildStepFailure_NonTerminatingErrors_RedirectO_4.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_RedirectO_9 : BuildType({
    templates(BuildStepFailure_NonTerminatingErrors_RedirectO_8)
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_114")
    }
    
    disableSettings("RQ_51")
})
