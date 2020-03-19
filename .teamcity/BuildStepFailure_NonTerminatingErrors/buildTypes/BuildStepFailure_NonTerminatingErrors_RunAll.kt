package BuildStepFailure_NonTerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_RunAll : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectOut.buildTypes.BuildStepFailure_NonTerminatingErrors_RedirectOut_1) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_2.buildTypes.BuildStepFailure_NonTerminatingErrors_Redirect_15) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
