import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    id("com.android.library")
    kotlin("multiplatform")
}

android {
    compileSdk = 33
    namespace = "org.jetbrains.sample.p2"
}

kotlin {
    macosX64()
    androidTarget()
    jvm()

    @OptIn(ExperimentalKotlinGradlePluginApi::class)
    applyDefaultHierarchyTemplate {
        common {
            group("jvmCommon") {
                withJvm()
                withAndroidTarget()
            }
        }
    }

    sourceSets.commonMain.dependencies {
        api(kotlin("test"))
        api(kotlin("test-junit"))
    }
}
