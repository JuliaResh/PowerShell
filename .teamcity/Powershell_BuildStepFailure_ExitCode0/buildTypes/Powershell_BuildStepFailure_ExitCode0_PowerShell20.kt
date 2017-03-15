package Powershell_BuildStepFailure_ExitCode0.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCode0_PowerShell20 : BuildType({
    template(Powershell_BuildStepFailure_ExitCode0.buildTypes.Powershell_BuildStepFailure_ExitCode0_ScriptsWithTerminatingErrors)
    uuid = "12b4627c-a89a-48d1-9329-6f7a81742ff3"
    extId = "Powershell_BuildStepFailure_ExitCode0_PowerShell20"
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_98")
    }
    
    disableSettings("RQ_90")
})
