package Powershell_BuildStepFailure_RedirectOutputToStderr

import Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "0217857a-798d-4803-b2f7-f178e00c3d3e"
    extId = "Powershell_BuildStepFailure_RedirectOutputToStderr"
    parentId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr"
    name = "Source Code with Not-Found Cmdlet"

    buildType(Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell20)
    buildType(Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell30)
    buildType(Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell40)
    buildType(Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell50)
    buildType(Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell40underNet50)

    template(Powershell_BuildStepFailure_RedirectOutputToStderr_SourceCodeWithNotFoundCmdlet)
})
