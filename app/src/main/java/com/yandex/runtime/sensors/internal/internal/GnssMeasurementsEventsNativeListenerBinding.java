package com.yandex.runtime.sensors.internal.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.sensors.internal.GnssMeasurementsEvent;
import com.yandex.runtime.sensors.internal.GnssMeasurementsEventsNativeListener;

/* loaded from: classes2.dex */
public class GnssMeasurementsEventsNativeListenerBinding implements GnssMeasurementsEventsNativeListener {
    private final NativeObject nativeObject;

    public GnssMeasurementsEventsNativeListenerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.sensors.internal.GnssMeasurementsEventsNativeListener
    public native void onGnssMeasurementsEvent(GnssMeasurementsEvent gnssMeasurementsEvent);
}
