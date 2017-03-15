package Powershell_WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_WorkingDirectory_RelativePathWithSpaces : BuildType({
    template(Powershell_WorkingDirectory.buildTypes.Powershell_WorkingDirectory_CheckFileWasCreatedInSpecifiedWorkingDirectory)
    uuid = "4d0e6f33-4cd6-4318-9141-9f3c42d6cea5"
    extId = "Powershell_WorkingDirectory_RelativePathWithSpaces"
    name = "Relative path with spaces"
    paused = true

    params {
        param("path", "test powershell")
    }
})
