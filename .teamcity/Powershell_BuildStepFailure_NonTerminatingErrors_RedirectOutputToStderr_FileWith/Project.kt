package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith

import Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "64c797ac-6173-4b35-b778-d90f272bee34"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith"
    parentId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr"
    name = "File with Write-Error"

    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_3)
    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_4)
    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_5)
    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_6)
    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_7)

    template(Template_Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith)
})
