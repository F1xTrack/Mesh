package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: DW */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0222DW implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2025a;

    /* renamed from: b */
    public final /* synthetic */ C0411GW f2026b;

    /* renamed from: c */
    public final /* synthetic */ long f2027c;

    public /* synthetic */ RunnableC0222DW(C0411GW c0411gw, long j, int i) {
        this.f2025a = i;
        this.f2026b = c0411gw;
        this.f2027c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2025a) {
            case 0:
                C0411GW c0411gw = this.f2026b;
                if (this.f2027c == c0411gw.f3784k) {
                    c0411gw.m3076b();
                    break;
                }
                break;
            case 1:
                C0411GW c0411gw2 = this.f2026b;
                if (this.f2027c == c0411gw2.f3784k) {
                    c0411gw2.f3786m = false;
                    ScheduledFuture scheduledFuture = c0411gw2.f3783j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        c0411gw2.f3783j = null;
                    }
                    C0300El c0300El = c0411gw2.f3792s;
                    if (c0300El != null) {
                        c0300El.m2375b(new C0474HW(false));
                        c0411gw2.f3792s = null;
                        break;
                    }
                }
                break;
            case 2:
                C0411GW c0411gw3 = this.f2026b;
                c0411gw3.getClass();
                c0411gw3.f3775b.execute(new RunnableC0222DW(c0411gw3, this.f2027c, 1));
                break;
            default:
                C0411GW c0411gw4 = this.f2026b;
                c0411gw4.getClass();
                c0411gw4.f3775b.execute(new RunnableC0222DW(c0411gw4, this.f2027c, 0));
                break;
        }
    }
}
