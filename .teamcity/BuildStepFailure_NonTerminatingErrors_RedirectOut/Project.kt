package BuildStepFailure_NonTerminatingErrors_RedirectOut

import BuildStepFailure_NonTerminatingErrors_RedirectOut.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("BuildStepFailure_NonTerminatingErrors_RedirectOut")
    name = "Redirect Output to Stderr"

    buildType(BuildStepFailure_NonTerminatingErrors_RedirectOut_1)

    subProject(BuildStepFailure_NonTerminatingErrors_RedirectO_4.Project)
    subProject(BuildStepFailure_NonTerminatingErrors_RedirectO_3.Project)
})
