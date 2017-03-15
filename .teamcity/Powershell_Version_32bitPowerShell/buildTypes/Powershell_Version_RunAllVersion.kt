package Powershell_Version_32bitPowerShell.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_Version_RunAllVersion : BuildType({
    uuid = "0e6cea3c-7ec7-4a76-ad4f-91f005086299"
    extId = "Powershell_Version_RunAllVersion"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_Version_32bitPowerShell.buildTypes.Powershell_Version) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_32bitPowerShell.buildTypes.Powershell_Version_32bitPowerShell_Version50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Version_32bitPowerShell.buildTypes.Powershell_Version_Version10) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_32bitPowerShell.buildTypes.Powershell_Version_Version20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_32bitPowerShell.buildTypes.Powershell_Version_Version40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_32bitPowerShell.buildTypes.Powershell_Version_VersionAny) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
    }
})
