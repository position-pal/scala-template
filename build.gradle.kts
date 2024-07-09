import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    scala
}

allprojects {
    group = "io.github.positionpal"

    repositories {
        mavenCentral()
    }
}

subprojects {
    with(rootProject.libs.plugins) {
        apply(plugin = "scala")
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
}
