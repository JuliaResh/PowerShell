package BuildStepFailure_NonTerminatingErrors_RedirectO_3.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_RedirectO_2_1 : BuildType({
    templates(BuildStepFailure_NonTerminatingErrors_RedirectO_3_1)
    id("BuildStepFailure_NonTerminatingErrors_RedirectO_2")
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_79")
    }
    
    disableSettings("RQ_126")
})
