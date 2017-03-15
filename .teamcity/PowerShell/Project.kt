package PowerShell

import PowerShell.buildTypes.*
import PowerShell.vcsRoots.*
import PowerShell.vcsRoots.Powershell_PowerShell
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.JiraIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.JiraIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.YouTrackIssueTracker
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.YouTrackIssueTracker.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.jira
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.youtrack

object Project : Project({
    uuid = "ef55c4ef-de32-49fd-bbe5-7aeb132700cf"
    extId = "PowerShell"
    parentId = "DotNet"
    name = "PowerShell"

    vcsRoot(Powershell_HttpsGithubComJuliaReshMyProjectGit)
    vcsRoot(Powershell_PowerShell)

    buildType(Powershell_RunAll)

    features {
        jira {
            id = "PROJECT_EXT_22"
            displayName = "p_TestJira"
            host = "http://tcqa-issue-trackers:8080/"
            userName = "admin"
            password = "zxxee8fb863426ec3c500dceba7ad421baa6f498a2a4a85f9ff"
            projectKeys = "JTCI"
            param("key", "jira1")
        }
        youtrack {
            id = "PROJECT_EXT_23"
            displayName = "p_Julia YT"
            host = "http://unit-539:9000/"
            userName = "root"
            password = "zxxee8fb863426ec3c500dceba7ad421baa6f498a2a4a85f9ff"
            projectExtIds = "TCI"
            param("key", "youtrack1")
        }
        versionedSettings {
            id = "PROJECT_EXT_30"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = Powershell_PowerShell.extId
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
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
})
