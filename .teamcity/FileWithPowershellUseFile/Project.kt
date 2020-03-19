package FileWithPowershellUseFile

import FileWithPowershellUseFile.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("FileWithPowershellUseFile")
    name = """"-File" with powershell.use.file"""
    description = "TW-34410"

    buildType(FileWithPowershellUseFile_RunAll)
    buildType(FileWithPowershellUseFile_PowerShell50)
    buildType(FileWithPowershellUseFile_PowerShell40)
    buildType(FileWithPowershellUseFile_PowerShell30)
    buildType(FileWithPowershellUseFile_PowerShell20)

    template(FileWithPowershellUseFile_FileExecutionMode)

    params {
        param("powershell.use.file", "true")
    }

    features {
        feature {
            id = "proj_customGraph1"
            type = "project-graphs"
            param("properties.axis.y.includeZero", "true")
            param("series", """
                [
                  {
                    "type": "valueType",
                    "title": "BuildDuration",
                    "sourceBuildTypeId": "Powershell_RunAll",
                    "key": "BuildDuration"
                  }
                ]
            """.trimIndent())
            param("format", "duration")
            param("properties.axis.y.min", "")
            param("hideFilters", "")
            param("properties.axis.y.type", "default")
            param("title", "Chart title")
            param("defaultFilters", "")
            param("properties.axis.y.max", "")
            param("seriesTitle", "Serie")
        }
        feature {
            id = "proj_customGraph2"
            type = "project-graphs"
            param("series", """
                [
                  {
                    "type": "valueType",
                    "title": "VisibleArtifactsSize",
                    "sourceBuildTypeId": "Powershell_RunAll",
                    "key": "VisibleArtifactsSize"
                  },
                  {
                    "type": "valueType",
                    "title": "ArtifactsResolvingTime",
                    "sourceBuildTypeId": "Powershell_RunAll",
                    "key": "ArtifactsResolvingTime"
                  },
                  {
                    "type": "valueType",
                    "title": "BuildDuration",
                    "sourceBuildTypeId": "Powershell_RunAll",
                    "key": "BuildDuration"
                  },
                  {
                    "type": "valueType",
                    "title": "DuplicatorStats",
                    "sourceBuildTypeId": "Powershell_RunAll",
                    "key": "DuplicatorStats"
                  }
                ]
            """.trimIndent())
            param("format", "integer")
            param("hideFilters", "")
            param("title", "Chart title")
            param("defaultFilters", "")
            param("seriesTitle", "Serie")
        }
        feature {
            id = "proj_customGraph3"
            type = "project-graphs"
            param("series", """
                [
                  {
                    "type": "valueType",
                    "title": "BuildArtifactsPublishingTime",
                    "sourceBuildTypeId": "PowerShell_FileWithPowershellUseFile_RunAll",
                    "key": "BuildArtifactsPublishingTime"
                  },
                  {
                    "type": "valueType",
                    "title": "buildStageDuration:artifactsPublishing",
                    "sourceBuildTypeId": "PowerShell_FileWithPowershellUseFile_RunAll",
                    "key": "buildStageDuration:artifactsPublishing"
                  },
                  {
                    "type": "valueType",
                    "title": "buildStageDuration:artifactsPublishing",
                    "sourceBuildTypeId": "PowerShell_FileWithPowershellUseFile_RunAll",
                    "key": "buildStageDuration:artifactsPublishing"
                  },
                  {
                    "type": "valueType",
                    "title": "BuildTestStatus",
                    "sourceBuildTypeId": "PowerShell_FileWithPowershellUseFile_RunAll",
                    "key": "BuildTestStatus"
                  },
                  {
                    "type": "valueType",
                    "title": "TimeSpentInQueue",
                    "sourceBuildTypeId": "PowerShell_FileWithPowershellUseFile_RunAll",
                    "key": "TimeSpentInQueue"
                  },
                  {
                    "type": "valueType",
                    "title": "BuildTestStatus",
                    "sourceBuildTypeId": "PowerShell_FileWithPowershellUseFile_RunAll",
                    "key": "BuildTestStatus"
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
            id = "proj_customGraph4"
            type = "project-graphs"
            param("series", """
                [
                  {
                    "type": "valueType",
                    "title": "buildStageDuration:artifactsPublishing",
                    "sourceBuildTypeId": "PowerShell_FileWithPowershellUseFile_PowerShell30",
                    "key": "buildStageDuration:artifactsPublishing"
                  }
                ]
            """.trimIndent())
            param("format", "integer")
            param("hideFilters", "")
            param("title", "New chart title")
            param("defaultFilters", "")
            param("seriesTitle", "Serie")
        }
    }
})
