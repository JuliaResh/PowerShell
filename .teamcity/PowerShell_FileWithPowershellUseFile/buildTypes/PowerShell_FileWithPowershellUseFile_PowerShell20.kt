package PowerShell_FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object PowerShell_FileWithPowershellUseFile_PowerShell20 : BuildType({
    template(PowerShell_FileWithPowershellUseFile.buildTypes.PowerShell_FileModeWithPowershellUseFile_FileExecutionMode)
    uuid = "665b5e01-10d9-4cfc-a7f9-6054bbaf37ff"
    extId = "PowerShell_FileWithPowershellUseFile_PowerShell20"
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_67")
    }
    
    disableSettings("RQ_16")
})
