package Powershell_TempScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_TempScriptDeletion_TemporaryScriptIsDeletedOnAgentWithSpacesInPath : BuildType({
    template(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_TemporaryScriptIsDeleted)
    uuid = "1fc88391-fa96-4abd-867b-e3ddd7914542"
    extId = "Powershell_TempScriptDeletion_TemporaryScriptIsDeletedOnAgentWithSpacesInPath"
    name = "Temporary script is deleted on agent with spaces in path"
    paused = true

    requirements {
        contains("system.agent.name", "spaces", "RQ_57")
    }
})
