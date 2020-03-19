package Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object Arguments_RunAll : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(Arguments_DotNetFramework50.buildTypes.Arguments_DotNetFramework50_PowerShell30launchedU) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(Arguments_DotNetFramework50.buildTypes.Arguments_DotNetFramework50_PowerShell40launchedU) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(Arguments_PowerShell20) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(Arguments_PowerShell30) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(Arguments_PowerShell40) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(Arguments_PowerShell50) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
