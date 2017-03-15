package Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout

import Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "9ac9f574-e506-49ac-bc90-9add29d15da5"
    extId = "Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout"
    parentId = "Powershell_BuildStepFailure_NonTerminatingErrors"
    name = "Redirect Output to Stdout"

    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerShe)
    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_6)
    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_5)
    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_RunAll)
    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_4)
    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_3)
    buildType(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_PowerS_2)

    template(Powershell_BuildStepFailure_NonTerminatingErrors_RedirectOutputToStdout_SourceCo)
})
