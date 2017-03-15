package Powershell_Arguments_DotNetFramework50

import Powershell_Arguments_DotNetFramework50.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "38bd75b4-ab01-4e14-ac05-5739fdd42758"
    extId = "Powershell_Arguments_DotNetFramework50"
    parentId = "Powershell_Arguments"
    name = "DotNet Framework 5.0"

    buildType(Powershell_Arguments_DotNetFramework50_PowerShell30launchedUnderNet50)
    buildType(Powershell_Arguments_DotNetFramework50_PowerShell40launchedUnderNet50)
})
