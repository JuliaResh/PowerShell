package TemporaryScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TemporaryScriptDeletion_RunAll : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(TemporaryScriptDeletion_CheckedOutScriptHasSpaces) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(TemporaryScriptDeletion_CheckedOutScriptIsLaunche) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(TemporaryScriptDeletion_CheckedOutScriptIsNotDe_2) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(TemporaryScriptDeletion_CheckedOutScriptIsNotDe_3) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(TemporaryScriptDeletion_TemporaryScriptIsDelete_2) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(TemporaryScriptDeletion_TemporaryScriptIsDeletedO) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(TemporaryScriptDeletion_TemporaryScriptIsNotDelet) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
