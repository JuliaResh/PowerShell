package FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object FileWithPowershellUseFile_PowerShell20 : BuildType({
    templates(FileWithPowershellUseFile_FileExecutionMode)
    name = "PowerShell 2.0"
    paused = true

    requirements {
        equals("powershell_x86", "2.0", "RQ_67")
    }
    
    disableSettings("RQ_16")
})
