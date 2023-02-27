allprojects {
    ext {
        set("compose_version", "1.3.3")
    }
}

plugins {
    id("com.android.application") version "7.4.2" apply false
    id("com.android.library") version "7.4.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("org.jlleitschuh.gradle.ktlint") version "11.2.0"
    id("io.sentry.android.gradle") version "3.4.2"
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    repositories {
        mavenCentral()
    }
}
