package Powershell_BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_PowerShell10 : BuildType({
    template(Powershell_BuildStepFailure_TerminatingErrors.buildTypes.Powershell_BuildStepFailure_TerminatingErrors_ScriptsWithTerminatingErrors)
    uuid = "78416f34-3697-4a76-9937-8c3238d3ab46"
    extId = "Powershell_BuildStepFailure_PowerShell10"
    name = "PowerShell 1.0"
    paused = true

    requirements {
        equals("powershell_x86", "1.0", "RQ_22")
    }
    
    disableSettings("RQ_59")
})
