package BuildStepFailure_TerminatingErrors

import BuildStepFailure_TerminatingErrors.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("BuildStepFailure_TerminatingErrors")
    name = "Terminating Errors"

    buildType(BuildStepFailure_TerminatingErrors_PowerShell40)
    buildType(BuildStepFailure_TerminatingErrors_PowerShell50)
    buildType(BuildStepFailure_TerminatingErrors_PowerShell20)
    buildType(BuildStepFailure_TerminatingErrors_PowerShell30)
    buildType(BuildStepFailure_TerminatingErrors_RunAll)
    buildType(BuildStepFailure_TerminatingErrors_PowerShell40un)
    buildType(BuildStepFailure_TerminatingErrors_PowerShell10)

    template(BuildStepFailure_TerminatingErrors_ScriptsWithTer)
})
