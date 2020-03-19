package TemporaryScriptDeletion

import TemporaryScriptDeletion.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("TemporaryScriptDeletion")
    name = "Temporary Script Deletion"
    description = "TW-35069, TW-36704, TW-22816, TW-21923"

    buildType(TemporaryScriptDeletion_TemporaryScriptIsDeletedO)
    buildType(TemporaryScriptDeletion_RunAll)
    buildType(TemporaryScriptDeletion_CheckedOutScriptIsLaunche)
    buildType(TemporaryScriptDeletion_CheckedOutScriptIsNotDe_2)
    buildType(TemporaryScriptDeletion_CheckedOutScriptIsNotDe_3)
    buildType(TemporaryScriptDeletion_TemporaryScriptIsDelete_2)
    buildType(TemporaryScriptDeletion_CheckedOutScriptHasSpaces)
    buildType(TemporaryScriptDeletion_TemporaryScriptIsNotDelet)

    template(TemporaryScriptDeletion_CheckedOutScriptIsNotDele)
    template(TemporaryScriptDeletion_TemporaryScriptIsDeleted)

    params {
        param("some parameter", "falseytr")
    }
})
