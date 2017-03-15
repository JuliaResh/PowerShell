package Powershell_Version_64bitPowerShellAnd64bitJava.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText.*
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.failOnText

object Powershell_Version_64bitPowerShellAnd64bitJava_Version10 : BuildType({
    uuid = "9c50c2e4-57bd-4cb7-97e8-45bd8f48296f"
    extId = "Powershell_Version_64bitPowerShellAnd64bitJava_Version10"
    name = "Version 1.0"
    paused = true


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "External file"
            minVersion = PowerShellStep.Version.v1_0
            platform = PowerShellStep.Platform.x64
            scriptMode = file {
                path = "host.ps1"
            }
            noProfile = false
        }
        powerShell {
            name = "External file with arguments"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v1_0
            platform = PowerShellStep.Platform.x64
            scriptMode = file {
                path = "host.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", "arg1 arg2 arg3")
        }
        powerShell {
            name = "Source code"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            minVersion = PowerShellStep.Version.v1_0
            platform = PowerShellStep.Platform.x64
            scriptMode = script {
                content = """
                    ${'$'}PSVersionTable
                    If ([System.IntPtr]::Size -eq 4) { "32-bit" } ElseIf ([System.IntPtr]::Size -eq 8) { "64-bit" } Else {"smth wrong"}
                """.trimIndent()
            }
            noProfile = false
        }
    }

    failureConditions {
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = """-Version\,? 1\.0"""
            failureMessage = "version 1.0 was not specified when launching powershell"
            reverse = true
        }
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = """-Version\,? 1\.0.* arg1\,? arg2\,? arg3"""
            reverse = true
        }
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.CONTAINS
            pattern = "32-bit"
            failureMessage = "failed to launch 64-bit PowerShell"
            reverse = false
        }
    }

    requirements {
        contains("teamcity.agent.jvm.os.arch", "64")
    }
})
