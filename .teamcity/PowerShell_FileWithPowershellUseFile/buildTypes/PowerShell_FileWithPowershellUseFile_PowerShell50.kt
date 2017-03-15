package PowerShell_FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object PowerShell_FileWithPowershellUseFile_PowerShell50 : BuildType({
    template(PowerShell_FileWithPowershellUseFile.buildTypes.PowerShell_FileModeWithPowershellUseFile_FileExecutionMode)
    uuid = "0cae726b-1898-47d2-84a8-582e6319cbe3"
    extId = "PowerShell_FileWithPowershellUseFile_PowerShell50"
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_99")
    }
    
    disableSettings("RQ_16")
})
