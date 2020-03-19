package TemporaryScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TemporaryScriptDeletion_CheckedOutScriptHasSpaces : BuildType({
    templates(TemporaryScriptDeletion_CheckedOutScriptIsNotDele)
    name = "Checked out script has spaces in name"
    paused = true

    params {
        param("file_name", "filename with spaces.ps1")
    }
})
