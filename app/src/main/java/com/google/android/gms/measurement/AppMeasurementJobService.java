package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import p000.C10152lY1;
import p000.C10525oT0;
import p000.C9110dP1;
import p000.C9734iH1;
import p000.CG1;
import p000.IB1;
import p000.OL1;
import p000.OW1;
import p000.RO1;
import p000.RunnableC11676xT1;
import p000.RunnableC1192Sx;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements OW1 {

    /* renamed from: a */
    public C10525oT0 f18047a;

    @Override // p000.OW1
    /* renamed from: a */
    public final boolean mo6079a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.OW1
    /* renamed from: b */
    public final void mo6080b(Intent intent) {
    }

    @Override // p000.OW1
    /* renamed from: c */
    public final void mo6081c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: d */
    public final C10525oT0 m11130d() {
        if (this.f18047a == null) {
            this.f18047a = new C10525oT0((Service) this);
        }
        return this.f18047a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        OL1 ol1 = C9110dP1.m17588a((Service) m11130d().f39025a, null, null).f26039i;
        C9110dP1.m17592e(ol1);
        ol1.f8386o.m24555d("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        OL1 ol1 = C9110dP1.m17588a((Service) m11130d().f39025a, null, null).f26039i;
        C9110dP1.m17592e(ol1);
        ol1.f8386o.m24555d("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        C10525oT0 c10525oT0M11130d = m11130d();
        if (intent == null) {
            c10525oT0M11130d.m23435x().f8378g.m24555d("onRebind called with null intent");
            return;
        }
        c10525oT0M11130d.getClass();
        c10525oT0M11130d.m23435x().f8386o.m24554c(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C10525oT0 c10525oT0M11130d = m11130d();
        c10525oT0M11130d.getClass();
        String string = jobParameters.getExtras().getString(NotificationConstants.ACTION);
        boolean zEquals = Objects.equals(string, "com.google.android.gms.measurement.UPLOAD");
        Service service = (Service) c10525oT0M11130d.f39025a;
        if (zEquals) {
            String str = (String) Preconditions.checkNotNull(string);
            C10152lY1 c10152lY1M22448j = C10152lY1.m22448j(service);
            OL1 ol1Mo6070n = c10152lY1M22448j.mo6070n();
            ol1Mo6070n.f8386o.m24554c(str, "Local AppMeasurementJobService called. action");
            RunnableC1192Sx runnableC1192Sx = new RunnableC1192Sx(29);
            runnableC1192Sx.f11079b = c10525oT0M11130d;
            runnableC1192Sx.f11080c = ol1Mo6070n;
            runnableC1192Sx.f11081d = jobParameters;
            c10152lY1M22448j.mo6071p0().m25412E1(new RO1(c10152lY1M22448j, 9, runnableC1192Sx));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        CG1 cg1M1131d = CG1.m1131d(service, null);
        if (!((Boolean) IB1.f4757O0.m3028a(null)).booleanValue()) {
            return true;
        }
        RunnableC11676xT1 runnableC11676xT1 = new RunnableC11676xT1();
        runnableC11676xT1.f45650c = c10525oT0M11130d;
        runnableC11676xT1.f45649b = jobParameters;
        cg1M1131d.getClass();
        cg1M1131d.m1136f(new C9734iH1(cg1M1131d, runnableC11676xT1, 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        C10525oT0 c10525oT0M11130d = m11130d();
        if (intent == null) {
            c10525oT0M11130d.m23435x().f8378g.m24555d("onUnbind called with null intent");
            return true;
        }
        c10525oT0M11130d.getClass();
        c10525oT0M11130d.m23435x().f8386o.m24554c(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }
}
