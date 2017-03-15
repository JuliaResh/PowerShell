package Powershell_Version_64bitPowerShellAnd64bitJava.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_Version_64bitPowerShellAnd64bitJava_RunAll : BuildType({
    uuid = "9c7f0820-c16e-4bca-a32d-4ac2bb48f64d"
    extId = "Powershell_Version_64bitPowerShellAnd64bitJava_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_Version_64bitPowerShellAnd64bitJava.buildTypes.Powershell_Version_64bitPowerShellAnd64bitJava_Version10) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_64bitPowerShellAnd64bitJava.buildTypes.Powershell_Version_64bitPowerShellAnd64bitJava_Version20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_64bitPowerShellAnd64bitJava.buildTypes.Powershell_Version_64bitPowerShellAnd64bitJava_Version30) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Version_64bitPowerShellAnd64bitJava.buildTypes.Powershell_Version_64bitPowerShellAnd64bitJava_Version40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Version_64bitPowerShellAnd64bitJava.buildTypes.Powershell_Version_64bitPowerShellAnd64bitJava_Version50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Version_64bitPowerShellAnd64bitJava.buildTypes.Powershell_Version_64bitPowerShellAnd64bitJava_VersionAny) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
    }
})
