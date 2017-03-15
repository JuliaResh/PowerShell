package Powershell_BuildStepFailure_ExitCode0.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCode0_PowerShell40 : BuildType({
    template(Powershell_BuildStepFailure_ExitCode0.buildTypes.Powershell_BuildStepFailure_ExitCode0_ScriptsWithTerminatingErrors)
    uuid = "550e5728-da3a-4ae4-9107-439f287b22d3"
    extId = "Powershell_BuildStepFailure_ExitCode0_PowerShell40"
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_64")
    }
    
    disableSettings("RQ_90")
})
