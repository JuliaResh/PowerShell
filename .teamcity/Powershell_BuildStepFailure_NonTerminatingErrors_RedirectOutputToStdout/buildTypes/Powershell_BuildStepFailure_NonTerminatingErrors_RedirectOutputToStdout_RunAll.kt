package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_RunAll : BuildType({
    uuid = "240e4bdd-1e05-4a1c-b298-023a75f7fec6"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_2) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_3) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_4) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_5) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_6) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerShe) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
