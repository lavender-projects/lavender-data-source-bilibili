@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://maven.aliyun.com/repository/public")
        google()
        mavenCentral()
        maven("https://mirrors.honoka.de/maven-repo")
    }
}

pluginManagement {
    repositories {
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "LavSource bilibili"

include(":app")
