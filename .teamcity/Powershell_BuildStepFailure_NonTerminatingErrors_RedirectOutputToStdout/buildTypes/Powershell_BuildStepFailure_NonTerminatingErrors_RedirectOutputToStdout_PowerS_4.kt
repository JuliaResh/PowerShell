package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_4 : BuildType({
    template(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_SourceCo)
    uuid = "934a2c99-610f-46cd-9613-e2e33505b902"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_4"
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_127")
    }
    
    disableSettings("RQ_35")
})
