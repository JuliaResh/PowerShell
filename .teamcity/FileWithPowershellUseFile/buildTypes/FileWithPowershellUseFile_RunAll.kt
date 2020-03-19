package FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object FileWithPowershellUseFile_RunAll : BuildType({
    name = "_Run All_"
    description = "PowerShell 1.0 does not support -File"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(FileWithPowershellUseFile_PowerShell20) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(FileWithPowershellUseFile_PowerShell30) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(FileWithPowershellUseFile_PowerShell40) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
