package Powershell_InfiniteLoop.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.PowerShellStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnMetric
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.BuildFailureOnMetric.*
import jetbrains.buildServer.configs.kotlin.v10.failureConditions.failOnMetricChange

object Powershell_InfiniteLoop_SqlcmdExeViaExternalFile : BuildType({
    uuid = "019dbd8c-26a3-4b5e-bd49-9a362438390a"
    extId = "Powershell_InfiniteLoop_SqlcmdExeViaExternalFile"
    name = "Sqlcmd.exe via external file"
    description = "Should be no loop"
    paused = true


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            scriptMode = script {
                content = """
                    & sqlcmd -S unit-539:3306 -d Test -Q "SET NOCOUNT ON"
                    Write-Host "exit code: ${'$'}lastexitcode"
                """.trimIndent()
            }
            noProfile = false
        }
    }

    failureConditions {
        failOnMetricChange {
            metric = BuildFailureOnMetric.MetricType.BUILD_DURATION
            threshold = 30
            units = BuildFailureOnMetric.MetricUnit.DEFAULT_UNIT
            comparison = BuildFailureOnMetric.MetricComparison.MORE
            compareTo = value()
            param("anchorBuild", "lastSuccessful")
        }
    }

    requirements {
        equals("teamcity.agent.name", "UNIT-539")
    }
})
