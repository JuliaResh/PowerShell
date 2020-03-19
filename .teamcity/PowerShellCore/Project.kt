package PowerShellCore

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("PowerShellCore")
    name = "PowerShell Core"

    subProject(PowerShellCore_MacOs.Project)
    subProject(PowerShellCore_Windows.Project)
    subProject(PowerShellCore_Ubuntu.Project)
})
