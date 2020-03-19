package ScriptOutput.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object ScriptOutput_RunAll : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(ScriptOutput_PowerShell10) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptOutput_PowerShell20) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptOutput_PowerShell30) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptOutput_PowerShell40) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptOutput_PowerShell40underNet50) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptOutput_PowerShell50) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
