// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

buildscript {
    repositories {
        maven {
            url=uri("D:/My Downloaded Files/Training/DexGuard-9.7.0/lib");
        }

        dependencies {
            classpath ("com.guardsquare:dexguard-gradle-plugin:9.7.0")
        }
    }
}