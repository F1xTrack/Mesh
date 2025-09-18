package com.yandex.mapkit.location.internal;

import com.yandex.mapkit.location.DummyLocationManager;
import com.yandex.mapkit.location.Location;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class DummyLocationManagerBinding extends LocationManagerBinding implements DummyLocationManager {
    public DummyLocationManagerBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.location.DummyLocationManager
    public native void setLocation(Location location);
}
