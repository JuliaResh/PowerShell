package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2

import BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2")
    name = "Exit Code > 0"

    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_9)
    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_11)
    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_12)
    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_10)
    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_13)
    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_14)

    template(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_8)
})
