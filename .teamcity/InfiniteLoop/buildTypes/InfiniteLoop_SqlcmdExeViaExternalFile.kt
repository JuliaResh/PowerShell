package InfiniteLoop.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.failureConditions.BuildFailureOnMetric
import jetbrains.buildServer.configs.kotlin.v2019_2.failureConditions.failOnMetricChange

object InfiniteLoop_SqlcmdExeViaExternalFile : BuildType({
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
