package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_6 : BuildType({
    template(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes.Template_Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith)
    uuid = "f538769b-dc50-45cf-8dfa-ac52db0aedde"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_6"
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_55")
    }
    
    disableSettings("RQ_126")
})
