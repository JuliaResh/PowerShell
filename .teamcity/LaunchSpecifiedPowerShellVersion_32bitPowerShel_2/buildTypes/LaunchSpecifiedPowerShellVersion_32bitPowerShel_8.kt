package LaunchSpecifiedPowerShellVersion_32bitPowerShel_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object LaunchSpecifiedPowerShellVersion_32bitPowerShel_8 : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShe_10) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShe_11) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShe_12) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShe_13) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShe_14) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShel_9) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
    }
})
