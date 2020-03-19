package InfiniteLoop

import InfiniteLoop.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("InfiniteLoop")
    name = "Infinite Loop"
    description = "TW-17732"

    buildType(InfiniteLoop_SqlcmdExeInCommandMode)
    buildType(InfiniteLoop_SqlcmdExeViaExternalFile)
})
