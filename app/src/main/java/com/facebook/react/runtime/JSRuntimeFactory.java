package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import p000.C7574Fa0;
import p000.O90;

/* loaded from: classes.dex */
public abstract class JSRuntimeFactory {
    private static final C7574Fa0 Companion = new C7574Fa0();
    private final HybridData mHybridData;

    static {
        SoLoader.m11076j("rninstance");
    }

    public JSRuntimeFactory(HybridData hybridData) {
        O90.m5968f(hybridData, "mHybridData");
        this.mHybridData = hybridData;
    }
}
