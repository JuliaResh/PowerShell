package WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object WorkingDirectory_AbsolutePathWithSpaces : BuildType({
    templates(WorkingDirectory_CheckFileWasCreatedInSpecifiedWo)
    name = "Absolute path with spaces"
    paused = true

    params {
        param("path", """C:\test powershell - %teamcity.agent.ownPort%""")
    }
})
