package Powershell_Version_32bitPowerShellAnd64bitJvm

import Powershell_Version_32bitPowerShellAnd64bitJvm.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "bf61d210-ba7b-4f52-a94b-3eead71a5c87"
    extId = "Powershell_Version_32bitPowerShellAnd64bitJvm"
    parentId = "Powershell_Version"
    name = "32-bit PowerShell and 64-bit jvm"

    buildType(Powershell_Version_32bitPowerShellAnd64bitJvm_Version50)
    buildType(Powershell_Version_32bitPowerShellAnd64bitJvm_RunAll)
    buildType(Powershell_Version_32bitPowerShellAnd64bitJvm_VersionAny)
    buildType(Powershell_Version_32bitPowerShellAnd64bitJvm_Version40)
    buildType(Powershell_Version_32bitPowerShellAnd64bitJvm_Version30)
    buildType(Powershell_Version_32bitPowerShellAnd64bitJvm_Version20)
    buildType(Powershell_Version_32bitPowerShellAnd64bitJvm_Version10)
})
