package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_4 : BuildType({
    template(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes.Template_Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith)
    uuid = "92aa2629-fb43-4f27-9d7f-e1664ca76af9"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_4"
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_100")
    }
    
    disableSettings("RQ_126")
})
