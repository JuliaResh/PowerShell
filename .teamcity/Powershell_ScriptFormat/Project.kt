package Powershell_ScriptFormat

import Powershell_ScriptFormat.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "a839965b-5e0a-4fb0-a4e7-c4944e49657b"
    extId = "Powershell_ScriptFormat"
    parentId = "PowerShell"
    name = "Script Format"
    description = "TW-31683, TW-36815"

    buildType(Powershell_ScriptFormatting_PowerShell30)
    buildType(Powershell_ScriptFormatting_PowerShell40)
    buildType(Powershell_ScriptFormatting_PowerShell10)
    buildType(Powershell_ScriptFormatting_PowerShell20)
    buildType(Powershell_ScriptFormatting_RunAll)
    buildType(Powershell_ScriptFormat_PowerShell40underNet50)
    buildType(Powershell_ScriptFormat_PowerShell50)

    template(Powershell_ScriptFormatting_ScriptOutput)
})
