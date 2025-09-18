package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
public abstract class NativeArray implements NativeArrayInterface {

    @InterfaceC0965PK
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.NativeArrayInterface
    public native String toString();
}
