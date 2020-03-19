package BuildStepFailure_NonTerminatingErrors_RedirectO_2

import BuildStepFailure_NonTerminatingErrors_RedirectO_2.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("BuildStepFailure_NonTerminatingErrors_RedirectO_2")
    name = "Redirect Output to Stdout"

    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_21)
    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_20)
    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_19)
    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_16)
    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_15)
    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_18)
    buildType(BuildStepFailure_NonTerminatingErrors_Redirect_17)

    template(BuildStepFailure_NonTerminatingErrors_Redirect_14)
})
