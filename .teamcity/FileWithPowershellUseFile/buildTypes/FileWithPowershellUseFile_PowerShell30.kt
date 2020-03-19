package FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object FileWithPowershellUseFile_PowerShell30 : BuildType({
    templates(FileWithPowershellUseFile_FileExecutionMode)
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_105")
    }
    
    disableSettings("RQ_16")
})
