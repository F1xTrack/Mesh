package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import p000.AbstractC11332um1;
import p000.BinderC10262mP1;
import p000.C10152lY1;
import p000.C10525oT0;
import p000.C9110dP1;
import p000.OL1;
import p000.OW1;
import p000.RO1;
import p000.RunnableC10400nU1;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements OW1 {

    /* renamed from: a */
    public C10525oT0 f18049a;

    @Override // p000.OW1
    /* renamed from: a */
    public final boolean mo6079a(int i) {
        return stopSelfResult(i);
    }

    @Override // p000.OW1
    /* renamed from: b */
    public final void mo6080b(Intent intent) {
        SparseArray sparseArray = AbstractC11332um1.f43860a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = AbstractC11332um1.f43860a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                }
            } finally {
            }
        }
    }

    @Override // p000.OW1
    /* renamed from: c */
    public final void mo6081c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final C10525oT0 m11131d() {
        if (this.f18049a == null) {
            this.f18049a = new C10525oT0((Service) this);
        }
        return this.f18049a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C10525oT0 c10525oT0M11131d = m11131d();
        if (intent == null) {
            c10525oT0M11131d.m23435x().f8378g.m24555d("onBind called with null intent");
            return null;
        }
        c10525oT0M11131d.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC10262mP1(C10152lY1.m22448j((Service) c10525oT0M11131d.f39025a));
        }
        c10525oT0M11131d.m23435x().f8381j.m24554c(action, "onBind received unknown action");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        OL1 ol1 = C9110dP1.m17588a((Service) m11131d().f39025a, null, null).f26039i;
        C9110dP1.m17592e(ol1);
        ol1.f8386o.m24555d("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        OL1 ol1 = C9110dP1.m17588a((Service) m11131d().f39025a, null, null).f26039i;
        C9110dP1.m17592e(ol1);
        ol1.f8386o.m24555d("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        C10525oT0 c10525oT0M11131d = m11131d();
        if (intent == null) {
            c10525oT0M11131d.m23435x().f8378g.m24555d("onRebind called with null intent");
            return;
        }
        c10525oT0M11131d.getClass();
        c10525oT0M11131d.m23435x().f8386o.m24554c(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C10525oT0 c10525oT0M11131d = m11131d();
        Service service = (Service) c10525oT0M11131d.f39025a;
        OL1 ol1 = C9110dP1.m17588a(service, null, null).f26039i;
        C9110dP1.m17592e(ol1);
        if (intent == null) {
            ol1.f8381j.m24555d("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        ol1.f8386o.m24553b(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        RunnableC10400nU1 runnableC10400nU1 = new RunnableC10400nU1(1);
        runnableC10400nU1.f38348c = c10525oT0M11131d;
        runnableC10400nU1.f38347b = i2;
        runnableC10400nU1.f38349d = ol1;
        runnableC10400nU1.f38350e = intent;
        C10152lY1 c10152lY1M22448j = C10152lY1.m22448j(service);
        c10152lY1M22448j.mo6071p0().m25412E1(new RO1(c10152lY1M22448j, 9, runnableC10400nU1));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        C10525oT0 c10525oT0M11131d = m11131d();
        if (intent == null) {
            c10525oT0M11131d.m23435x().f8378g.m24555d("onUnbind called with null intent");
            return true;
        }
        c10525oT0M11131d.getClass();
        c10525oT0M11131d.m23435x().f8386o.m24554c(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }
}
