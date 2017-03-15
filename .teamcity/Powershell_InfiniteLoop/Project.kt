package Powershell_InfiniteLoop

import Powershell_InfiniteLoop.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "082bcc79-68f9-4c7c-85ba-289c158528bd"
    extId = "Powershell_InfiniteLoop"
    parentId = "PowerShell"
    name = "Infinite Loop"
    description = "TW-17732"

    buildType(BuildType_Powershell_InfiniteLoop)
    buildType(Powershell_InfiniteLoop_SqlcmdExeViaExternalFile)
})
