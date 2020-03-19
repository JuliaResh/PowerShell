package LaunchSpecifiedPowerShellVersion_64bitPowerShel_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object LaunchSpecifiedPowerShellVersion_64bitPowerShel_8 : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShe_10) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShe_11) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShe_12) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShe_13) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShe_14) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShel_9) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
    }
})
