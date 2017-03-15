package Powershell_BuildStepFailure_ExitCodeSentViaTryCatch.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCodeSendViaTryCatch_RunAll : BuildType({
    uuid = "e3ef7d98-0f7e-4cdc-8cba-19907daa4788"
    extId = "Powershell_BuildStepFailure_ExitCodeSendViaTryCatch_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_BuildStepFailure_ExitCode0_2.buildTypes.Powershell_BuildStepFailure_ExitCode0_2_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_ExitCode0.buildTypes.Powershell_BuildStepFailure_ExitCode0_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
