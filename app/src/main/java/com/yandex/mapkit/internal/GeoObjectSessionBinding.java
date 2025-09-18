package com.yandex.mapkit.internal;

import com.yandex.mapkit.GeoObjectSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class GeoObjectSessionBinding implements GeoObjectSession {
    private final NativeObject nativeObject;

    public GeoObjectSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.GeoObjectSession
    public native void cancel();

    @Override // com.yandex.mapkit.GeoObjectSession
    public native void retry(GeoObjectSession.GeoObjectListener geoObjectListener);
}
