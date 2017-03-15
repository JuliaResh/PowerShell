package Powershell_Version_32bitPowerShell

import Powershell_Version_32bitPowerShell.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "e97505a6-6a8d-4ce8-b513-e3aec77c28d4"
    extId = "Powershell_Version_32bitPowerShell"
    parentId = "Powershell_Version"
    name = "32-bit PowerShell and 32-bit jvm"

    buildType(Powershell_Version_VersionAny)
    buildType(Powershell_Version_Version10)
    buildType(Powershell_Version_Version20)
    buildType(Powershell_Version_Version40)
    buildType(Powershell_Version_RunAllVersion)
    buildType(Powershell_Version)
    buildType(Powershell_Version_32bitPowerShell_Version50)
})
