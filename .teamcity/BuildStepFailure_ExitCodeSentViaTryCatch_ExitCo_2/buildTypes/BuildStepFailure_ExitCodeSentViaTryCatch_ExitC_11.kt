package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_11 : BuildType({
    templates(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_8)
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_119")
    }
    
    disableSettings("RQ_63")
})
