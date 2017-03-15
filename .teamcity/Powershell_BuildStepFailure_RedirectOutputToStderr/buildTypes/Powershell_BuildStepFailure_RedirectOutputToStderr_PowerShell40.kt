package Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell40 : BuildType({
    template(Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes.Powershell_BuildStepFailure_RedirectOutputToStderr_SourceCodeWithNotFoundCmdlet)
    uuid = "e48cfa69-d428-4794-9aed-f4c5511ddb8f"
    extId = "Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell40"
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_60")
    }
    
    disableSettings("RQ_51")
})
