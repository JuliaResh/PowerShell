package Powershell_BuildStepFailure_ExitCode0

import Powershell_BuildStepFailure_ExitCode0.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "949fec4d-74ae-4246-9316-cfd9f946e244"
    extId = "Powershell_BuildStepFailure_ExitCode0"
    parentId = "Powershell_BuildStepFailure_ExitCodeSentViaTryCatch"
    name = "Exit Code = 0"

    buildType(Powershell_BuildStepFailure_ExitCode0_RunAll)
    buildType(Powershell_BuildStepFailure_ExitCode0_PowerShell40underNet50)
    buildType(Powershell_BuildStepFailure_ExitCode0_PowerShell50)
    buildType(Powershell_BuildStepFailure_ExitCode0_PowerShell20)
    buildType(Powershell_BuildStepFailure_ExitCode0_PowerShell40)
    buildType(Powershell_BuildStepFailure_ExitCode0_PowerShell30)

    template(Powershell_BuildStepFailure_ExitCode0_ScriptsWithTerminatingErrors)
})
