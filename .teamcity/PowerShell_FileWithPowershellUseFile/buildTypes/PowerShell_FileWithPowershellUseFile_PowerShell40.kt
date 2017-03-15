package PowerShell_FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object PowerShell_FileWithPowershellUseFile_PowerShell40 : BuildType({
    template(PowerShell_FileWithPowershellUseFile.buildTypes.PowerShell_FileModeWithPowershellUseFile_FileExecutionMode)
    uuid = "246e204e-3169-4000-837d-090cd89231f6"
    extId = "PowerShell_FileWithPowershellUseFile_PowerShell40"
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_45")
    }
    
    disableSettings("RQ_16")
})
