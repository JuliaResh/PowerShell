package PowerShellCore_MacOs

import PowerShellCore_MacOs.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("PowerShellCore_MacOs")
    name = "Mac OS"

    buildType(PowerShellCore_MacOs_RunPowerShellScript)
})
