package defpackage;

/* renamed from: Pj1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1218Pj1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1296Qj1 b;
    public final /* synthetic */ WD c;

    public /* synthetic */ RunnableC1218Pj1(C1296Qj1 c1296Qj1, WD wd, int i) {
        this.a = i;
        this.b = c1296Qj1;
        this.c = wd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C1296Qj1 c1296Qj1 = this.b;
                c1296Qj1.getClass();
                int i = AbstractC0277Dh1.a;
                XQ xq = ((UQ) c1296Qj1.b).a;
                xq.getClass();
                C8323zE c8323zE = xq.r;
                Y3 y3P = c8323zE.P();
                c8323zE.Q(y3P, 1015, new C6990sE(y3P, this.c, 1));
                break;
            default:
                C1296Qj1 c1296Qj12 = this.b;
                WD wd = this.c;
                c1296Qj12.getClass();
                synchronized (wd) {
                }
                UQ uq = (UQ) c1296Qj12.b;
                int i2 = AbstractC0277Dh1.a;
                XQ xq2 = uq.a;
                C8323zE c8323zE2 = xq2.r;
                Y3 y3L = c8323zE2.L((C0456Fp0) c8323zE2.d.e);
                c8323zE2.Q(y3L, 1020, new C0515Gj(y3L, 18, wd));
                xq2.P = null;
                break;
        }
    }
}
