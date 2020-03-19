package LaunchSpecifiedPowerShellVersion

import LaunchSpecifiedPowerShellVersion.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("LaunchSpecifiedPowerShellVersion")
    name = "Launch Specified PowerShell Version"
    description = "TW-33472"

    buildType(LaunchSpecifiedPowerShellVersion_RunAll)

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

    subProject(LaunchSpecifiedPowerShellVersion_32bitPowerShel_2.Project)
    subProject(LaunchSpecifiedPowerShellVersion_32bitPowerShellA.Project)
    subProject(LaunchSpecifiedPowerShellVersion_64bitPowerShel_2.Project)
    subProject(LaunchSpecifiedPowerShellVersion_64bitPowerShellA.Project)
})
