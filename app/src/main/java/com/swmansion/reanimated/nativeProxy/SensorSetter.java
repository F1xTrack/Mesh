package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes2.dex */
public class SensorSetter {

    @InterfaceC0965PK
    private final HybridData mHybridData;

    @InterfaceC0965PK
    private SensorSetter(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void sensorSetter(float[] fArr, int i);
}
