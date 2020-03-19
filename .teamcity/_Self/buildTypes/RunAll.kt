package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.freeDiskSpace
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.schedule

object RunAll : BuildType({
    name = "_Run All_"

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    triggers {
        schedule {
            enabled = false
            triggerBuild = always()
            withPendingChangesOnly = false
            param("revisionRuleBuildBranch", "<default>")
        }
    }

    features {
        freeDiskSpace {
            requiredSpace = "10g"
            failBuild = false
        }
    }

    dependencies {
        snapshot(Arguments.buildTypes.Arguments_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(BuildStepFailure.buildTypes.BuildStepFailure_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(FileWithPowershellUseFile.buildTypes.FileWithPowershellUseFile_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(InfiniteLoop.buildTypes.InfiniteLoop_SqlcmdExeViaExternalFile) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(LaunchSpecifiedPowerShellVersion.buildTypes.LaunchSpecifiedPowerShellVersion_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptFormat.buildTypes.ScriptFormat_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(ScriptOutput.buildTypes.ScriptOutput_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(TemporaryScriptDeletion.buildTypes.TemporaryScriptDeletion_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(WorkingDirectory.buildTypes.WorkingDirectory_RunAll) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(AbsoluteId("Powershell_Build")) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(AbsoluteId("Powershell_WorkingDirectory")) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
        snapshot(AbsoluteId("Powershell_WorkingDirectory_CheckWorkingDirectory111")) {
            reuseBuilds = ReuseBuilds.NO
            onDependencyFailure = FailureAction.FAIL_TO_START
        }
    }
})
