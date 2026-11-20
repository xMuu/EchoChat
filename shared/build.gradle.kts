plugins {
    id("com.android.library")
    kotlin("multiplatform")
}

kotlin {
    androidTarget()
    jvm()

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}

android {
    namespace = "com.xmuu.echochat.shared"
    compileSdk = 35

    defaultConfig {
        minSdk = 24
    }
}
