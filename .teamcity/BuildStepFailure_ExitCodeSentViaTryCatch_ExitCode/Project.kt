package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode

import BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode")
    name = "Exit Code = 0"

    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_7)
    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_5)
    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_6)
    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_3)
    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_4)
    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2_1)

    template(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode_1)
})
