package _Self

import _Self.buildTypes.*
import _Self.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.jira
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.youtrack

object Project : Project({

    vcsRoot(HttpsGithubComJuliaReshMyProjectGit)

    buildType(RunAll)

    features {
        jira {
            id = "PROJECT_EXT_22"
            displayName = "p_TestJira"
            host = "http://tcqa-issue-trackers:8080/"
            userName = "admin"
            password = "credentialsJSON:ed376e2e-5802-4a1d-bbf9-130de9d88d65"
            projectKeys = "JTCI"
            param("key", "jira1")
        }
        youtrack {
            id = "PROJECT_EXT_23"
            displayName = "p_Julia YT"
            host = "http://unit-539:9000/"
            userName = "root"
            password = "credentialsJSON:ed376e2e-5802-4a1d-bbf9-130de9d88d65"
            projectExtIds = "TCI"
            param("key", "youtrack1")
        }
        feature {
            id = "proj_customGraph1"
            type = "project-graphs"
            param("series", """
                [
                  {
                    "type": "valueType",
                    "title": "Build Duration (all stages)",
                    "sourceBuildTypeId": "Powershell_RunAll",
                    "key": "BuildDuration"
                  }
                ]
            """.trimIndent())
            param("format", "integer")
            param("hideFilters", "")
            param("title", "New chart title")
            param("defaultFilters", "")
            param("seriesTitle", "Serie")
        }
        feature {
            id = "proj_customGraph2"
            type = "project-graphs"
            param("series", """
                [
                  {
                    "type": "valueType",
                    "title": "Build Duration (all stages)",
                    "sourceBuildTypeId": "PowerShell_FileWithPowershellUseFile_PowerShell30",
                    "key": "BuildDuration"
                  }
                ]
            """.trimIndent())
            param("format", "integer")
            param("hideFilters", "")
            param("title", "Some chart")
            param("defaultFilters", "")
            param("seriesTitle", "Serie")
        }
    }

    subProject(Arguments.Project)
    subProject(TemporaryScriptDeletion.Project)
    subProject(FileWithPowershellUseFile.Project)
    subProject(ScriptOutput.Project)
    subProject(WorkingDirectory.Project)
    subProject(LaunchSpecifiedPowerShellVersion.Project)
    subProject(PowerShellCore.Project)
    subProject(BuildStepFailure.Project)
    subProject(InfiniteLoop.Project)
    subProject(ScriptFormat.Project)
})
