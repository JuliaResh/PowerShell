package BuildStepFailure

import BuildStepFailure.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("BuildStepFailure")
    name = "Build Step Failure"
    description = "TW-34410, TW-21554"

    buildType(BuildStepFailure_RunAll)

    subProject(BuildStepFailure_NonTerminatingErrors.Project)
    subProject(BuildStepFailure_ExitCodeSentViaTryCatch.Project)
    subProject(BuildStepFailure_TerminatingErrors.Project)
})
