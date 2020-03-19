package _Self.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object HttpsGithubComJuliaReshMyProjectGit : GitVcsRoot({
    name = "https://github.com/JuliaResh/My.Project.git"
    url = "https://github.com/JuliaResh/My.Project.git"
    useMirrors = false
})
