package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class CxxCallbackImpl implements Callback {

    @InterfaceC0965PK
    private final HybridData mHybridData;

    @InterfaceC0965PK
    private CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void nativeInvoke(NativeArray nativeArray);

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
