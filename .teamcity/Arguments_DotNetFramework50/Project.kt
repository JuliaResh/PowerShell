package Arguments_DotNetFramework50

import Arguments_DotNetFramework50.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Arguments_DotNetFramework50")
    name = "DotNet Framework 5.0"

    buildType(Arguments_DotNetFramework50_PowerShell40launchedU)
    buildType(Arguments_DotNetFramework50_PowerShell30launchedU)
})
