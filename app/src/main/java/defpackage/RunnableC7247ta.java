package defpackage;

/* renamed from: ta, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7247ta implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CC0 b;
    public final /* synthetic */ WD c;

    public /* synthetic */ RunnableC7247ta(CC0 cc0, WD wd, int i) {
        this.a = i;
        this.b = cc0;
        this.c = wd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CC0 cc0 = this.b;
                cc0.getClass();
                int i = AbstractC0277Dh1.a;
                XQ xq = ((UQ) cc0.c).a;
                xq.getClass();
                C8323zE c8323zE = xq.r;
                Y3 y3P = c8323zE.P();
                c8323zE.Q(y3P, 1007, new C6990sE(y3P, this.c, 5));
                break;
            default:
                CC0 cc02 = this.b;
                WD wd = this.c;
                cc02.getClass();
                synchronized (wd) {
                }
                UQ uq = (UQ) cc02.c;
                int i2 = AbstractC0277Dh1.a;
                C8323zE c8323zE2 = uq.a.r;
                Y3 y3L = c8323zE2.L((C0456Fp0) c8323zE2.d.e);
                c8323zE2.Q(y3L, 1013, new C6990sE(y3L, wd, 0));
                break;
        }
    }
}
