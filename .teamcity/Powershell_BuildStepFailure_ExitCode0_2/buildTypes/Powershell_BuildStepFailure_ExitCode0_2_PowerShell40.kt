package Powershell_BuildStepFailure_ExitCode0_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCode0_2_PowerShell40 : BuildType({
    template(Powershell_BuildStepFailure_ExitCode0_2.buildTypes.Powershell_BuildStepFailure_ExitCode0_2_ScriptsWithTryCatchBlock)
    uuid = "a0e7da02-c160-4a7c-ab61-2e532fd1d831"
    extId = "Powershell_BuildStepFailure_ExitCode0_2_PowerShell40"
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_47")
    }
    
    disableSettings("RQ_63")
})
