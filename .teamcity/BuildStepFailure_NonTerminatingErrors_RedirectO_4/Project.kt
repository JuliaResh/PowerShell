package BuildStepFailure_NonTerminatingErrors_RedirectO_4

import BuildStepFailure_NonTerminatingErrors_RedirectO_4.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("BuildStepFailure_NonTerminatingErrors_RedirectO_4")
    name = "Source Code with Not-Found Cmdlet"

    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_12)
    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_11)
    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_13)
    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_10)
    buildType(BuildStepFailure_NonTerminatingErrors_RedirectO_9)

    template(BuildStepFailure_NonTerminatingErrors_RedirectO_8)
})
