package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr

import Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "d09c7848-ee6b-4fbe-b1b6-c3c12955cd63"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr"
    parentId = "Powershell_BuildStepFailure_NonTerminatingErrors"
    name = "Redirect Output to Stderr"

    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_RunAll)
})
