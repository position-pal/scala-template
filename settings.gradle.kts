plugins {
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "2.0.27"
    id("com.gradle.develocity") version "4.0.2"
}

rootProject.name = "scala-template"

include(
    "entrypoint",
)

develocity {
    buildScan {
        termsOfUseUrl = "https://gradle.com/terms-of-service"
        termsOfUseAgree = "yes"
        uploadInBackground = !System.getenv("CI").toBoolean()
        publishing.onlyIf { it.buildResult.failures.isNotEmpty() }
    }
}

gitHooks {
    commitMsg { conventionalCommits() }
    preCommit {
        tasks("check")
    }
    createHooks(overwriteExisting = true)
}
