buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.2")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.android.library")version "7.1.0" apply false
}
tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
