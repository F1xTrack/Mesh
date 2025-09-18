package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class XN0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3954gO0 b;
    public final /* synthetic */ C6687qe c;

    public /* synthetic */ XN0(C3954gO0 c3954gO0, C6687qe c6687qe, int i) {
        this.a = i;
        this.b = c3954gO0;
        this.c = c6687qe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s(this.c);
                break;
            default:
                C3954gO0 c3954gO0 = this.b;
                if (c3954gO0.q == this.c && !c3954gO0.r) {
                    if (c3954gO0.m()) {
                        c3954gO0.H.k();
                    }
                    C7020sO c7020sO = c3954gO0.F;
                    if (c7020sO == null) {
                        c3954gO0.d0 = true;
                        break;
                    } else {
                        c7020sO.k();
                        C6687qe c6687qe = c3954gO0.q;
                        c6687qe.g(new C0829Kj1(c6687qe.h, c3954gO0.j()));
                        break;
                    }
                }
                break;
        }
    }
}
