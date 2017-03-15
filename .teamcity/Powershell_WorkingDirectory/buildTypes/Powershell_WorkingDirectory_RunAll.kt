package Powershell_WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_WorkingDirectory_RunAll : BuildType({
    uuid = "71ae227a-4151-4579-a15c-4d0fccdac4c7"
    extId = "Powershell_WorkingDirectory_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_WorkingDirectory.buildTypes.Powershell_WorkingDirectory_AbsolutePathToWorkingDirectory) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_WorkingDirectory.buildTypes.Powershell_WorkingDirectory_AbsolutePathWithSpaces) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_WorkingDirectory.buildTypes.Powershell_WorkingDirectory_RelativePathToWorkingDirectory) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_WorkingDirectory.buildTypes.Powershell_WorkingDirectory_RelativePathWithSpaces) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
