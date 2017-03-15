package Powershell_WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_WorkingDirectory_RelativePathToWorkingDirectory : BuildType({
    template(Powershell_WorkingDirectory.buildTypes.Powershell_WorkingDirectory_CheckFileWasCreatedInSpecifiedWorkingDirectory)
    uuid = "5c8aaafd-ec46-4774-86fc-675a06f00d13"
    extId = "Powershell_WorkingDirectory_RelativePathToWorkingDirectory"
    name = "Relative path to working directory"
    paused = true

    params {
        param("path", "testpowershell")
    }
})
