package Powershell_Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_Arguments_PowerShell50 : BuildType({
    template(Powershell_Arguments.buildTypes.Powershell_Arguments_Arguments_2)
    uuid = "e3eb34e8-046d-454a-aef4-4b0ebb25f89d"
    extId = "Powershell_Arguments_PowerShell50"
    name = "PowerShell 5.0"
    paused = true

    requirements {
        equals("powershell_x86", "5.0", "RQ_56")
    }
})
