package Powershell_BuildStepFailure_ExitCode0_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCode0_2_PowerShell50 : BuildType({
    template(Powershell_BuildStepFailure_ExitCode0_2.buildTypes.Powershell_BuildStepFailure_ExitCode0_2_ScriptsWithTryCatchBlock)
    uuid = "e59d3adb-7fb5-4ab7-8372-f1e385f38f95"
    extId = "Powershell_BuildStepFailure_ExitCode0_2_PowerShell50"
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_58")
    }
    
    disableSettings("RQ_63")
})
