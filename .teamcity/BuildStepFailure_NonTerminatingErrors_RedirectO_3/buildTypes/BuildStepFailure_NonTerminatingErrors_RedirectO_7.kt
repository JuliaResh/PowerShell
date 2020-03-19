package BuildStepFailure_NonTerminatingErrors_RedirectO_3.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_RedirectO_7 : BuildType({
    templates(BuildStepFailure_NonTerminatingErrors_RedirectO_3_1)
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_55")
    }
    
    disableSettings("RQ_126")
})
