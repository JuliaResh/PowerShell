package TemporaryScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object TemporaryScriptDeletion_CheckedOutScriptIsNotDe_2 : BuildType({
    templates(TemporaryScriptDeletion_CheckedOutScriptIsNotDele)
    name = "Checked out script is not deleted on agent with spaces in path"
    paused = true

    params {
        param("file_name", """folder with spaces\week.ps1""")
    }

    vcs {
        checkoutDir = """\folder with spaces"""
    }

    requirements {
        contains("system.agent.name", "spaces", "RQ_21")
    }
})
