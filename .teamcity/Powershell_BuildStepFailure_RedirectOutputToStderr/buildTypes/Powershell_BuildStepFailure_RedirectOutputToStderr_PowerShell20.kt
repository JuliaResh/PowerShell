package Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell20 : BuildType({
    template(Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes.Powershell_BuildStepFailure_RedirectOutputToStderr_SourceCodeWithNotFoundCmdlet)
    uuid = "96f572a7-a823-4233-baf5-9f689ffb1287"
    extId = "Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell20"
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_114")
    }
    
    disableSettings("RQ_51")
})
