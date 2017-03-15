package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_3 : BuildType({
    template(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes.Template_Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith)
    uuid = "e1410a64-3f5e-468f-a407-aa3b0103e07c"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_3"
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_79")
    }
    
    disableSettings("RQ_126")
})
