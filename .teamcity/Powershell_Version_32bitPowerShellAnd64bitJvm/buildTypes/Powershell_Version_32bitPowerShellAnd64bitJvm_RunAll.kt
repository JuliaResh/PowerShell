package Powershell_Version_32bitPowerShellAnd64bitJvm.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_Version_32bitPowerShellAnd64bitJvm_RunAll : BuildType({
    uuid = "317ecac0-fb34-4f7d-a15f-b949f83641d5"
    extId = "Powershell_Version_32bitPowerShellAnd64bitJvm_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_Version_32bitPowerShellAnd64bitJvm.buildTypes.Powershell_Version_32bitPowerShellAnd64bitJvm_Version10) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_32bitPowerShellAnd64bitJvm.buildTypes.Powershell_Version_32bitPowerShellAnd64bitJvm_Version20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_32bitPowerShellAnd64bitJvm.buildTypes.Powershell_Version_32bitPowerShellAnd64bitJvm_Version30) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_32bitPowerShellAnd64bitJvm.buildTypes.Powershell_Version_32bitPowerShellAnd64bitJvm_Version40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_Version_32bitPowerShellAnd64bitJvm.buildTypes.Powershell_Version_32bitPowerShellAnd64bitJvm_Version50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Version_32bitPowerShellAnd64bitJvm.buildTypes.Powershell_Version_32bitPowerShellAnd64bitJvm_VersionAny) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
    }
})
