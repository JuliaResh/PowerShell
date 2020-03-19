package FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object FileWithPowershellUseFile_PowerShell50 : BuildType({
    templates(FileWithPowershellUseFile_FileExecutionMode)
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_99")
    }
    
    disableSettings("RQ_16")
})
