package PowerShell.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Powershell_HttpsGithubComJuliaReshMyProjectGit : GitVcsRoot({
    uuid = "f3c8196b-672a-4eb1-9199-c3b9d9b5d836"
    extId = "Powershell_HttpsGithubComJuliaReshMyProjectGit"
    name = "https://github.com/JuliaResh/My.Project.git"
    url = "https://github.com/JuliaResh/My.Project.git"
    useMirrors = false
})
