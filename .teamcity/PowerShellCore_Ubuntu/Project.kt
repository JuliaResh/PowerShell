package PowerShellCore_Ubuntu

import PowerShellCore_Ubuntu.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("PowerShellCore_Ubuntu")
    name = "Ubuntu"

    buildType(PowerShellCore_Ubuntu_Pester)
})
