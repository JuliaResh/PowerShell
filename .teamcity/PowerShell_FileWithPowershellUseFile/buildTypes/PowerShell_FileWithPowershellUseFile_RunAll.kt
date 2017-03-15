package PowerShell_FileWithPowershellUseFile.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object PowerShell_FileWithPowershellUseFile_RunAll : BuildType({
    uuid = "ad3a812d-9012-488d-a144-db77df239284"
    extId = "PowerShell_FileWithPowershellUseFile_RunAll"
    name = "_Run All_"
    description = "PowerShell 1.0 does not support -File"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(PowerShell_FileWithPowershellUseFile.buildTypes.PowerShell_FileWithPowershellUseFile_PowerShell20) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(PowerShell_FileWithPowershellUseFile.buildTypes.PowerShell_FileWithPowershellUseFile_PowerShell30) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(PowerShell_FileWithPowershellUseFile.buildTypes.PowerShell_FileWithPowershellUseFile_PowerShell40) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
