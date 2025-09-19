package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import java.util.Map;
import p000.InterfaceC0965PK;

@Keep
@InterfaceC0965PK
/* loaded from: classes2.dex */
public abstract class FrameProcessorPlugin {
    @Keep
    @InterfaceC0965PK
    public abstract Object callback(Frame frame, Map<String, Object> map) throws Throwable;
}
