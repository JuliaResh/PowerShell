package Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object Arguments_PowerShell50 : BuildType({
    templates(Arguments_ArgumentsChanged)
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_56")
    }
})
