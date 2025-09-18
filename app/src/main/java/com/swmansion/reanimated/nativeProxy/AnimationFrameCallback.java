package com.swmansion.reanimated.nativeProxy;

import com.facebook.jni.HybridData;
import com.swmansion.reanimated.NodesManager;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes2.dex */
public class AnimationFrameCallback implements NodesManager.OnAnimationFrame {

    @InterfaceC0965PK
    private final HybridData mHybridData;

    @InterfaceC0965PK
    private AnimationFrameCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.swmansion.reanimated.NodesManager.OnAnimationFrame
    public native void onAnimationFrame(double d);
}
