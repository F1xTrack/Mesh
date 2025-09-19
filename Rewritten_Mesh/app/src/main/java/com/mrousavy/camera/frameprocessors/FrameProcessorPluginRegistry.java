package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC1374Vq;
import p000.InterfaceC0965PK;
import p000.InterfaceC1042QY;

@Keep
@InterfaceC0965PK
/* loaded from: classes2.dex */
public class FrameProcessorPluginRegistry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Map<String, InterfaceC1042QY> Plugins = new HashMap();
    private static final String TAG = "FrameProcessorPluginRegistry";

    @Keep
    @InterfaceC0965PK
    public static void addFrameProcessorPlugin(String str, InterfaceC1042QY interfaceC1042QY) {
        Plugins.put(str, interfaceC1042QY);
    }

    @Keep
    @InterfaceC0965PK
    public static FrameProcessorPlugin getPlugin(String str, VisionCameraProxy visionCameraProxy, Map<String, Object> map) {
        AbstractC1374Vq.m8597p(Plugins.get(str));
        return null;
    }
}
