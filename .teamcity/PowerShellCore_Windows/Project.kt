package PowerShellCore_Windows

import PowerShellCore_Windows.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("PowerShellCore_Windows")
    name = "Windows"

    buildType(PowerShellCore_Windows_Build)
})
