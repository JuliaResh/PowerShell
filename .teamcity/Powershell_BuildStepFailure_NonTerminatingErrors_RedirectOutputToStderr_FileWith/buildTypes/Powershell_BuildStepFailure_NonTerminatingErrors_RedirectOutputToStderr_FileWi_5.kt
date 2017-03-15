package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_5 : BuildType({
    template(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes.Template_Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith)
    uuid = "7024f724-0ba1-4144-a9f2-d53746c90ee7"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_5"
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_39")
    }
    
    disableSettings("RQ_126")
})
