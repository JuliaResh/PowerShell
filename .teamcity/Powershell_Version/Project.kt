package Powershell_Version

import Powershell_Version.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature
import jetbrains.buildServer.configs.kotlin.v10.ProjectFeature.*

object Project : Project({
    uuid = "859abdd2-c8d4-4cd3-9d0f-d4e2f1350bed"
    extId = "Powershell_Version"
    parentId = "PowerShell"
    name = "Launch Specified PowerShell Version"
    description = "TW-33472"

    buildType(Powershell_Version_RunAll)

    params {
        param("version", "")
    }

    features {
        feature {
            id = "proj_customGraph1"
            type = "project-graphs"
            param("series", """
                [
                  {
                    "type": "valueType",
                    "title": "Build Duration (all stages)",
                    "sourceBuildTypeId": "Powershell_Version_RunAllVersion",
                    "key": "BuildDuration"
                  }
                ]
            """.trimIndent())
            param("format", "integer")
            param("hideFilters", "")
            param("title", "qwedd")
            param("defaultFilters", "")
            param("seriesTitle", "Serie")
        }
    }
})
