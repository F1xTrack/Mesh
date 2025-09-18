# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# React Native
-keep class com.facebook.react.** { *; }
-keep class com.facebook.jni.** { *; }
-keep class com.facebook.yoga.** { *; }
-keep class com.facebook.fabric.** { *; }
-keep class com.facebook.hermes.** { *; }
-keep class com.facebook.jsc.** { *; }

# React Native Community
-keep class com.reactnativecommunity.** { *; }

# Firebase
-keep class com.google.firebase.** { *; }
-keep class com.google.android.gms.** { *; }

# Huawei HMS
-keep class com.huawei.hms.** { *; }
-keep class com.huawei.agconnect.** { *; }

# RuStore
-keep class ru.rustore.** { *; }

# VK
-keep class com.vk.** { *; }

# Yandex
-keep class com.yandex.** { *; }
-keep class io.appmetrica.** { *; }

# Sentry
-keep class io.sentry.** { *; }

# OkHttp
-keep class okhttp3.** { *; }
-keep class okio.** { *; }

# Glide
-keep class com.bumptech.glide.** { *; }

# Image processing
-keep class com.yalantis.ucrop.** { *; }

# Maps
-keep class com.yandex.runtime.** { *; }

# ML Kit
-keep class com.google.mlkit.** { *; }

# Camera
-keep class androidx.camera.** { *; }

# Biometric
-keep class androidx.biometric.** { *; }

# Room
-keep class androidx.room.** { *; }

# Work Manager
-keep class androidx.work.** { *; }

# Keep native methods
-keepclasseswithmembernames class * {
    native <methods>;
}

# Keep serializable classes
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# Keep enums
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Keep Parcelable
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# Keep R class
-keep class **.R
-keep class **.R$* {
    <fields>;
}

# Keep BuildConfig
-keep class **.BuildConfig

# Keep application class
-keep class ru.mes.dnevnik.MainApplication
-keep class ru.mes.dnevnik.MainActivity

# Keep all classes in the main package
-keep class ru.mes.dnevnik.** { *; }

# Remove logging
-assumenosideeffects class android.util.Log {
    public static boolean isLoggable(java.lang.String, int);
    public static int v(...);
    public static int i(...);
    public static int w(...);
    public static int d(...);
    public static int e(...);
}

# Remove System.out.println
-assumenosideeffects class java.io.PrintStream {
    public void println(%);
    public void println(**);
}