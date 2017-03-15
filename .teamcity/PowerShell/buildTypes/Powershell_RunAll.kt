package PowerShell.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.ScheduleTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.ScheduleTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.schedule

object Powershell_RunAll : BuildType({
    uuid = "720aa59e-1588-43b2-83e5-1a7662a3c416"
    extId = "Powershell_RunAll"
    name = "_Run All_"


    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    triggers {
        schedule {
            enabled = false
            schedulingPolicy = daily {
            }
            triggerBuild = always()
            withPendingChangesOnly = false
            param("dayOfWeek", "Sunday")
        }
    }

    dependencies {
        dependency(PowerShell_FileWithPowershellUseFile.buildTypes.PowerShell_FileWithPowershellUseFile_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Arguments.buildTypes.Powershell_Arguments_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency("Powershell_Build") {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_BuildStepFailure.buildTypes.Powershell_BuildStepFailure_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_InfiniteLoop.buildTypes.Powershell_InfiniteLoop_SqlcmdExeViaExternalFile) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptFormat.buildTypes.Powershell_ScriptFormatting_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_ScriptOutput.buildTypes.Powershell_ScriptOutput_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_TempScriptDeletion.buildTypes.Powershell_TempScriptDeletion_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency(Powershell_Version.buildTypes.Powershell_Version_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
        dependency("Powershell_WorkingDirectory") {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency("Powershell_WorkingDirectory_CheckWorkingDirectory111") {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
        }
        dependency(Powershell_WorkingDirectory.buildTypes.Powershell_WorkingDirectory_RunAll) {
            snapshot {
                reuseBuilds = ReuseBuilds.NO
            }
        }
    }
})
