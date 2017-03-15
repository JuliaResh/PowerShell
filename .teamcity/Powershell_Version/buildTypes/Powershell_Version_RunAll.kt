package Powershell_Version.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_Version_RunAll : BuildType({
    uuid = "1d31be88-f8bf-4f74-a2bb-b154559b0289"
    extId = "Powershell_Version_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_Version_32bitPowerShellAnd64bitJvm.buildTypes.Powershell_Version_32bitPowerShellAnd64bitJvm_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyCancel = FailureAction.ADD_PROBLEM
            }
        }
        dependency(Powershell_Version_64bitPowerShell.buildTypes.Powershell_Version_32bitPowerShell_2_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyCancel = FailureAction.ADD_PROBLEM
            }
        }
        dependency(Powershell_Version_64bitPowerShellAnd64bitJava.buildTypes.Powershell_Version_64bitPowerShellAnd64bitJava_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyCancel = FailureAction.ADD_PROBLEM
            }
        }
        dependency(Powershell_Version_32bitPowerShell.buildTypes.Powershell_Version_RunAllVersion) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyCancel = FailureAction.ADD_PROBLEM
            }
        }
    }
})
