package ru.rustore.sdk.metrics.internal.presentation;

import android.app.job.JobParameters;
import android.app.job.JobService;
import kotlin.Metadata;
import p000.AbstractC0336FK;
import p000.AbstractC0705LB;
import p000.AbstractC10396nS1;
import p000.AbstractC10780qS1;
import p000.C7053w5;
import p000.C8866bY0;
import p000.C8994cY0;
import p000.C9059d11;
import p000.C9443g11;
import p000.C9571h11;
import p000.F71;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Lru/rustore/sdk/metrics/internal/presentation/SendMetricsEventJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "sdk-public-metrics_release"}, m22268k = 1, m22269mv = {1, 7, 0})
/* loaded from: classes2.dex */
public final class SendMetricsEventJobService extends JobService {

    /* renamed from: a */
    public final F71 f42137a = AbstractC0705LB.m4915b(new C8866bY0(this, 0));

    /* renamed from: b */
    public C9443g11 f42138b;

    /* renamed from: c */
    public volatile boolean f42139c;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        O90.m5968f(jobParameters, "params");
        this.f42138b = AbstractC10396nS1.m23145a(new C9571h11(AbstractC10780qS1.m24004c(new C9059d11(new C8866bY0(this, 1)), AbstractC0336FK.m2578a()), new C7053w5(this, 23, jobParameters)), new C8994cY0(this, jobParameters, 0), new C8994cY0(this, jobParameters, 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.f42139c = true;
        C9443g11 c9443g11 = this.f42138b;
        if (c9443g11 != null) {
            c9443g11.mo4596a();
        }
        return true;
    }
}
