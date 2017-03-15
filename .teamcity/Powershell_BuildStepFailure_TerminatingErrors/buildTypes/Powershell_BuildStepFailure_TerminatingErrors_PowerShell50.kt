package Powershell_BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_TerminatingErrors_PowerShell50 : BuildType({
    template(Powershell_BuildStepFailure_TerminatingErrors.buildTypes.Powershell_BuildStepFailure_TerminatingErrors_ScriptsWithTerminatingErrors)
    uuid = "a76d8057-544b-4a2a-b89e-92ba5f62d6b7"
    extId = "Powershell_BuildStepFailure_TerminatingErrors_PowerShell50"
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_101")
    }
    
    disableSettings("RQ_59")
})
