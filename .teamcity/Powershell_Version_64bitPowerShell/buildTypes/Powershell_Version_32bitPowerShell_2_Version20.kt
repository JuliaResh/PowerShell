package Powershell_Version_64bitPowerShell.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnText.*
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.failOnText

object Powershell_Version_32bitPowerShell_2_Version20 : BuildType({
    uuid = "74341e5c-ea33-4a00-a4d8-9c5d2424df86"
    extId = "Powershell_Version_32bitPowerShell_2_Version20"
    name = "Version 2.0"
    paused = true


    vcs {
        root(PowerShell.vcsRoots.Powershell_PowerShell)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "External file"
            minVersion = PowerShellStep.Version.v2_0
            platform = PowerShellStep.Platform.x64
            scriptMode = file {
                path = "host.ps1"
            }
            noProfile = false
        }
        powerShell {
            name = "External file with arguments"
            minVersion = PowerShellStep.Version.v2_0
            platform = PowerShellStep.Platform.x64
            scriptMode = file {
                path = "host.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", "arg1 arg2 arg3")
        }
        powerShell {
            name = "Source code"
            minVersion = PowerShellStep.Version.v2_0
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
            pattern = """-Version\,? 2\.0"""
            failureMessage = "version 2.0 was not specified when launching powershell"
            reverse = true
        }
        failOnText {
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = """-Version\,? 2\.0.* arg1\,? arg2\,? arg3"""
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
        contains("teamcity.agent.jvm.os.arch", "86")
    }
})
