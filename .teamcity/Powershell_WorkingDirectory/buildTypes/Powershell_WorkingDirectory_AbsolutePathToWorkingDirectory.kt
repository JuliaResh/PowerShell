package Powershell_WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_WorkingDirectory_AbsolutePathToWorkingDirectory : BuildType({
    template(Powershell_WorkingDirectory.buildTypes.Powershell_WorkingDirectory_CheckFileWasCreatedInSpecifiedWorkingDirectory)
    uuid = "93b695fe-7023-4fbf-a31a-745a3dbe7198"
    extId = "Powershell_WorkingDirectory_AbsolutePathToWorkingDirectory"
    name = "Absolute path to working directory"
    paused = true

    params {
        param("path", """C:\testpowershell-%teamcity.agent.ownPort%""")
    }
})
