package Powershell_BuildStepFailure_ExitCode0.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCode0_PowerShell50 : BuildType({
    template(Powershell_BuildStepFailure_ExitCode0.buildTypes.Powershell_BuildStepFailure_ExitCode0_ScriptsWithTerminatingErrors)
    uuid = "d8fc1fdf-580c-4ae6-9dca-5c2c05e4d15b"
    extId = "Powershell_BuildStepFailure_ExitCode0_PowerShell50"
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_3")
    }
    
    disableSettings("RQ_90")
})
