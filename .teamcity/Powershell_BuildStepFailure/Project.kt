package Powershell_BuildStepFailure

import Powershell_BuildStepFailure.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "b139f199-4abf-4359-8c20-d5880c38eb5c"
    extId = "Powershell_BuildStepFailure"
    parentId = "PowerShell"
    name = "Build Step Failure"
    description = "TW-34410, TW-21554"

    buildType(Powershell_BuildStepFailure_RunAll)
})
