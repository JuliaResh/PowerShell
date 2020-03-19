package Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object Arguments_PowerShell30 : BuildType({
    templates(Arguments_ArgumentsChanged)
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_71")
    }
})
