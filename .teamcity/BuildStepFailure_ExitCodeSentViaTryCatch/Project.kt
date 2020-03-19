package BuildStepFailure_ExitCodeSentViaTryCatch

import BuildStepFailure_ExitCodeSentViaTryCatch.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("BuildStepFailure_ExitCodeSentViaTryCatch")
    name = "Exit Code Sent via Try Catch"

    buildType(BuildStepFailure_ExitCodeSentViaTryCatch_RunAll)

    subProject(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode.Project)
    subProject(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2.Project)
})
