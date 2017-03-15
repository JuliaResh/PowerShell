package Powershell_BuildStepFailure_NonTerminatingErrors.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RunAll : BuildType({
    uuid = "434e0a8b-c0b3-44df-b0fe-5dd6a06d04bb"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
