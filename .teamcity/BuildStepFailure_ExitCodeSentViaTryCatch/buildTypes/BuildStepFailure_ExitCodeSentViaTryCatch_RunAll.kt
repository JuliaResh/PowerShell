package BuildStepFailure_ExitCodeSentViaTryCatch.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_ExitCodeSentViaTryCatch_RunAll : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCode.buildTypes.BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2_1) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_2.buildTypes.BuildStepFailure_ExitCodeSentViaTryCatch_ExitCo_9) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
