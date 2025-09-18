package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* renamed from: Ry0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8246Ry0 implements SensorEventListener {

    /* renamed from: a */
    public final float[] f10504a = new float[16];

    /* renamed from: b */
    public final float[] f10505b = new float[16];

    /* renamed from: c */
    public final float[] f10506c = new float[16];

    /* renamed from: d */
    public final float[] f10507d = new float[3];

    /* renamed from: e */
    public final Display f10508e;

    /* renamed from: f */
    public final InterfaceC8194Qy0[] f10509f;

    /* renamed from: g */
    public boolean f10510g;

    public C8246Ry0(Display display, InterfaceC8194Qy0... interfaceC8194Qy0Arr) {
        this.f10508e = display;
        this.f10509f = interfaceC8194Qy0Arr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f10504a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f10508e.getRotation();
        float[] fArr3 = this.f10505b;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = 130;
                    i = 1;
                }
            } else {
                i = 129;
                i2 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f10507d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z = this.f10510g;
        float[] fArr5 = this.f10506c;
        if (!z) {
            C1338VG.m8339f(fArr5, fArr2);
            this.f10510g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        InterfaceC8194Qy0[] interfaceC8194Qy0Arr = this.f10509f;
        for (int i3 = 0; i3 < 2; i3++) {
            interfaceC8194Qy0Arr[i3].mo244a(f, fArr2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
