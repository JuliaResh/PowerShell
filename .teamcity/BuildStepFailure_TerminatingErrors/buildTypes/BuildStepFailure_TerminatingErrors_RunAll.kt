package BuildStepFailure_TerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_TerminatingErrors_RunAll : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(BuildStepFailure_TerminatingErrors_PowerShell10) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_TerminatingErrors_PowerShell20) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_TerminatingErrors_PowerShell30) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_TerminatingErrors_PowerShell40) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_TerminatingErrors_PowerShell40un) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_TerminatingErrors_PowerShell50) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
