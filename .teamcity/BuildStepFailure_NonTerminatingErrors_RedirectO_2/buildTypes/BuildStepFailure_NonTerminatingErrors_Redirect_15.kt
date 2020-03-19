package BuildStepFailure_NonTerminatingErrors_RedirectO_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_Redirect_15 : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(BuildStepFailure_NonTerminatingErrors_Redirect_16) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_Redirect_17) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_Redirect_18) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_Redirect_19) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_Redirect_20) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_Redirect_21) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
