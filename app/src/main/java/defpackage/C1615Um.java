package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: Um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1615Um implements InterfaceC0443Fl, InterfaceC6021n9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1771Wm b;

    public /* synthetic */ C1615Um(C1771Wm c1771Wm, int i) {
        this.a = i;
        this.b = c1771Wm;
    }

    @Override // defpackage.InterfaceC6021n9
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        switch (this.a) {
            case 1:
                return this.b.a.g.c(true);
            case 2:
                C1771Wm c1771Wm = this.b;
                c1771Wm.getClass();
                return AbstractC8171yQ1.b(new C1615Um(c1771Wm, 0));
            case 3:
                GW gw = this.b.a.g;
                gw.getClass();
                return AbstractC8171yQ1.b(new EE(14, gw));
            default:
                C4403il c4403il = new C4403il(7);
                C1771Wm c1771Wm2 = this.b;
                C20 c20 = c1771Wm2.c;
                long millis = TimeUnit.NANOSECONDS.toMillis(C1771Wm.f);
                C1537Tm c1537Tm = new C1537Tm(c4403il);
                C6329om c6329om = c1771Wm2.a;
                c6329om.a(c1537Tm);
                RunnableC6769r4 runnableC6769r4 = new RunnableC6769r4(c6329om, 21, c1537Tm);
                C0599Hl c0599Hl = c1537Tm.b;
                c0599Hl.b.d(runnableC6769r4, c6329om.b);
                return AbstractC8171yQ1.b(new C0086Aw(c0599Hl, c20, millis, 2));
        }
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        C1771Wm c1771Wm = this.b;
        if (!c1771Wm.e.e()) {
            c0365El.b(null);
            return "EnableTorchInternal";
        }
        AbstractC0759Jm0.f("Camera2CapturePipeline");
        c1771Wm.a.c(true);
        c0365El.b(null);
        return "EnableTorchInternal";
    }
}
