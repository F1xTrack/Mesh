package com.kimchangyoun.rootbeerFresh;

import p000.AbstractC11918zN1;

/* loaded from: classes2.dex */
public class RootBeerNative {

    /* renamed from: a */
    public static final boolean f19668a;

    static {
        try {
            System.loadLibrary("tool-checker");
            f19668a = true;
        } catch (UnsatisfiedLinkError e) {
            AbstractC11918zN1.m26393a(e);
        }
    }

    public native int checkForMagiskUDS();

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
