package Powershell_BuildStepFailure_ExitCode0_2

import Powershell_BuildStepFailure_ExitCode0_2.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "7f0d30a5-7085-487e-8a5d-ea621cb1bc4d"
    extId = "Powershell_BuildStepFailure_ExitCode0_2"
    parentId = "Powershell_BuildStepFailure_ExitCodeSentViaTryCatch"
    name = "Exit Code > 0"

    buildType(Powershell_BuildStepFailure_ExitCode0_2_RunAll)
    buildType(Powershell_BuildStepFailure_ExitCode0_2_PowerShell40underNet50)
    buildType(Powershell_BuildStepFailure_ExitCode0_2_PowerShell30)
    buildType(Powershell_BuildStepFailure_ExitCode0_2_PowerShell20)
    buildType(Powershell_BuildStepFailure_ExitCode0_2_PowerShell50)
    buildType(Powershell_BuildStepFailure_ExitCode0_2_PowerShell40)

    template(Powershell_BuildStepFailure_ExitCode0_2_ScriptsWithTryCatchBlock)
})
