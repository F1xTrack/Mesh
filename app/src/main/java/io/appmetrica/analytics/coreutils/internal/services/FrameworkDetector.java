package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* loaded from: classes2.dex */
public class FrameworkDetector {

    /* renamed from: a */
    private static final String f29738a = new FrameworkDetector().detectFramework();

    public static String framework() {
        return f29738a;
    }

    public String detectFramework() {
        return ReflectionUtils.detectClassExists("com.unity3d.player.UnityPlayer") ? "unity" : ReflectionUtils.detectClassExists("mono.MonoPackageManager") ? "xamarin" : ReflectionUtils.detectClassExists("org.apache.cordova.CordovaPlugin") ? "cordova" : ReflectionUtils.detectClassExists("com.facebook.react.ReactRootView") ? "react" : ReflectionUtils.detectClassExists("io.flutter.embedding.engine.FlutterEngine") ? "flutter" : "native";
    }
}
