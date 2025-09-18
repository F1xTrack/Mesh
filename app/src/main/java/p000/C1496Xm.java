package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: Xm */
/* loaded from: classes.dex */
public final /* synthetic */ class C1496Xm implements InterfaceC0363Fl, InterfaceC6471n9 {

    /* renamed from: a */
    public final /* synthetic */ int f13964a;

    /* renamed from: b */
    public final /* synthetic */ C1559Ym f13965b;

    public /* synthetic */ C1496Xm(C1559Ym c1559Ym, int i) {
        this.f13964a = i;
        this.f13965b = c1559Ym;
    }

    @Override // p000.InterfaceC6471n9
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        switch (this.f13964a) {
            case 1:
                C1559Ym c1559Ym = this.f13965b;
                if (!c1559Ym.f14513f) {
                    return F70.f3069c;
                }
                C0411GW c0411gw = c1559Ym.f14508a.f39235g;
                c0411gw.getClass();
                return AbstractC11797yQ1.m26149b(new C0267EE(14, c0411gw));
            default:
                C4262il c4262il = new C4262il(8);
                C1559Ym c1559Ym2 = this.f13965b;
                C20 c20 = c1559Ym2.f14512e;
                long millis = TimeUnit.NANOSECONDS.toMillis(C1559Ym.f14506g);
                C1244Tm c1244Tm = new C1244Tm(c4262il);
                C6573om c6573om = c1559Ym2.f14508a;
                c6573om.m23543a(c1244Tm);
                RunnableC6720r4 runnableC6720r4 = new RunnableC6720r4(c6573om, 21, c1244Tm);
                C0489Hl c0489Hl = c1244Tm.f11503b;
                c0489Hl.f4484b.mo2494d(runnableC6720r4, c6573om.f39230b);
                return AbstractC11797yQ1.m26149b(new C0059Aw(c0489Hl, c20, millis, 2));
        }
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        this.f13965b.f14508a.f39237i.m24945a(c0300El, true);
        return "TorchOn";
    }
}
