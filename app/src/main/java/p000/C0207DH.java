package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: DH */
/* loaded from: classes.dex */
public final /* synthetic */ class C0207DH implements InterfaceC0396GH {

    /* renamed from: a */
    public final /* synthetic */ int f1934a;

    /* renamed from: b */
    public final /* synthetic */ ScheduledExecutorServiceC0333FH f1935b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f1936c;

    /* renamed from: d */
    public final /* synthetic */ long f1937d;

    /* renamed from: e */
    public final /* synthetic */ long f1938e;

    /* renamed from: f */
    public final /* synthetic */ TimeUnit f1939f;

    public /* synthetic */ C0207DH(ScheduledExecutorServiceC0333FH scheduledExecutorServiceC0333FH, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f1934a = i;
        this.f1935b = scheduledExecutorServiceC0333FH;
        this.f1936c = runnable;
        this.f1937d = j;
        this.f1938e = j2;
        this.f1939f = timeUnit;
    }

    @Override // p000.InterfaceC0396GH
    /* renamed from: a */
    public final ScheduledFuture mo576a(C9432fw1 c9432fw1) {
        switch (this.f1934a) {
            case 0:
                ScheduledExecutorServiceC0333FH scheduledExecutorServiceC0333FH = this.f1935b;
                scheduledExecutorServiceC0333FH.getClass();
                return scheduledExecutorServiceC0333FH.f3140b.scheduleAtFixedRate(new RunnableC0270EH(scheduledExecutorServiceC0333FH, this.f1936c, c9432fw1, 0), this.f1937d, this.f1938e, this.f1939f);
            default:
                ScheduledExecutorServiceC0333FH scheduledExecutorServiceC0333FH2 = this.f1935b;
                scheduledExecutorServiceC0333FH2.getClass();
                return scheduledExecutorServiceC0333FH2.f3140b.scheduleWithFixedDelay(new RunnableC0270EH(scheduledExecutorServiceC0333FH2, this.f1936c, c9432fw1, 2), this.f1937d, this.f1938e, this.f1939f);
        }
    }
}
