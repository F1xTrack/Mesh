package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class DH implements GH {
    public final /* synthetic */ int a;
    public final /* synthetic */ FH b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ DH(FH fh, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = fh;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.GH
    public final ScheduledFuture a(C3866fw1 c3866fw1) {
        switch (this.a) {
            case 0:
                FH fh = this.b;
                fh.getClass();
                return fh.b.scheduleAtFixedRate(new EH(fh, this.c, c3866fw1, 0), this.d, this.e, this.f);
            default:
                FH fh2 = this.b;
                fh2.getClass();
                return fh2.b.scheduleWithFixedDelay(new EH(fh2, this.c, c3866fw1, 2), this.d, this.e, this.f);
        }
    }
}
