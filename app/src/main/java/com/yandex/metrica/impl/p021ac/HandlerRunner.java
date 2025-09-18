package com.yandex.metrica.impl.p021ac;

import android.annotation.SuppressLint;
import com.yandex.metrica.impl.p022ob.C2968U2;
import dalvik.system.PathClassLoader;

/* loaded from: classes2.dex */
public class HandlerRunner {
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    /* renamed from: a */
    private static void m13834a(String str) {
        try {
            String strFindLibrary = new PathClassLoader(System.getProperty("java.class.path"), System.getProperty("java.library.path"), ClassLoader.getSystemClassLoader()).findLibrary(str);
            if (strFindLibrary != null) {
                System.load(strFindLibrary);
            }
        } catch (Throwable unused) {
        }
    }

    public static void main(String[] strArr) {
        if (C2968U2.m15243a(24)) {
            try {
                System.loadLibrary("appmetrica-native-runner");
            } catch (Throwable unused) {
                m13834a("appmetrica-native-runner");
            }
        } else {
            m13834a("appmetrica-native-runner");
        }
        runHandler(strArr);
    }

    private static native void runHandler(String[] strArr);
}
