package TemporaryScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TemporaryScriptDeletion_TemporaryScriptIsDelete_2 : BuildType({
    templates(TemporaryScriptDeletion_TemporaryScriptIsDeleted)
    name = "Temporary script is deleted on common agent"
    paused = true

    requirements {
        doesNotContain("system.agent.name", "spaces", "RQ_50")
    }
})
