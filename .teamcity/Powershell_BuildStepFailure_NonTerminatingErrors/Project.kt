package Powershell_BuildStepFailure_NonTerminatingErrors

import Powershell_BuildStepFailure_NonTerminatingErrors.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "b3e30a3f-6c0e-4104-930b-f3fae2d35931"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors"
    parentId = "Powershell_BuildStepFailure"
    name = "Non-Terminating Errors"

    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RunAll)
})
