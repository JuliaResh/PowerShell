package WorkingDirectory

import WorkingDirectory.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("WorkingDirectory")
    name = "Working Directory"
    description = "TW-35068"

    buildType(WorkingDirectory_AbsolutePathWithSpaces)
    buildType(WorkingDirectory_RunAll)
    buildType(WorkingDirectory_AbsolutePathToWorkingDirectory)
    buildType(WorkingDirectory_RelativePathToWorkingDirectory)
    buildType(WorkingDirectory_RelativePathWithSpaces)

    template(WorkingDirectory_CheckFileWasCreatedInSpecifiedWo)

    params {
        param("path", "")
        param("file", "file.txt")
    }
})
