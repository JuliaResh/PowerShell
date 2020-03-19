package BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2_1 : BuildType({
    id("BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2")
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_3) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_4) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_5) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_6) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_7) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
