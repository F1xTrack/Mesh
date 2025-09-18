package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class RotationVectorSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public RotationVectorSubscription(NativeObject nativeObject, int i) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 11, i);
    }

    public static boolean isRotationVectorAvailable() {
        return SensorSubscription.isSensorAvailable(11);
    }

    private static native void rotationVectorChanged(NativeObject nativeObject, float f, float f2, float f3, int i, long j, long j2);

    private static native void rotationVectorChangedScalar(NativeObject nativeObject, float f, float f2, float f3, float f4, int i, long j, long j2);

    private static native void rotationVectorUnavailable(NativeObject nativeObject);

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long jEventNanosToTimestampMills = TimeHelpers.eventNanosToTimestampMills(sensorEvent.timestamp);
        long jEventNanosToMills = TimeHelpers.eventNanosToMills(sensorEvent.timestamp);
        float[] fArr = sensorEvent.values;
        if (fArr.length == 3) {
            rotationVectorChanged(this.nativeObject, fArr[0], fArr[1], fArr[2], sensorEvent.accuracy, jEventNanosToTimestampMills, jEventNanosToMills);
        } else {
            rotationVectorChangedScalar(this.nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], sensorEvent.accuracy, jEventNanosToTimestampMills, jEventNanosToMills);
        }
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        rotationVectorUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
