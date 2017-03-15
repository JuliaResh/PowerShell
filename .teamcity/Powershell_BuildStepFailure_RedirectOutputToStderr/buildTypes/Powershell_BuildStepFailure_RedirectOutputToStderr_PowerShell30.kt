package Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell30 : BuildType({
    template(Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes.Powershell_BuildStepFailure_RedirectOutputToStderr_SourceCodeWithNotFoundCmdlet)
    uuid = "d6341f24-38fc-4661-be18-ce96b8f00f41"
    extId = "Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell30"
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_82")
    }
    
    disableSettings("RQ_51")
})
