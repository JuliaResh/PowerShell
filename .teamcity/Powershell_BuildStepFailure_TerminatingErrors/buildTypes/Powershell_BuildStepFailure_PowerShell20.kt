package Powershell_BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_PowerShell20 : BuildType({
    template(Powershell_BuildStepFailure_TerminatingErrors.buildTypes.Powershell_BuildStepFailure_TerminatingErrors_ScriptsWithTerminatingErrors)
    uuid = "89fb79b9-874e-43ed-b403-55d7f4331971"
    extId = "Powershell_BuildStepFailure_PowerShell20"
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_80")
    }
    
    disableSettings("RQ_59")
})
