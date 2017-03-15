package PowerShell.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Powershell_PowerShell : GitVcsRoot({
    uuid = "fddf3053-36e4-49d2-b56f-f3c441ed4366"
    extId = "Powershell_PowerShell"
    name = "PowerShell"
    url = "https://github.com/JuliaResh/PowerShell.git"
    authMethod = password {
        userName = "tcqa-repos"
        password = "zxx05da2facb88ca3d90cae6c44a16d5b826b2382dfa2eb434292e2f8fe981f0c7f2d866a997a20b492"
    }
})
