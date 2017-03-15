package Powershell_Version_64bitPowerShell

import Powershell_Version_64bitPowerShell.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "6ea0f011-8fd9-4848-8fa3-a6a163d41b64"
    extId = "Powershell_Version_64bitPowerShell"
    parentId = "Powershell_Version"
    name = "64-bit PowerShell and 32-bit java"

    buildType(Powershell_Version_64bitPowerShell_Version50)
    buildType(Powershell_Version_32bitPowerShell_2_Version20)
    buildType(Powershell_Version_32bitPowerShell_2_Version10)
    buildType(Powershell_Version_32bitPowerShell_2_Version40)
    buildType(Powershell_Version_32bitPowerShell_2_Version30)
    buildType(Powershell_Version_32bitPowerShell_2_VersionAny)
    buildType(Powershell_Version_32bitPowerShell_2_RunAll)

    params {
        param("powershell.keep.generated", "true")
    }
})
