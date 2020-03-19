package BuildStepFailure_NonTerminatingErrors_RedirectO_3.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object BuildStepFailure_NonTerminatingErrors_RedirectO_3_1 : Template({
    id("BuildStepFailure_NonTerminatingErrors_RedirectO_3")
    name = "File with Write-Error"

    params {
        param("buildFailing", "true")
    }

    vcs {
        root(DslContext.settingsRoot)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "Write-Error"
            id = "RUNNER_30"
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            formatStderrAsError = true
            scriptMode = file {
                path = "write-error.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_script_code", """
                Write-Output "Foo"
                Not-Found "With parameter"
                Write-Output "After"
            """.trimIndent())
        }
        powerShell {
            name = "Check that build status is failing"
            id = "RUNNER_31"
            enabled = false
            scriptMode = script {
                content = """
                    if( ${'$'}Host -and ${'$'}Host.UI -and ${'$'}Host.UI.RawUI ) {
                      ${'$'}rawUI = ${'$'}Host.UI.RawUI
                      ${'$'}oldSize = ${'$'}rawUI.BufferSize
                      ${'$'}typeName = ${'$'}oldSize.GetType( ).FullName
                      ${'$'}newSize = New-Object ${'$'}typeName (500, ${'$'}oldSize.Height)
                      ${'$'}rawUI.BufferSize = ${'$'}newSize
                    }
                    
                    ${'$'}url = "%teamcity.serverUrl%/guestAuth/app/rest/builds/%teamcity.build.id%/status"
                    ${'$'}client = New-Object System.Net.WebCLient
                    ${'$'}buildStatus = ${'$'}client.DownloadString(${'$'}url)
                    
                    if (${'$'}buildStatus -eq "FAILURE")  {
                        Write-Output "##teamcity[buildStatus status='SUCCESS']"
                    } else {
                        Write-Output "##teamcity[buildStatus status='FAILURE' text='{build.status.text} build failure condition did not fire']"
                    }
                """.trimIndent()
            }
            noProfile = false
        }
        script {
            id = "RUNNER_609"
            executionMode = BuildStep.ExecutionMode.RUN_ON_SUCCESS
            scriptContent = """
                echo ##teamcity[setParameter name='buildFailing' value='false']
                exit 0
            """.trimIndent()
        }
        powerShell {
            name = "Check that build status is failing 2"
            id = "RUNNER_610"
            scriptMode = script {
                content = """
                    if ("%buildFailing%" -eq "true")  {
                        Write-Output "##teamcity[buildStatus status='SUCCESS']"
                    } else {
                        Write-Output "##teamcity[buildStatus status='FAILURE' text='{build.status.text} build failure condition did not fire']"
                    }
                """.trimIndent()
            }
            noProfile = false
        }
    }

    failureConditions {
        testFailure = false
        nonZeroExitCode = false
        errorMessage = true
    }

    features {
        swabra {
            id = "swabra"
            enabled = false
            forceCleanCheckout = true
        }
    }

    requirements {
        equals("powershell_x86", "", "RQ_126")
    }
})
