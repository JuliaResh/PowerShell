package BuildStepFailure_NonTerminatingErrors_RedirectO_3.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_RedirectO_4_1 : BuildType({
    templates(BuildStepFailure_NonTerminatingErrors_RedirectO_3_1)
    id("BuildStepFailure_NonTerminatingErrors_RedirectO_4")
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_100")
    }
    
    disableSettings("RQ_126")
})
