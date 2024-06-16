plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id ("dexguard")
}

dexguard {
    path = "D:/My Downloaded Files/Training/DexGuard-9.7.0"
    license = "D:/My Downloaded Files/Training/DexGuard-9.7.0/dexguard-license.txt"
    configurations {
        register("release") {
            defaultConfiguration("dexguard-release-aggressive.pro")
            defaultConfiguration("dexguard-release.pro")
            configuration("dexguard-project.txt")
        }
        register("debug") {
            defaultConfiguration("dexguard-debug.pro")
        }
    }
}

android {
    namespace = "com.rmldemo.guardsquare"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.rmldemo.guardsquare"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}