package LaunchSpecifiedPowerShellVersion.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object LaunchSpecifiedPowerShellVersion_RunAll : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShel_2.buildTypes.LaunchSpecifiedPowerShellVersion_32bitPowerShel_8) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyCancel = FailureAction.ADD_PROBLEM
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShellA.buildTypes.LaunchSpecifiedPowerShellVersion_32bitPowerShellA_1) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyCancel = FailureAction.ADD_PROBLEM
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShel_2.buildTypes.LaunchSpecifiedPowerShellVersion_64bitPowerShel_8) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyCancel = FailureAction.ADD_PROBLEM
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShellA.buildTypes.LaunchSpecifiedPowerShellVersion_64bitPowerShellA_1) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyCancel = FailureAction.ADD_PROBLEM
        }
    }
})
