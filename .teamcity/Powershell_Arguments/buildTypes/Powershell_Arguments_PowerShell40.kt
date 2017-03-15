package Powershell_Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_Arguments_PowerShell40 : BuildType({
    template(Powershell_Arguments.buildTypes.Powershell_Arguments_Arguments_2)
    uuid = "ba6a8d4c-8e7e-4010-9dbc-38415212399a"
    extId = "Powershell_Arguments_PowerShell40"
    name = "PowerShell 4.0"
    paused = true

    requirements {
        equals("powershell_x86", "4.0", "RQ_13")
    }
})
