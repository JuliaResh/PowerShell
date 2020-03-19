package LaunchSpecifiedPowerShellVersion_64bitPowerShel_2

import LaunchSpecifiedPowerShellVersion_64bitPowerShel_2.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("LaunchSpecifiedPowerShellVersion_64bitPowerShel_2")
    name = "64-bit PowerShell and 64-bit java"

    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShel_9)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShe_14)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShel_8)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShe_11)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShe_10)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShe_13)
    buildType(LaunchSpecifiedPowerShellVersion_64bitPowerShe_12)

    params {
        param("powershell.keep.generated", "true")
    }
})
