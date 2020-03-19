package Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object Arguments_PowerShell40 : BuildType({
    templates(Arguments_ArgumentsChanged)
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_13")
    }
})
