package WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object WorkingDirectory_RelativePathToWorkingDirectory : BuildType({
    templates(WorkingDirectory_CheckFileWasCreatedInSpecifiedWo)
    name = "Relative path to working directory"
    paused = true

    params {
        param("path", "testpowershell")
    }
})
