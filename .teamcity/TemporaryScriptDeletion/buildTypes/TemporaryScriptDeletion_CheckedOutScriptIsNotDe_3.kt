package TemporaryScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TemporaryScriptDeletion_CheckedOutScriptIsNotDe_3 : BuildType({
    templates(TemporaryScriptDeletion_CheckedOutScriptIsNotDele)
    name = "Checked out script is not deleted on common agent"
    paused = true

    requirements {
        doesNotContain("system.agent.name", "spaces", "RQ_109")
    }
})
