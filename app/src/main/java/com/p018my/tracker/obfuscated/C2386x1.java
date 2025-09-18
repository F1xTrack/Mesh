package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.p018my.tracker.config.AntiFraudConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p000.RunnableC7147xa;
import p000.RunnableC7775Iw1;

/* renamed from: com.my.tracker.obfuscated.x1 */
/* loaded from: classes2.dex */
public final class C2386x1 {

    /* renamed from: b */
    final C2313f0 f20149b;

    /* renamed from: c */
    final AntiFraudConfig f20150c;

    /* renamed from: d */
    final Context f20151d;

    /* renamed from: e */
    a f20152e;

    /* renamed from: f */
    Runnable f20153f;

    /* renamed from: g */
    Runnable f20154g;

    /* renamed from: a */
    final AtomicInteger f20148a = new AtomicInteger();

    /* renamed from: h */
    long f20155h = -1;

    /* renamed from: com.my.tracker.obfuscated.x1$a */
    public static final class a implements SensorEventListener {

        /* renamed from: a */
        private final C2313f0 f20156a;

        /* renamed from: b */
        private final SensorManager f20157b;

        /* renamed from: c */
        private final AntiFraudConfig f20158c;

        /* renamed from: d */
        private final ArrayList f20159d = new ArrayList();

        public a(C2313f0 c2313f0, SensorManager sensorManager, AntiFraudConfig antiFraudConfig) {
            this.f20156a = c2313f0;
            this.f20157b = sensorManager;
            this.f20158c = antiFraudConfig;
        }

        /* renamed from: a */
        public static a m13544a(C2313f0 c2313f0, Context context, AntiFraudConfig antiFraudConfig) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager == null) {
                return null;
            }
            return new a(c2313f0, sensorManager, antiFraudConfig);
        }

        /* renamed from: b */
        public void m13546b() {
            AbstractC2391y2.m13568a("SensorEventListenerImpl: stop()");
            Iterator it = this.f20159d.iterator();
            while (it.hasNext()) {
                try {
                    this.f20157b.unregisterListener(this, (Sensor) it.next());
                } catch (Throwable th) {
                    AbstractC2391y2.m13568a("SensorEventListenerImpl: exception at unregister listener: " + th);
                }
            }
            this.f20159d.clear();
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            StringBuilder sb;
            float f;
            int type = sensorEvent.sensor.getType();
            if (type == 2) {
                C2313f0 c2313f0 = this.f20156a;
                float[] fArr = sensorEvent.values;
                c2313f0.m13075b(fArr[0], fArr[1], fArr[2]);
                sb = new StringBuilder("SensorHandler: magnetometer - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f = sensorEvent.values[2];
            } else if (type == 8) {
                this.f20156a.m13082c(sensorEvent.values[0]);
                sb = new StringBuilder("SensorHandler: proximity - ");
                f = sensorEvent.values[0];
            } else if (type == 4) {
                C2313f0 c2313f02 = this.f20156a;
                float[] fArr2 = sensorEvent.values;
                c2313f02.m13054a(fArr2[0], fArr2[1], fArr2[2]);
                sb = new StringBuilder("SensorHandler: gyroscope - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f = sensorEvent.values[2];
            } else if (type == 5) {
                this.f20156a.m13053a(sensorEvent.values[0]);
                sb = new StringBuilder("SensorHandler: light - ");
                f = sensorEvent.values[0];
            } else {
                if (type != 6) {
                    return;
                }
                this.f20156a.m13074b(sensorEvent.values[0]);
                sb = new StringBuilder("SensorHandler: pressure - ");
                f = sensorEvent.values[0];
            }
            sb.append(f);
            AbstractC2391y2.m13568a(sb.toString());
        }

        /* renamed from: a */
        public void m13545a() {
            AbstractC2391y2.m13568a("SensorEventListenerImpl: start()");
            int[] iArr = {5, 2, 4, 6, 8};
            for (int i = 0; i < 5; i++) {
                int i2 = iArr[i];
                if ((i2 != 5 || this.f20158c.useLightSensor) && ((i2 != 2 || this.f20158c.useMagneticFieldSensor) && ((i2 != 4 || this.f20158c.useGyroscope) && ((i2 != 6 || this.f20158c.usePressureSensor) && (i2 != 8 || this.f20158c.useProximitySensor))))) {
                    try {
                        Sensor defaultSensor = this.f20157b.getDefaultSensor(i2);
                        if (defaultSensor != null) {
                            this.f20157b.registerListener(this, defaultSensor, 1000000);
                            this.f20159d.add(defaultSensor);
                        }
                    } catch (Throwable th) {
                        AbstractC2391y2.m13568a("SensorEventListenerImpl: exception at register listener: " + th);
                    }
                }
            }
        }
    }

    public C2386x1(C2313f0 c2313f0, AntiFraudConfig antiFraudConfig, Context context) {
        this.f20149b = c2313f0;
        this.f20150c = antiFraudConfig;
        this.f20151d = context.getApplicationContext();
    }

    /* renamed from: b */
    public /* synthetic */ void m13538b() {
        AbstractC2340m.m13290a(new RunnableC7775Iw1(this, 1));
    }

    /* renamed from: a */
    public void m13542a(long j) {
        if (j <= 0) {
            AbstractC2391y2.m13568a("SensorHandler: install timestamp is empty, do nothing");
            return;
        }
        if (!this.f20148a.compareAndSet(0, 1)) {
            AbstractC2391y2.m13568a("SensorHandler: handler has already been initialized");
            return;
        }
        a aVarM13544a = a.m13544a(this.f20149b, this.f20151d.getApplicationContext(), this.f20150c);
        this.f20152e = aVarM13544a;
        if (aVarM13544a == null) {
            AbstractC2391y2.m13568a("SensorHandler: sensor event listener is null");
            return;
        }
        this.f20153f = new RunnableC7775Iw1(this, 0);
        this.f20154g = new RunnableC7147xa(this, j, 4);
        this.f20155h = j;
        AbstractC2391y2.m13568a("SensorHandler: initialized");
        this.f20154g.run();
    }

    /* renamed from: c */
    public void m13543c() {
        Runnable runnable = this.f20154g;
        if (runnable == null) {
            AbstractC2391y2.m13568a("SensorHandler: can't start, startRunnable is null");
        } else {
            AbstractC2340m.m13290a(runnable);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m13536a() {
        if (!this.f20148a.compareAndSet(2, 1)) {
            AbstractC2391y2.m13568a("SensorHandler: handle isn't running");
        } else {
            this.f20152e.m13546b();
            this.f20149b.m13052a();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m13539b(long j) {
        if (!this.f20148a.compareAndSet(1, 2)) {
            AbstractC2391y2.m13568a("SensorHandler: handler can't start, current state: " + this.f20148a.get());
        } else if (this.f20152e == null) {
            AbstractC2391y2.m13568a("SensorHandler: handler can't start, sensor event listener is null");
        } else if (AbstractC2383w2.m13528a() - j > 259200) {
            AbstractC2391y2.m13568a("SensorHandler: more than 259200 seconds passed since the app was installed");
        } else {
            this.f20152e.m13545a();
            AbstractC2340m.f20022a.postDelayed(this.f20153f, 20000L);
        }
    }

    /* renamed from: a */
    public static C2386x1 m13535a(C2313f0 c2313f0, AntiFraudConfig antiFraudConfig, Context context) {
        return new C2386x1(c2313f0, antiFraudConfig, context);
    }
}
