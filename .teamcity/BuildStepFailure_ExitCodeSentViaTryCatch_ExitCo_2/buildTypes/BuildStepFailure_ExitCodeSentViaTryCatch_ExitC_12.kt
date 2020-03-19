package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_12 : BuildType({
    templates(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_8)
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_47")
    }
    
    disableSettings("RQ_63")
})
