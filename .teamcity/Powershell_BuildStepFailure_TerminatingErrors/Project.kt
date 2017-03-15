package Powershell_BuildStepFailure_TerminatingErrors

import Powershell_BuildStepFailure_TerminatingErrors.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "de636fde-3b1d-4630-a93e-4d0181421f29"
    extId = "Powershell_BuildStepFailure_TerminatingErrors"
    parentId = "Powershell_BuildStepFailure"
    name = "Terminating Errors"

    buildType(Powershell_BuildStepFailure_TerminatingErrors_RunAll)
    buildType(Powershell_BuildStepFailure_TerminatingErrors_PowerShell50)
    buildType(Powershell_BuildStepFailure_PowerShell20)
    buildType(Powershell_BuildStepFailure_PowerShell10)
    buildType(Powershell_BuildStepFailure_TerminatingErrors_PowerShell40underNet50)
    buildType(Powershell_BuildStepFailure_PowerShell40)
    buildType(Powershell_BuildStepFailure_PowerShell30)

    template(Powershell_BuildStepFailure_TerminatingErrors_ScriptsWithTerminatingErrors)
})
