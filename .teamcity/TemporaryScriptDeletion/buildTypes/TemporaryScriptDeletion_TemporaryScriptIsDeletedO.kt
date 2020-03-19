package TemporaryScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TemporaryScriptDeletion_TemporaryScriptIsDeletedO : BuildType({
    templates(TemporaryScriptDeletion_TemporaryScriptIsDeleted)
    name = "Temporary script is deleted on agent with spaces in path"
    paused = true

    requirements {
        contains("system.agent.name", "spaces", "RQ_57")
    }
})
