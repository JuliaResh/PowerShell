package FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object FileWithPowershellUseFile_PowerShell40 : BuildType({
    templates(FileWithPowershellUseFile_FileExecutionMode)
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_45")
    }
    
    disableSettings("RQ_16")
})
