package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_RunAll : BuildType({
    uuid = "961e8a05-dbb3-4d57-bcc8-c31b2cab6580"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency("Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_2") {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_3) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_4) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_5) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_6) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWith.buildTypes.Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStderr_FileWi_7) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency("Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell10") {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes.Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes.Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell30) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes.Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes.Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell40underNet50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_BuildStepFailure_RedirectOutputToStderr.buildTypes.Powershell_BuildStepFailure_RedirectOutputToStderr_PowerShell50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
