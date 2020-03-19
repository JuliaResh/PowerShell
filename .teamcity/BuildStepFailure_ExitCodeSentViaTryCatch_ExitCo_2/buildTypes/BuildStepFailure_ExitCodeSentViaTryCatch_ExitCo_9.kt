package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_9 : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_10) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_11) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_12) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_13) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitC_14) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
