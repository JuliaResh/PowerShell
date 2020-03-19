package PowerShellCore_MacOs.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.PowerShellStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell

object PowerShellCore_MacOs_RunPowerShellScript : BuildType({
    name = "Run PowerShell script"

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {
        powerShell {
            edition = PowerShellStep.Edition.Core
            scriptMode = file {
                path = "argument.ps1"
            }
            noProfile = false
        }
        powerShell {
            scriptMode = file {
                path = "exit1.ps1"
            }
            noProfile = false
        }
        powerShell {
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "filename with spaces.ps1"
            }
            noProfile = false
        }
        powerShell {
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "host.ps1"
            }
            noProfile = false
        }
        powerShell {
            scriptMode = file {
                path = "output_command.ps1"
            }
            noProfile = false
        }
        powerShell {
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "output_file.ps1"
            }
            noProfile = false
        }
        powerShell {
            scriptMode = file {
                path = "week.ps1"
            }
            noProfile = false
        }
        powerShell {
            scriptMode = file {
                path = "weekerr.ps1"
            }
            noProfile = false
        }
        powerShell {
            scriptMode = file {
                path = "write-error.ps1"
            }
            noProfile = false
        }
        powerShell {
            executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
            scriptMode = file {
                path = "write_to_file.ps1"
            }
            noProfile = false
        }
    }
})
