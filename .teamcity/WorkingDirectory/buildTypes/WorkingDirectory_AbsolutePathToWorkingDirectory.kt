package WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object WorkingDirectory_AbsolutePathToWorkingDirectory : BuildType({
    templates(WorkingDirectory_CheckFileWasCreatedInSpecifiedWo)
    name = "Absolute path to working directory"
    paused = true

    params {
        param("path", """C:\testpowershell-%teamcity.agent.ownPort%""")
    }
})
