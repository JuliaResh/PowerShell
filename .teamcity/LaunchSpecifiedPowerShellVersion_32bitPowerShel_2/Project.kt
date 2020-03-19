package LaunchSpecifiedPowerShellVersion_32bitPowerShel_2

import LaunchSpecifiedPowerShellVersion_32bitPowerShel_2.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("LaunchSpecifiedPowerShellVersion_32bitPowerShel_2")
    name = "32-bit PowerShell and 64-bit jvm"

    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShe_10)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShe_12)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShe_11)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShe_14)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShe_13)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShel_9)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShel_8)
})
