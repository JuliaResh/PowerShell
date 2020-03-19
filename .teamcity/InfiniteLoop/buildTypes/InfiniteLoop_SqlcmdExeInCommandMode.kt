package InfiniteLoop.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.failureConditions.BuildFailureOnMetric
import jetbrains.buildServer.configs.kotlin.v2019_2.failureConditions.failOnMetricChange

object InfiniteLoop_SqlcmdExeInCommandMode : BuildType({
    name = """Sqlcmd.exe in "-Command-" mode"""
    description = "Infinite loop is expected. Server health report should appear."
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            formatStderrAsError = true
            scriptMode = script {
                content = """
                    sqlcmd -S localhost -d Test -Q "SET NOCOUNT ON"
                    Write-Host "exit code: ${'$'}lastexitcode"
                """.trimIndent()
            }
            scriptExecMode = PowerShellStep.ExecutionMode.STDIN
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
})
