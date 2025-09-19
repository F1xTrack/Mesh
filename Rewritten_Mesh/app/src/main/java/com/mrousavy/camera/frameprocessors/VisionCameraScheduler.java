package com.mrousavy.camera.frameprocessors;

import android.os.Handler;
import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import java.util.concurrent.ExecutorService;
import p000.AbstractC0492Ho;
import p000.InterfaceC0965PK;
import p000.N61;

/* loaded from: classes2.dex */
public class VisionCameraScheduler {

    @Keep
    @InterfaceC0965PK
    private final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    @InterfaceC0965PK
    private void scheduleTrigger() {
        ExecutorService executorService = AbstractC0492Ho.f4509a;
        ((Handler) AbstractC0492Ho.f4511c.f41679c).post(new N61(11, this));
    }

    public native void trigger();
}
