package Powershell_Arguments

import Powershell_Arguments.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "b8c21149-5642-476b-ba41-c3de26b60c01"
    extId = "Powershell_Arguments"
    parentId = "PowerShell"
    name = "Arguments"
    description = "TW-34557, TW-35063, TW-37730"

    buildType(Powershell_Arguments_PowerShell50)
    buildType(Powershell_Arguments_RunAll)
    buildType(Powershell_Arguments_PowerShell20)
    buildType(Powershell_Arguments_PowerShell40)
    buildType(Powershell_Arguments_PowerShell30)

    template(Powershell_Arguments_Arguments_2)
})
