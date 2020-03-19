package LaunchSpecifiedPowerShellVersion_64bitPowerShellA

import LaunchSpecifiedPowerShellVersion_64bitPowerShellA.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("LaunchSpecifiedPowerShellVersion_64bitPowerShellA")
    name = "64-bit PowerShell and 32-bit java"

    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShel_6)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShel_5)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShel_7)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShel_2_1)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShellA_1)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShel_4)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShel_3)

    params {
        param("powershell.keep.generated", "true")
    }
})
