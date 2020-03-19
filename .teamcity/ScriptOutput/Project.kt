package ScriptOutput

import ScriptOutput.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("ScriptOutput")
    name = "Script Output"
    description = "TW-34775"

    buildType(ScriptOutput_PowerShell10)
    buildType(ScriptOutput_PowerShell20)
    buildType(ScriptOutput_PowerShell30)
    buildType(ScriptOutput_RunAll)
    buildType(ScriptOutput_PowerShell40underNet50)
    buildType(ScriptOutput_PowerShell40)
    buildType(ScriptOutput_PowerShell50)

    template(ScriptOutput_ScriptOutput)
})
