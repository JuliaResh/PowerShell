package Powershell_BuildStepFailure.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_RunAll : BuildType({
    uuid = "c0814daf-2460-4c78-845a-fda7ff454deb"
    extId = "Powershell_BuildStepFailure_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_BuildStepFailure_ExitCodeSentViaTryCatch.buildTypes.Powershell_BuildStepFailure_ExitCodeSendViaTryCatch_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency("Powershell_BuildStepFailure_NonTerminatingErrors_PowerShell10") {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency("Powershell_BuildStepFailure_NonTerminatingErrors_PowerShell20") {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency("Powershell_BuildStepFailure_NonTerminatingErrors_PowerShell30") {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency("Powershell_BuildStepFailure_NonTerminatingErrors_PowerShell40") {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_TerminatingErrors.buildTypes.Powershell_BuildStepFailure_TerminatingErrors_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
