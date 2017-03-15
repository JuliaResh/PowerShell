package Powershell_BuildStepFailure_ExitCode0_2.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCode0_2_RunAll : BuildType({
    uuid = "2e276c9e-f6d8-4a65-b716-2cd910f87256"
    extId = "Powershell_BuildStepFailure_ExitCode0_2_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_BuildStepFailure_ExitCode0_2.buildTypes.Powershell_BuildStepFailure_ExitCode0_2_PowerShell20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_ExitCode0_2.buildTypes.Powershell_BuildStepFailure_ExitCode0_2_PowerShell30) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_ExitCode0_2.buildTypes.Powershell_BuildStepFailure_ExitCode0_2_PowerShell40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_ExitCode0_2.buildTypes.Powershell_BuildStepFailure_ExitCode0_2_PowerShell40underNet50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_ExitCode0_2.buildTypes.Powershell_BuildStepFailure_ExitCode0_2_PowerShell50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
