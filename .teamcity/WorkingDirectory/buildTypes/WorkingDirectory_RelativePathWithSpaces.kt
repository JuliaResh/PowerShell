package WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object WorkingDirectory_RelativePathWithSpaces : BuildType({
    templates(WorkingDirectory_CheckFileWasCreatedInSpecifiedWo)
    name = "Relative path with spaces"
    paused = true

    params {
        param("path", "test powershell")
    }
})
