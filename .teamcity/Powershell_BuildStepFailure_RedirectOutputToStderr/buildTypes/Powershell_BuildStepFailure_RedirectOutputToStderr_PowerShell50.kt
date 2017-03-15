package Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell50 : BuildType({
    template(Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes.Powershell_BuildStepFailure_RedirectOutputToStderr_SourceCodeWithNotFoundCmdlet)
    uuid = "7f78afff-034e-4887-b747-f6ce1480a430"
    extId = "Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell50"
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_95")
    }
    
    disableSettings("RQ_51")
})
