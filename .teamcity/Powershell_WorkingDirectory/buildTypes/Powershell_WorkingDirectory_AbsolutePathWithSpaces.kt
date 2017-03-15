package Powershell_WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_WorkingDirectory_AbsolutePathWithSpaces : BuildType({
    template(Powershell_WorkingDirectory.buildTypes.Powershell_WorkingDirectory_CheckFileWasCreatedInSpecifiedWorkingDirectory)
    uuid = "95f7e34c-ac36-4e12-b7c8-62e472e7e132"
    extId = "Powershell_WorkingDirectory_AbsolutePathWithSpaces"
    name = "Absolute path with spaces"
    paused = true

    params {
        param("path", """C:\test powershell - %teamcity.agent.ownPort%""")
    }
})
