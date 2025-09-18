package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: Xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1849Xm implements InterfaceC0443Fl, InterfaceC6021n9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1927Ym b;

    public /* synthetic */ C1849Xm(C1927Ym c1927Ym, int i) {
        this.a = i;
        this.b = c1927Ym;
    }

    @Override // defpackage.InterfaceC6021n9
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        switch (this.a) {
            case 1:
                C1927Ym c1927Ym = this.b;
                if (!c1927Ym.f) {
                    return F70.c;
                }
                GW gw = c1927Ym.a.g;
                gw.getClass();
                return AbstractC8171yQ1.b(new EE(14, gw));
            default:
                C4403il c4403il = new C4403il(8);
                C1927Ym c1927Ym2 = this.b;
                C20 c20 = c1927Ym2.e;
                long millis = TimeUnit.NANOSECONDS.toMillis(C1927Ym.g);
                C1537Tm c1537Tm = new C1537Tm(c4403il);
                C6329om c6329om = c1927Ym2.a;
                c6329om.a(c1537Tm);
                RunnableC6769r4 runnableC6769r4 = new RunnableC6769r4(c6329om, 21, c1537Tm);
                C0599Hl c0599Hl = c1537Tm.b;
                c0599Hl.b.d(runnableC6769r4, c6329om.b);
                return AbstractC8171yQ1.b(new C0086Aw(c0599Hl, c20, millis, 2));
        }
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        this.b.a.i.a(c0365El, true);
        return "TorchOn";
    }
}
