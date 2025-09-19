package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import dalvik.annotation.optimization.FastNative;
import p000.InterfaceC0965PK;

/* loaded from: classes2.dex */
public final class FrameProcessor {

    @Keep
    @InterfaceC0965PK
    private final HybridData mHybridData;

    @Keep
    @InterfaceC0965PK
    public FrameProcessor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @FastNative
    public native void call(Frame frame);
}
