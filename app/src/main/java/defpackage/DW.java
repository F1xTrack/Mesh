package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class DW implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GW b;
    public final /* synthetic */ long c;

    public /* synthetic */ DW(GW gw, long j, int i) {
        this.a = i;
        this.b = gw;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                GW gw = this.b;
                if (this.c == gw.k) {
                    gw.b();
                    break;
                }
                break;
            case 1:
                GW gw2 = this.b;
                if (this.c == gw2.k) {
                    gw2.m = false;
                    ScheduledFuture scheduledFuture = gw2.j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        gw2.j = null;
                    }
                    C0365El c0365El = gw2.s;
                    if (c0365El != null) {
                        c0365El.b(new HW(false));
                        gw2.s = null;
                        break;
                    }
                }
                break;
            case 2:
                GW gw3 = this.b;
                gw3.getClass();
                gw3.b.execute(new DW(gw3, this.c, 1));
                break;
            default:
                GW gw4 = this.b;
                gw4.getClass();
                gw4.b.execute(new DW(gw4, this.c, 0));
                break;
        }
    }
}
