package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: Um */
/* loaded from: classes.dex */
public final /* synthetic */ class C1307Um implements InterfaceC0363Fl, InterfaceC6471n9 {

    /* renamed from: a */
    public final /* synthetic */ int f12026a;

    /* renamed from: b */
    public final /* synthetic */ C1433Wm f12027b;

    public /* synthetic */ C1307Um(C1433Wm c1433Wm, int i) {
        this.f12026a = i;
        this.f12027b = c1433Wm;
    }

    @Override // p000.InterfaceC6471n9
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        switch (this.f12026a) {
            case 1:
                return this.f12027b.f13395a.f39235g.m3077c(true);
            case 2:
                C1433Wm c1433Wm = this.f12027b;
                c1433Wm.getClass();
                return AbstractC11797yQ1.m26149b(new C1307Um(c1433Wm, 0));
            case 3:
                C0411GW c0411gw = this.f12027b.f13395a.f39235g;
                c0411gw.getClass();
                return AbstractC11797yQ1.m26149b(new C0267EE(14, c0411gw));
            default:
                C4262il c4262il = new C4262il(7);
                C1433Wm c1433Wm2 = this.f12027b;
                C20 c20 = c1433Wm2.f13397c;
                long millis = TimeUnit.NANOSECONDS.toMillis(C1433Wm.f13393f);
                C1244Tm c1244Tm = new C1244Tm(c4262il);
                C6573om c6573om = c1433Wm2.f13395a;
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
        C1433Wm c1433Wm = this.f12027b;
        if (!c1433Wm.f13399e.m3060e()) {
            c0300El.m2375b(null);
            return "EnableTorchInternal";
        }
        AbstractC7806Jm0.m4412f("Camera2CapturePipeline");
        c1433Wm.f13395a.m23545c(true);
        c0300El.m2375b(null);
        return "EnableTorchInternal";
    }
}
