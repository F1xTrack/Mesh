package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class AccelerometerUncalibratedSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public AccelerometerUncalibratedSubscription(NativeObject nativeObject, int i) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 35, i);
    }

    private static native void accelerationChanged(NativeObject nativeObject, float f, float f2, float f3, float f4, float f5, float f6, int i, long j, long j2);

    private static native void accelerometerUncalibratedUnavailable(NativeObject nativeObject);

    public static boolean isAccelerometerUncalibratedAvailable() {
        return SensorSubscription.isSensorAvailable(35);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long jEventNanosToTimestampMills = TimeHelpers.eventNanosToTimestampMills(sensorEvent.timestamp);
        long jEventNanosToMills = TimeHelpers.eventNanosToMills(sensorEvent.timestamp);
        NativeObject nativeObject = this.nativeObject;
        float[] fArr = sensorEvent.values;
        accelerationChanged(nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], sensorEvent.accuracy, jEventNanosToTimestampMills, jEventNanosToMills);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        accelerometerUncalibratedUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
