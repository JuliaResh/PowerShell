package Powershell_TempScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeletedOnCommonAgent : BuildType({
    template(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeleted_2)
    uuid = "3d34b872-8541-4b62-b70c-2f90e48aa127"
    extId = "Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeletedOnCommonAgent"
    name = "Checked out script is not deleted on common agent"
    paused = true

    requirements {
        doesNotContain("system.agent.name", "spaces", "RQ_109")
    }
})
