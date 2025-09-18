package com.yandex.runtime.view.internal;

import android.view.Surface;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class PlatformVulkanRenderer {
    private NativeObject nativeObject;

    public PlatformVulkanRenderer(boolean z) {
        this.nativeObject = null;
        this.nativeObject = createNative(z);
    }

    private static native NativeObject createNative(boolean z);

    public native boolean isDebugModeEnabled();

    public native void surfaceChanged(Surface surface, int i, int i2);

    public native void surfaceCreated(Surface surface, int i, int i2);

    public native void surfaceDestroyed(Surface surface);
}
