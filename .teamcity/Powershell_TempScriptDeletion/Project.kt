package Powershell_TempScriptDeletion

import Powershell_TempScriptDeletion.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "92f90403-1b88-409e-b10b-ed17d2bf3e6e"
    extId = "Powershell_TempScriptDeletion"
    parentId = "PowerShell"
    name = "Temporary Script Deletion"
    description = "TW-35069, TW-36704, TW-22816, TW-21923"

    buildType(Powershell_TempScriptDeletion_CheckedOutScriptHasSpacesInName)
    buildType(Powershell_TempScriptDeletion_TemporaryScriptIsDeletedOnAgentWithSpacesInPath)
    buildType(Powershell_TempScriptDeletion_RunAll)
    buildType(Powershell_TempScriptDeletion_CheckedOutScriptIsLaunchedWithArguments)
    buildType(Powershell_TempScriptDeletion_TemporaryScriptIsNotDeletedWithPowershellKeepGener)
    buildType(Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeletedOnAgentWithSpacesInPat)
    buildType(Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeletedOnCommonAgent)
    buildType(Powershell_TempScriptDeletion_TemporaryScriptIsDeletedOnCommonAgent)

    template(Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeleted_2)
    template(Powershell_TempScriptDeletion_TemporaryScriptIsDeleted)

    params {
        param("some parameter", "falseytr")
    }
})
