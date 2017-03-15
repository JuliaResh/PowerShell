package PowerShell_FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object PowerShell_FileWithPowershellUseFile_PowerShell30 : BuildType({
    template(PowerShell_FileWithPowershellUseFile.buildTypes.PowerShell_FileModeWithPowershellUseFile_FileExecutionMode)
    uuid = "f47a0229-5f56-403a-b8b3-074eca073424"
    extId = "PowerShell_FileWithPowershellUseFile_PowerShell30"
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_105")
    }
    
    disableSettings("RQ_16")
})
