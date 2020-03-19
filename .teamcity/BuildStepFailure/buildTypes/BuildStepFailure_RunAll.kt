package BuildStepFailure.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_RunAll : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(BuildStepFailure_ExitCodeSentViaTryCatch.buildTypes.BuildStepFailure_ExitCodeSentViaTryCatch_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors.buildTypes.BuildStepFailure_NonTerminatingErrors_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_TerminatingErrors.buildTypes.BuildStepFailure_TerminatingErrors_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(AbsoluteId("Powershell_BuildStepFailure_NonTerminatingErrors_PowerShell10")) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(AbsoluteId("Powershell_BuildStepFailure_NonTerminatingErrors_PowerShell20")) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(AbsoluteId("Powershell_BuildStepFailure_NonTerminatingErrors_PowerShell30")) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(AbsoluteId("Powershell_BuildStepFailure_NonTerminatingErrors_PowerShell40")) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
