package Powershell_Version_64bitPowerShellAnd64bitJava

import Powershell_Version_64bitPowerShellAnd64bitJava.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "d6604c29-2806-4fd2-8d81-ed92e31af479"
    extId = "Powershell_Version_64bitPowerShellAnd64bitJava"
    parentId = "Powershell_Version"
    name = "64-bit PowerShell and 64-bit java"

    buildType(Powershell_Version_64bitPowerShellAnd64bitJava_VersionAny)
    buildType(Powershell_Version_64bitPowerShellAnd64bitJava_Version30)
    buildType(Powershell_Version_64bitPowerShellAnd64bitJava_Version40)
    buildType(Powershell_Version_64bitPowerShellAnd64bitJava_RunAll)
    buildType(Powershell_Version_64bitPowerShellAnd64bitJava_Version50)
    buildType(Powershell_Version_64bitPowerShellAnd64bitJava_Version10)
    buildType(Powershell_Version_64bitPowerShellAnd64bitJava_Version20)

    params {
        param("powershell.keep.generated", "true")
    }
})
