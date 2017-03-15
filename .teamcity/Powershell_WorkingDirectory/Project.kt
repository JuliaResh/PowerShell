package Powershell_WorkingDirectory

import Powershell_WorkingDirectory.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project

object Project : Project({
    uuid = "0dc35b17-dbe9-4a61-8508-86d1e012e151"
    extId = "Powershell_WorkingDirectory"
    parentId = "PowerShell"
    name = "Working Directory"
    description = "TW-35068"

    buildType(Powershell_WorkingDirectory_AbsolutePathWithSpaces)
    buildType(Powershell_WorkingDirectory_RelativePathWithSpaces)
    buildType(Powershell_WorkingDirectory_RunAll)
    buildType(Powershell_WorkingDirectory_AbsolutePathToWorkingDirectory)
    buildType(Powershell_WorkingDirectory_RelativePathToWorkingDirectory)

    template(Powershell_WorkingDirectory_CheckFileWasCreatedInSpecifiedWorkingDirectory)

    //comment
    params {
        param("file", "file.txt")
        param("path", "")
    }
})
