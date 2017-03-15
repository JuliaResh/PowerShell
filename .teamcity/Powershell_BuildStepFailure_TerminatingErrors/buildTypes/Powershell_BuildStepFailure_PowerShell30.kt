package Powershell_BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_PowerShell30 : BuildType({
    template(Powershell_BuildStepFailure_TerminatingErrors.buildTypes.Powershell_BuildStepFailure_TerminatingErrors_ScriptsWithTerminatingErrors)
    uuid = "9d22608a-c7f0-48ab-80dd-ba1b82a92e94"
    extId = "Powershell_BuildStepFailure_PowerShell30"
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_18")
    }
    
    disableSettings("RQ_59")
})
