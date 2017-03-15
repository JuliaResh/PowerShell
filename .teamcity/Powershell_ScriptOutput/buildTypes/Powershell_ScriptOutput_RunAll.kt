package Powershell_ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptOutput_RunAll : BuildType({
    uuid = "1aaab1a8-3ed6-4ec5-844a-aab556130752"
    extId = "Powershell_ScriptOutput_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_PowerShell10) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_PowerShell20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_PowerShell30) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_PowerShell40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_PowerShell40underNet50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_PowerShell50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
