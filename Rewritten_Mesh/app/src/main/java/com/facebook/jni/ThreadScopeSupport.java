package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import p000.C3916dF;

@DoNotStrip
/* loaded from: classes.dex */
public class ThreadScopeSupport {
    static {
        C3916dF.m17513c("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }

    private static native void runStdFunctionImpl(long j);
}
