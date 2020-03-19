package ScriptFormat

import ScriptFormat.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("ScriptFormat")
    name = "Script Format"
    description = "TW-31683, TW-36815"

    buildType(ScriptFormat_PowerShell10)
    buildType(ScriptFormat_PowerShell40)
    buildType(ScriptFormat_PowerShell40underNet50)
    buildType(ScriptFormat_PowerShell50)
    buildType(ScriptFormat_PowerShell20)
    buildType(ScriptFormat_PowerShell30)
    buildType(ScriptFormat_RunAll)

    template(ScriptFormat_ScriptOutput)
})
