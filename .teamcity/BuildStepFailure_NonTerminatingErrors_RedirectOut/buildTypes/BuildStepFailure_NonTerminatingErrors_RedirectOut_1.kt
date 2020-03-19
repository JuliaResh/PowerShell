package BuildStepFailure_NonTerminatingErrors_RedirectOut.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object BuildStepFailure_NonTerminatingErrors_RedirectOut_1 : BuildType({
    id("BuildStepFailure_NonTerminatingErrors_RedirectOut")
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_3.buildTypes.BuildStepFailure_NonTerminatingErrors_RedirectO_2_1) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_3.buildTypes.BuildStepFailure_NonTerminatingErrors_RedirectO_4_1) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_3.buildTypes.BuildStepFailure_NonTerminatingErrors_RedirectO_5) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_3.buildTypes.BuildStepFailure_NonTerminatingErrors_RedirectO_6) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_3.buildTypes.BuildStepFailure_NonTerminatingErrors_RedirectO_7) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_4.buildTypes.BuildStepFailure_NonTerminatingErrors_RedirectO_9) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_4.buildTypes.BuildStepFailure_NonTerminatingErrors_Redirect_10) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_4.buildTypes.BuildStepFailure_NonTerminatingErrors_Redirect_11) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_4.buildTypes.BuildStepFailure_NonTerminatingErrors_Redirect_12) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure_NonTerminatingErrors_RedirectO_4.buildTypes.BuildStepFailure_NonTerminatingErrors_Redirect_13) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(AbsoluteId("Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_2")) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(AbsoluteId("Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell10")) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
