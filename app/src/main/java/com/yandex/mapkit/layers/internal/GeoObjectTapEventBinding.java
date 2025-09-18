package com.yandex.mapkit.layers.internal;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.layers.GeoObjectTapEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class GeoObjectTapEventBinding implements GeoObjectTapEvent {
    private final NativeObject nativeObject;

    public GeoObjectTapEventBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.layers.GeoObjectTapEvent
    public native GeoObject getGeoObject();

    @Override // com.yandex.mapkit.layers.GeoObjectTapEvent
    public native boolean isValid();
}
