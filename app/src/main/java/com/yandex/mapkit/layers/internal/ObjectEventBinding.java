package com.yandex.mapkit.layers.internal;

import com.yandex.mapkit.layers.ObjectEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class ObjectEventBinding implements ObjectEvent {
    private final NativeObject nativeObject;

    public ObjectEventBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.layers.ObjectEvent
    public native boolean isValid();
}
