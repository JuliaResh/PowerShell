package Arguments

import Arguments.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Arguments")
    name = "Arguments"
    description = "TW-34557, TW-35063, TW-37730"

    buildType(Arguments_PowerShell40)
    buildType(Arguments_PowerShell50)
    buildType(Arguments_RunAll)
    buildType(Arguments_PowerShell20)
    buildType(Arguments_PowerShell30)

    template(Arguments_ArgumentsChanged)

    subProject(Arguments_DotNetFramework50.Project)
})
