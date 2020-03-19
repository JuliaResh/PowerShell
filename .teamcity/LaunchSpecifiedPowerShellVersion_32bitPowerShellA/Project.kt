package LaunchSpecifiedPowerShellVersion_32bitPowerShellA

import LaunchSpecifiedPowerShellVersion_32bitPowerShellA.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("LaunchSpecifiedPowerShellVersion_32bitPowerShellA")
    name = "32-bit PowerShell and 32-bit jvm"

    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShel_3)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShel_2_1)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShel_5)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShellA_1)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShel_4)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShel_7)
    buildType(LaunchSpecifiedPowerShellVersion_32bitPowerShel_6)
})
