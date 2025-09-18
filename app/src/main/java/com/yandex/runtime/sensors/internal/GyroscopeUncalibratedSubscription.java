package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class GyroscopeUncalibratedSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public GyroscopeUncalibratedSubscription(NativeObject nativeObject, int i) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 16, i);
    }

    private static native void angularSpeedChanged(NativeObject nativeObject, float f, float f2, float f3, float f4, float f5, float f6, int i, long j, long j2);

    private static native void gyroscopeUncalibratedUnavailable(NativeObject nativeObject);

    public static boolean isGyroscopeUncalibratedAvailable() {
        return SensorSubscription.isSensorAvailable(16);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long jEventNanosToTimestampMills = TimeHelpers.eventNanosToTimestampMills(sensorEvent.timestamp);
        long jEventNanosToMills = TimeHelpers.eventNanosToMills(sensorEvent.timestamp);
        NativeObject nativeObject = this.nativeObject;
        float[] fArr = sensorEvent.values;
        angularSpeedChanged(nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], sensorEvent.accuracy, jEventNanosToTimestampMills, jEventNanosToMills);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        gyroscopeUncalibratedUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
