package BuildStepFailure_NonTerminatingErrors_RedirectO_3

import BuildStepFailure_NonTerminatingErrors_RedirectO_3.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("BuildStepFailure_NonTerminatingErrors_RedirectO_3")
    name = "File with Write-Error"

    buildType(BuildStepFailure_NonTerminatingErrors_RedirectO_2_1)
    buildType(BuildStepFailure_NonTerminatingErrors_RedirectO_7)
    buildType(BuildStepFailure_NonTerminatingErrors_RedirectO_4_1)
    buildType(BuildStepFailure_NonTerminatingErrors_RedirectO_6)
    buildType(BuildStepFailure_NonTerminatingErrors_RedirectO_5)

    template(BuildStepFailure_NonTerminatingErrors_RedirectO_3_1)
})
