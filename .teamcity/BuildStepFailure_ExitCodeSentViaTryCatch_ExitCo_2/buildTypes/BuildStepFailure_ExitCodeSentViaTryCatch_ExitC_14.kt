package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_14 : BuildType({
    templates(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_8)
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_58")
    }
    
    disableSettings("RQ_63")
})
