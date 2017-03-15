package Powershell_ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_ScriptFormatting_RunAll : BuildType({
    uuid = "1dd4f14f-49db-44d8-8199-4559a925af0b"
    extId = "Powershell_ScriptFormatting_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormat_PowerShell40underNet50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormat_PowerShell50) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormatting_PowerShell10) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormatting_PowerShell20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormatting_PowerShell30) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormatting_PowerShell40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
