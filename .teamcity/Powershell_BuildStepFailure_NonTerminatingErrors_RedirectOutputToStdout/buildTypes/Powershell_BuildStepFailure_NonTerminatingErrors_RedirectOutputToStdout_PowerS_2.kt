package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_2 : BuildType({
    template(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_SourceCo)
    uuid = "4a73f2e4-0999-4ed0-abfd-e451af742aac"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_2"
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_31")
    }
    
    disableSettings("RQ_35")
})
