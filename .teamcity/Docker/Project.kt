package Docker

import Docker.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Docker")
    name = "Docker"

    buildType(Docker_Windows)
    buildType(Docker_Linux)
    buildType(Docker_Pester)
    buildType(Docker_CommandLine)
    buildType(Docker_PesterNotDocker)
})
