package Powershell_TempScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_TempScriptDeletion_RunAll : BuildType({
    uuid = "155f76bb-6e36-44d1-aa43-7553786423b5"
    extId = "Powershell_TempScriptDeletion_RunAll"
    name = "_Run All_"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        dependency(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_CheckedOutScriptHasSpacesInName) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_CheckedOutScriptIsLaunchedWithArguments) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeletedOnAgentWithSpacesInPat) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeletedOnCommonAgent) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_TemporaryScriptIsDeletedOnAgentWithSpacesInPath) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_TemporaryScriptIsDeletedOnCommonAgent) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_TemporaryScriptIsNotDeletedWithPowershellKeepGener) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
