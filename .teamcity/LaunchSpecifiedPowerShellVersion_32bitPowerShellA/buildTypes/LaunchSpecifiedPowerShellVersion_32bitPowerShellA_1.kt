package LaunchSpecifiedPowerShellVersion_32bitPowerShellA.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object LaunchSpecifiedPowerShellVersion_32bitPowerShellA_1 : BuildType({
    id("LaunchSpecifiedPowerShellVersion_32bitPowerShellA")
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShel_2_1) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShel_3) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShel_4) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShel_5) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShel_6) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(LaunchSpecifiedPowerShellVersion_32bitPowerShel_7) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
    }
})
