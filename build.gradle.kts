import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    id("scala")
    alias(libs.plugins.gradle.scalafmt)
    alias(libs.plugins.gradle.scalafix)
}

allprojects {
    group = "io.github.positionpal"

    with(rootProject.libs.plugins) {
        apply(plugin = "scala")
        apply(plugin = gradle.scalafmt.get().pluginId)
        apply(plugin = gradle.scalafix.get().pluginId)
    }

    repositories {
        mavenCentral()
    }

    with(rootProject.libs) {
        dependencies {
            implementation(scala.library)
            testImplementation(bundles.scala.testing)
        }
    }

    tasks.test {
        useJUnitPlatform {
            includeEngines("scalatest")
        }
        testLogging {
            showCauses = true
            showStackTraces = true
            events(TestLogEvent.FAILED, TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.STARTED)
            exceptionFormat = TestExceptionFormat.FULL
        }
    }

    tasks.withType<ScalaCompile>().configureEach {
        val reportUnusedCompilerOption = "-Wunused:all"
        scalaCompileOptions.additionalParameters = listOf(reportUnusedCompilerOption)
    }

    tasks.check.get().dependsOn("checkScalafmtAll")
}
