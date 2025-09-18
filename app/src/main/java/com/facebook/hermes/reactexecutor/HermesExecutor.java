package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
public class HermesExecutor extends JavaScriptExecutor {

    /* renamed from: a */
    public static String f17846a;

    static {
        m10901a();
    }

    public HermesExecutor() {
        super(initHybridDefaultConfig(true, ""));
    }

    /* renamed from: a */
    public static void m10901a() {
        if (f17846a == null) {
            SoLoader.m11076j("hermes");
            SoLoader.m11076j("hermes_executor");
            f17846a = "Release";
        }
    }

    private static native HybridData initHybrid(boolean z, String str, long j);

    private static native HybridData initHybridDefaultConfig(boolean z, String str);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public final String getName() {
        return "HermesExecutor" + f17846a;
    }
}
