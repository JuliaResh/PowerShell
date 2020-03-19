package WorkingDirectory.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object WorkingDirectory_RunAll : BuildType({
    name = "_Run All_"
    paused = true

    vcs {
        checkoutMode = CheckoutMode.ON_SERVER
    }

    dependencies {
        snapshot(WorkingDirectory_AbsolutePathToWorkingDirectory) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(WorkingDirectory_AbsolutePathWithSpaces) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(WorkingDirectory_RelativePathToWorkingDirectory) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(WorkingDirectory_RelativePathWithSpaces) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
