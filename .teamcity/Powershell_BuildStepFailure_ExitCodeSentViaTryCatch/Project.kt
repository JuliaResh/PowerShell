package Powershell_BuildStepFailure_ExitCodeSentViaTryCatch

import Powershell_BuildStepFailure_ExitCodeSentViaTryCatch.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "050545cb-251c-4f77-9d06-a0fdc054fed0"
    extId = "Powershell_BuildStepFailure_ExitCodeSentViaTryCatch"
    parentId = "Powershell_BuildStepFailure"
    name = "Exit Code Sent via Try Catch"

    buildType(Powershell_BuildStepFailure_ExitCodeSendViaTryCatch_RunAll)
})
