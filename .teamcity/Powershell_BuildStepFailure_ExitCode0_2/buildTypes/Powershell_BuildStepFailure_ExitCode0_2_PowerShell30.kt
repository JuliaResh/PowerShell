package Powershell_BuildStepFailure_ExitCode0_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCode0_2_PowerShell30 : BuildType({
    template(Powershell_BuildStepFailure_ExitCode0_2.buildTypes.Powershell_BuildStepFailure_ExitCode0_2_ScriptsWithTryCatchBlock)
    uuid = "193ea0cd-231e-4758-8e4c-277d92e7941d"
    extId = "Powershell_BuildStepFailure_ExitCode0_2_PowerShell30"
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_119")
    }
    
    disableSettings("RQ_63")
})
