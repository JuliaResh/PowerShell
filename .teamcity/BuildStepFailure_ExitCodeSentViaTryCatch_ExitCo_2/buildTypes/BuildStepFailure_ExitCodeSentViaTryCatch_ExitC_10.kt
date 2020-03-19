package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_10 : BuildType({
    templates(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_8)
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_88")
    }
    
    disableSettings("RQ_63")
})
