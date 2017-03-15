package Powershell_BuildStepFailure_ExitCode0_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCode0_2_PowerShell20 : BuildType({
    template(Powershell_BuildStepFailure_ExitCode0_2.buildTypes.Powershell_BuildStepFailure_ExitCode0_2_ScriptsWithTryCatchBlock)
    uuid = "4f880a69-01d7-4471-b589-b172e1e72697"
    extId = "Powershell_BuildStepFailure_ExitCode0_2_PowerShell20"
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_88")
    }
    
    disableSettings("RQ_63")
})
