package defpackage;

/* loaded from: classes.dex */
public final class TW1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ WW1 c;

    public /* synthetic */ TW1(WW1 ww1, long j, int i) {
        this.a = i;
        this.b = j;
        this.c = ww1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WW1 ww1 = this.c;
                ww1.v1();
                ww1.C1();
                OL1 ol1N = ww1.n();
                long j = this.b;
                ol1N.o.c(Long.valueOf(j), "Activity resumed, time");
                C3386dP1 c3386dP1 = (C3386dP1) ww1.b;
                boolean zE1 = c3386dP1.g.E1(null, IB1.W0);
                C1263Py1 c1263Py1 = c3386dP1.g;
                H9 h9 = ww1.g;
                if (zE1) {
                    if (c1263Py1.G1() || ww1.e) {
                        ((WW1) h9.d).v1();
                        ((C6477pX1) h9.c).a();
                        h9.a = j;
                        h9.b = j;
                    }
                } else if (c1263Py1.G1() || ww1.t1().u.b()) {
                    ((WW1) h9.d).v1();
                    ((C6477pX1) h9.c).a();
                    h9.a = j;
                    h9.b = j;
                }
                ES1 es1 = ww1.h;
                WW1 ww12 = (WW1) es1.c;
                ww12.v1();
                RunnableC5904mX1 runnableC5904mX1 = (RunnableC5904mX1) es1.b;
                if (runnableC5904mX1 != null) {
                    ww12.d.removeCallbacks(runnableC5904mX1);
                }
                ww12.t1().u.a(false);
                ww12.v1();
                ww12.e = false;
                if (((C3386dP1) ww12.b).g.E1(null, IB1.U0) && ww12.w1().o) {
                    ww12.n().o.d("Retrying trigger URI registration in foreground");
                    ww12.w1().U1();
                }
                C6845rT0 c6845rT0 = ww1.f;
                ((WW1) c6845rT0.a).v1();
                WW1 ww13 = (WW1) c6845rT0.a;
                if (((C3386dP1) ww13.b).f()) {
                    c6845rT0.o(((C3386dP1) ww13.b).n.currentTimeMillis(), false);
                    break;
                }
                break;
            default:
                WW1 ww14 = this.c;
                ww14.v1();
                ww14.C1();
                OL1 ol1N2 = ww14.n();
                long j2 = this.b;
                ol1N2.o.c(Long.valueOf(j2), "Activity paused, time");
                ES1 es12 = ww14.h;
                WW1 ww15 = (WW1) es12.c;
                RunnableC5904mX1 runnableC5904mX12 = new RunnableC5904mX1(es12, ((C3386dP1) ww15.b).n.currentTimeMillis(), j2);
                es12.b = runnableC5904mX12;
                ww15.d.postDelayed(runnableC5904mX12, 2000L);
                if (((C3386dP1) ww14.b).g.G1()) {
                    ((C6477pX1) ww14.g.c).a();
                    break;
                }
                break;
        }
    }
}
