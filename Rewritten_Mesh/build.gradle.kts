// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.google.gms.google-services") version "4.4.1" apply false
    id("com.google.firebase.crashlytics") version "2.9.9" apply false
}

// Global configuration for all subprojects
subprojects {
    afterEvaluate {
        if (hasProperty("android")) {
            configure<com.android.build.gradle.BaseExtension> {
                packagingOptions {
                    pickFirst("**/R.class")
                    pickFirst("**/R$*.class")
                    pickFirst("META-INF/MANIFEST.MF")
                }
            }
        }
        
        // Additional configuration for duplicate classes
        tasks.whenTaskAdded {
            if (name.contains("bundleDebugClassesToCompileJar")) {
                doFirst {
                    // Force clean before bundling
                    delete("$buildDir/intermediates/compile_app_classes_jar")
                }
            }
        }
    }
}