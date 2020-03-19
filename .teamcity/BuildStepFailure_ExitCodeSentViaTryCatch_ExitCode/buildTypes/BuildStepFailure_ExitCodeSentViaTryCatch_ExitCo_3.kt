package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_3 : BuildType({
    templates(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode_1)
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_98")
    }
    
    disableSettings("RQ_90")
})
