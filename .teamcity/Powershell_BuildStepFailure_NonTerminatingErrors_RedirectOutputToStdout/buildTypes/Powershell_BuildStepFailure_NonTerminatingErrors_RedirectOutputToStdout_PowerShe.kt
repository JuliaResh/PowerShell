package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerShe : BuildType({
    template(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_SourceCo)
    uuid = "607fb081-4b4f-4492-ab7b-f032f033ec3d"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerShe"
    name = "PowerShell 1.0"
    paused = true

    requirements {
        equals("powershell_x86", "1.0", "RQ_72")
    }
    
    disableSettings("RQ_35")
})
