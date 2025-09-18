package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import dalvik.annotation.optimization.FastNative;
import java.nio.ByteBuffer;
import p000.InterfaceC0965PK;

/* loaded from: classes2.dex */
public final class SharedArray {

    @Keep
    @InterfaceC0965PK
    private final HybridData mHybridData;

    @Keep
    @InterfaceC0965PK
    private SharedArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @FastNative
    private native HybridData initHybrid(VisionCameraProxy visionCameraProxy, int i);

    @FastNative
    private native HybridData initHybrid(VisionCameraProxy visionCameraProxy, ByteBuffer byteBuffer);

    @FastNative
    public native ByteBuffer getByteBuffer();

    @FastNative
    public native int getSize();
}
