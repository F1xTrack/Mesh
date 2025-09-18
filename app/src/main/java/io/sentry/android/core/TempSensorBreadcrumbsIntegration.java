package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.C6017f;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;
import p000.O91;

/* loaded from: classes2.dex */
public final class TempSensorBreadcrumbsIntegration implements InterfaceC5819Y, Closeable, SensorEventListener {

    /* renamed from: a */
    public final Context f33616a;

    /* renamed from: b */
    public C5760E f33617b;

    /* renamed from: c */
    public SentryAndroidOptions f33618c;

    /* renamed from: d */
    public SensorManager f33619d;

    /* renamed from: e */
    public boolean f33620e = false;

    /* renamed from: f */
    public final Object f33621f = new Object();

    public TempSensorBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f33616a = applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public final void m21546a(C5759D1 c5759d1) {
        try {
            SensorManager sensorManager = (SensorManager) this.f33616a.getSystemService("sensor");
            this.f33619d = sensorManager;
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                if (defaultSensor != null) {
                    this.f33619d.registerListener(this, defaultSensor, 3);
                    c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                    AbstractC6003a.m21742a("TempSensorBreadcrumbs");
                } else {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                }
            } else {
                c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
            }
        } catch (Throwable th) {
            c5759d1.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f33621f) {
            this.f33620e = true;
        }
        SensorManager sensorManager = this.f33619d;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f33619d = null;
            SentryAndroidOptions sentryAndroidOptions = this.f33618c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        this.f33617b = C5760E.f33234a;
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33618c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.f33618c.isEnableSystemEventBreadcrumbs()));
        if (this.f33618c.isEnableSystemEventBreadcrumbs()) {
            try {
                c5759d1.getExecutorService().submit(new O91(this, 25, c5759d1));
            } catch (Throwable th) {
                c5759d1.getLogger().mo21406d(EnumC6069n1.DEBUG, "Failed to start TempSensorBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0 || fArr[0] == 0.0f || this.f33617b == null) {
            return;
        }
        C6017f c6017f = new C6017f();
        c6017f.f34146d = "system";
        c6017f.f34148f = "device.event";
        c6017f.m21778b("TYPE_AMBIENT_TEMPERATURE", NotificationConstants.ACTION);
        c6017f.m21778b(Integer.valueOf(sensorEvent.accuracy), "accuracy");
        c6017f.m21778b(Long.valueOf(sensorEvent.timestamp), "timestamp");
        c6017f.f34150h = EnumC6069n1.INFO;
        c6017f.m21778b(Float.valueOf(sensorEvent.values[0]), "degree");
        C6193y c6193y = new C6193y();
        c6193y.m21928c(sensorEvent, "android:sensorEvent");
        this.f33617b.mo21376v(c6017f, c6193y);
    }
}
