package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import p000.C7028vh;
import p000.InterfaceC0965PK;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\t"}, m22267d2 = {"Lcom/facebook/react/runtime/BindingsInstaller;", "", "Lcom/facebook/jni/HybridData;", "mHybridData", "<init>", "(Lcom/facebook/jni/HybridData;)V", "Lcom/facebook/jni/HybridData;", "Companion", "vh", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public abstract class BindingsInstaller {
    private static final C7028vh Companion = new C7028vh();

    @InterfaceC0965PK
    private final HybridData mHybridData;

    static {
        SoLoader.m11076j("rninstance");
    }

    public BindingsInstaller(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
