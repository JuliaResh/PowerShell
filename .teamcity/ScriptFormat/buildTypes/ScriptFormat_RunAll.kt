package ScriptFormat.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptFormat_RunAll : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(ScriptFormat_PowerShell10) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptFormat_PowerShell20) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptFormat_PowerShell30) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptFormat_PowerShell40) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptFormat_PowerShell40underNet50) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptFormat_PowerShell50) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
