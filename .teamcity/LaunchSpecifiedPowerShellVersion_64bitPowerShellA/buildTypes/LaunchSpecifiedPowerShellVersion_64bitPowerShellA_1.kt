package LaunchSpecifiedPowerShellVersion_64bitPowerShellA.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object LaunchSpecifiedPowerShellVersion_64bitPowerShellA_1 : BuildType({
    id("LaunchSpecifiedPowerShellVersion_64bitPowerShellA")
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShel_2_1) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShel_3) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShel_4) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShel_5) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShel_6) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(LaunchSpecifiedPowerShellVersion_64bitPowerShel_7) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
    }
})
