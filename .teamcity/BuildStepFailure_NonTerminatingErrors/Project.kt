package BuildStepFailure_NonTerminatingErrors

import BuildStepFailure_NonTerminatingErrors.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("BuildStepFailure_NonTerminatingErrors")
    name = "Non-Terminating Errors"

    buildType(BuildStepFailure_NonTerminatingErrors_RunAll)

    subProject(BuildStepFailure_NonTerminatingErrors_RedirectO_2.Project)
    subProject(BuildStepFailure_NonTerminatingErrors_RedirectOut.Project)
})
