package Powershell_TempScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_TempScriptDeletion_CheckedOutScriptHasSpacesInName : BuildType({
    template(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeleted_2)
    uuid = "949e37cc-d66f-48cf-80af-f9df36d4e70f"
    extId = "Powershell_TempScriptDeletion_CheckedOutScriptHasSpacesInName"
    name = "Checked out script has spaces in name"
    paused = true

    params {
        param("file_name", "filename with spaces.ps1")
    }
})
