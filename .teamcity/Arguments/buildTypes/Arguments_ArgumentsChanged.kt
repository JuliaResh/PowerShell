package Arguments.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.failureConditions.BuildFailureOnText
import jetbrains.buildServer.configs.kotlin.v2019_2.failureConditions.failOnText

object Arguments_ArgumentsChanged : Template({
    name = "Arguments changed"

    vcs {
        root(_Self.vcsRoots.HttpsGithubComJuliaReshMyProjectGit)

        checkoutMode = CheckoutMode.ON_SERVER
    }

    steps {
        powerShell {
            name = "One argument with space A"
            id = "RUNNER_55_A"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """"one test-message"""")
        }
        powerShell {
            name = "One argument with space"
            id = "RUNNER_55"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """"one test-message"""")
        }
        powerShell {
            name = "Two arguments separated by space"
            id = "RUNNER_74"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", "two test-messages")
        }
        powerShell {
            name = "Three arguments separated by new line"
            id = "RUNNER_4"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """
                three 
                test
                messages
            """.trimIndent())
        }
        powerShell {
            name = "Argument with dot"
            id = "RUNNER_7"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """"arg with.dot" 8.1""")
        }
        powerShell {
            name = "With special symbols"
            id = "RUNNER_66"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """
                "^pattern1${'$'}"
                ^pattern2${'$'}
            """.trimIndent())
        }
        powerShell {
            name = "With quotes"
            id = "RUNNER_69"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """
                "some line with ^"quotes^" inside"
                "anotherline with "quotes" inside"
            """.trimIndent())
        }
        powerShell {
            name = "One slash at the end"
            id = "RUNNER_146"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """
                slash\
                "a line with one slash \"
                "another line with one slash \"
            """.trimIndent())
        }
        powerShell {
            name = "Two slashes at the end"
            id = "RUNNER_147"
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
            param("jetbrains_powershell_scriptArguments", """
                slashes\\
                "a line with two slashes \\"
                "a line with two escaped slashes ^\^\"
            """.trimIndent())
        }
        powerShell {
            name = "Two slashes at the end (1)"
            id = "RUNNER_480"
            scriptMode = script {
                content = """
                    "First argument: ${'$'}(${'$'}args[0])"
                    "Second argument: ${'$'}(${'$'}args[1])"
                    "Third argument: ${'$'}(${'$'}args[2])"
                """.trimIndent()
            }
            noProfile = false
            param("jetbrains_powershell_script_file", "argument.ps1")
            param("jetbrains_powershell_scriptArguments", """
                slash\
                "a line with one escaped slash ^\"
                "a line with one slash \"
            """.trimIndent())
        }
    }

    failureConditions {
        failOnText {
            id = "BUILD_EXT_4"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^one test-message${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_9"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^two${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_39"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^test-messages${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_40"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^three${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_41"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^test${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_51"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = "^messages${'$'}"
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_52"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = """^arg with\.dot${'$'}"""
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_10"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = """^\^pattern1\${'$'}${'$'}"""
            reverse = true
        }
        failOnText {
            id = "BUILD_EXT_42"
            conditionType = BuildFailureOnText.ConditionType.REGEXP
            pattern = """^\^pattern2\${'$'}${'$'}"""
            reverse = true
        }
    }
})
