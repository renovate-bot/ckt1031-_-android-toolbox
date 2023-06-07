allprojects {
    ext {
        set("compose_version", "1.3.3")
    }
}

plugins {
    id("com.android.application") version "8.0.2" apply false
    id("com.android.library") version "8.0.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("org.jlleitschuh.gradle.ktlint") version "11.4.0"
    id("io.sentry.android.gradle") version "3.10.0"
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    repositories {
        mavenCentral()
    }
}
