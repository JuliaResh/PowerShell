package Powershell_Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Powershell_Arguments_PowerShell30 : BuildType({
    template(Powershell_Arguments.buildTypes.Powershell_Arguments_Arguments_2)
    uuid = "050a941b-30f2-400f-b7ad-4f27462b4199"
    extId = "Powershell_Arguments_PowerShell30"
    name = "PowerShell 3.0"
    paused = true

    requirements {
        equals("powershell_x86", "3.0", "RQ_71")
    }
})
