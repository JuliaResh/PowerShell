package Powershell_ScriptOutput

import Powershell_ScriptOutput.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "1031bc65-1ba7-410e-8d4e-754ef203d189"
    extId = "Powershell_ScriptOutput"
    parentId = "PowerShell"
    name = "Script Output"
    description = "TW-34775"

    buildType(Powershell_ScriptOutput_PowerShell10)
    buildType(Powershell_ScriptOutput_PowerShell40underNet50)
    buildType(Powershell_ScriptOutput_PowerShell20)
    buildType(Powershell_ScriptOutput_RunAll)
    buildType(Powershell_ScriptOutput_PowerShell50)
    buildType(Powershell_ScriptOutput_PowerShell30)
    buildType(Powershell_ScriptOutput_PowerShell40)

    template(Powershell_ScriptOutput_ScriptOutput)
})
