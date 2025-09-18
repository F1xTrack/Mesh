package ru.rustore.sdk.remoteconfig.internal.controller;

import android.app.job.JobParameters;
import android.app.job.JobService;
import kotlin.Metadata;
import p000.AbstractC0336FK;
import p000.AbstractC10396nS1;
import p000.AbstractC10780qS1;
import p000.C10801qd0;
import p000.C11923zQ0;
import p000.C1848cS;
import p000.C7053w5;
import p000.C8657Zv1;
import p000.C9059d11;
import p000.C9443g11;
import p000.C9571h11;
import p000.InterfaceC10775qQ0;
import p000.InterfaceC7713Hr1;
import p000.O90;
import p000.VA0;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Lru/rustore/sdk/remoteconfig/internal/controller/PersistableConfigSyncJobService;", "Landroid/app/job/JobService;", "<init>", "()V", "sdk-public-remoteconfig_release"}, m22268k = 1, m22269mv = {1, 7, 0})
/* loaded from: classes2.dex */
public final class PersistableConfigSyncJobService extends JobService {

    /* renamed from: f */
    public static final /* synthetic */ int f42143f = 0;

    /* renamed from: a */
    public final InterfaceC7713Hr1 f42144a;

    /* renamed from: b */
    public final InterfaceC10775qQ0 f42145b;

    /* renamed from: c */
    public final C8657Zv1 f42146c;

    /* renamed from: d */
    public C9443g11 f42147d;

    /* renamed from: e */
    public volatile boolean f42148e;

    public PersistableConfigSyncJobService() throws C11923zQ0 {
        C1848cS c1848cS = C1848cS.f17479N;
        if (c1848cS == null) {
            throw new C11923zQ0();
        }
        this.f42144a = (InterfaceC7713Hr1) c1848cS.f17500h.getValue();
        C1848cS c1848cS2 = C1848cS.f17479N;
        if (c1848cS2 == null) {
            throw new C11923zQ0();
        }
        this.f42145b = (InterfaceC10775qQ0) c1848cS2.f17507o.getValue();
        C1848cS c1848cS3 = C1848cS.f17479N;
        if (c1848cS3 == null) {
            throw new C11923zQ0();
        }
        this.f42146c = (C8657Zv1) c1848cS3.f17505m.getValue();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        O90.m5968f(jobParameters, "params");
        this.f42147d = AbstractC10396nS1.m23145a(new C9571h11(AbstractC10780qS1.m24004c(new C9059d11(new C10801qd0(15, this)), AbstractC0336FK.m2578a()), new C7053w5(this, 21, jobParameters)), new VA0(this, jobParameters, 0), new VA0(this, jobParameters, 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.f42148e = true;
        C9443g11 c9443g11 = this.f42147d;
        if (c9443g11 != null) {
            c9443g11.mo4596a();
        }
        return true;
    }
}
