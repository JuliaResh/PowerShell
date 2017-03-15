package Powershell_Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_Arguments_RunAll : BuildType({
    uuid = "fbb8ca83-1b91-479d-9b99-711ed71dc092"
    extId = "Powershell_Arguments_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_Arguments_DotNetFramework50.buildTypes.Powershell_Arguments_DotNetFramework50_PowerShell30launchedUnderNet50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Arguments_DotNetFramework50.buildTypes.Powershell_Arguments_DotNetFramework50_PowerShell40launchedUnderNet50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Arguments.buildTypes.Powershell_Arguments_PowerShell20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Arguments.buildTypes.Powershell_Arguments_PowerShell30) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Arguments.buildTypes.Powershell_Arguments_PowerShell40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Arguments.buildTypes.Powershell_Arguments_PowerShell50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
