package com.swmansion.reanimated.keyboard;

import com.facebook.jni.HybridData;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes2.dex */
public class KeyboardWorkletWrapper {

    @InterfaceC0965PK
    private final HybridData mHybridData;

    @InterfaceC0965PK
    private KeyboardWorkletWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void invoke(int i, int i2);
}
