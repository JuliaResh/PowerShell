package Powershell_BuildStepFailure_ExitCode0.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_ExitCode0_RunAll : BuildType({
    uuid = "45972f83-fc62-4111-a2c7-e06d68fac042"
    extId = "Powershell_BuildStepFailure_ExitCode0_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_BuildStepFailure_ExitCode0.buildTypes.Powershell_BuildStepFailure_ExitCode0_PowerShell20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_ExitCode0.buildTypes.Powershell_BuildStepFailure_ExitCode0_PowerShell30) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_ExitCode0.buildTypes.Powershell_BuildStepFailure_ExitCode0_PowerShell40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_ExitCode0.buildTypes.Powershell_BuildStepFailure_ExitCode0_PowerShell40underNet50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_ExitCode0.buildTypes.Powershell_BuildStepFailure_ExitCode0_PowerShell50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
