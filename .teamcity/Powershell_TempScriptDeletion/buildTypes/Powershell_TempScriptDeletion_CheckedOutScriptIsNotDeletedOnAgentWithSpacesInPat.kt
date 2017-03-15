package Powershell_TempScriptDeletion.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeletedOnAgentWithSpacesInPat : BuildType({
    template(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeleted_2)
    uuid = "5325881c-cfbf-4c80-aea0-2b5f1049fa64"
    extId = "Powershell_TempScriptDeletion_CheckedOutScriptIsNotDeletedOnAgentWithSpacesInPat"
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
