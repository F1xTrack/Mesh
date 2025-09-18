package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.reactperflogger.NativeModulePerfLogger;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
class TurboModulePerfLogger {
    private static NativeModulePerfLogger sNativeModulePerfLogger;

    static {
        NativeModuleSoLoader.maybeLoadSoLibrary();
    }

    public static void enableLogging(NativeModulePerfLogger nativeModulePerfLogger) {
        if (nativeModulePerfLogger != null) {
            sNativeModulePerfLogger = nativeModulePerfLogger;
            jniEnableCppLogging(nativeModulePerfLogger);
        }
    }

    private static native void jniEnableCppLogging(NativeModulePerfLogger nativeModulePerfLogger);

    public static void moduleCreateCacheHit(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m11028a();
        }
    }

    public static void moduleCreateConstructEnd(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m11029b();
        }
    }

    public static void moduleCreateConstructStart(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m11030c();
        }
    }

    public static void moduleCreateEnd(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m11031d();
        }
    }

    public static void moduleCreateFail(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m11032e();
        }
    }

    public static void moduleCreateSetUpEnd(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m11033f();
        }
    }

    public static void moduleCreateSetUpStart(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m11034g();
        }
    }

    public static void moduleCreateStart(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m11035h();
        }
    }

    public static void moduleDataCreateEnd(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m11036i();
        }
    }

    public static void moduleDataCreateStart(String str, int i) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m11037j();
        }
    }
}
