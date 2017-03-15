package Powershell_BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_PowerShell40 : BuildType({
    template(Powershell_BuildStepFailure_TerminatingErrors.buildTypes.Powershell_BuildStepFailure_TerminatingErrors_ScriptsWithTerminatingErrors)
    uuid = "6ed338d0-acf2-4c9c-a984-4d88dcfbe97c"
    extId = "Powershell_BuildStepFailure_PowerShell40"
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_52")
    }
    
    disableSettings("RQ_59")
})
