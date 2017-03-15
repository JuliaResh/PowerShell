package Powershell_Version_64bitPowerShell.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_Version_32bitPowerShell_2_RunAll : BuildType({
    uuid = "54e50f34-614b-4c62-835c-32a0efc44c9a"
    extId = "Powershell_Version_32bitPowerShell_2_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_Version_64bitPowerShell.buildTypes.Powershell_Version_32bitPowerShell_2_Version10) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_64bitPowerShell.buildTypes.Powershell_Version_32bitPowerShell_2_Version20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_64bitPowerShell.buildTypes.Powershell_Version_32bitPowerShell_2_Version30) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_64bitPowerShell.buildTypes.Powershell_Version_32bitPowerShell_2_Version40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_64bitPowerShell.buildTypes.Powershell_Version_32bitPowerShell_2_VersionAny) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_64bitPowerShell.buildTypes.Powershell_Version_64bitPowerShell_Version50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
