package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_5 : BuildType({
    templates(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode_1)
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_64")
    }
    
    disableSettings("RQ_90")
})
