package Powershell_BuildStepFailure_ExitCode0.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCode0_PowerShell30 : BuildType({
    template(Powershell_BuildStepFailure_ExitCode0.buildTypes.Powershell_BuildStepFailure_ExitCode0_ScriptsWithTerminatingErrors)
    uuid = "1d236daa-af86-4024-8a87-cead24c31a28"
    extId = "Powershell_BuildStepFailure_ExitCode0_PowerShell30"
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_6")
    }
    
    disableSettings("RQ_90")
})
