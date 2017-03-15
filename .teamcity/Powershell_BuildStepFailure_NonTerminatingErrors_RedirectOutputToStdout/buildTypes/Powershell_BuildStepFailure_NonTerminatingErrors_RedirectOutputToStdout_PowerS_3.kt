package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_3 : BuildType({
    template(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_SourceCo)
    uuid = "b4e66bb0-efee-43b1-9a5d-4715ee02d004"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_3"
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_111")
    }
    
    disableSettings("RQ_35")
})
