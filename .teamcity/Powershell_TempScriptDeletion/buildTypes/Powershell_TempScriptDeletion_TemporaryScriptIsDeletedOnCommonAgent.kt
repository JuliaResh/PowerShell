package Powershell_TempScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_TempScriptDeletion_TemporaryScriptIsDeletedOnCommonAgent : BuildType({
    template(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_TemporaryScriptIsDeleted)
    uuid = "d87ec4a9-e37f-49ba-9d4b-659bcdd2daf7"
    extId = "Powershell_TempScriptDeletion_TemporaryScriptIsDeletedOnCommonAgent"
    name = "Temporary script is deleted on common agent"
    paused = true

    requirements {
        doesNotContain("system.agent.name", "spaces", "RQ_50")
    }
})
