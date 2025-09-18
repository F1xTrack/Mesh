package defpackage;

/* renamed from: ua */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7438ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CC0 b;
    public final /* synthetic */ C0020Aa c;

    public /* synthetic */ RunnableC7438ua(CC0 cc0, C0020Aa c0020Aa, int i) {
        this.a = i;
        this.b = cc0;
        this.c = c0020Aa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C0020Aa c0020Aa = this.c;
        CC0 cc0 = this.b;
        int i = this.a;
        cc0.getClass();
        switch (i) {
            case 0:
                int i2 = AbstractC0277Dh1.a;
                C8323zE c8323zE = ((UQ) cc0.c).a.r;
                final Y3 y3P = c8323zE.P();
                final int i3 = 0;
                c8323zE.Q(y3P, 1031, new InterfaceC1373Rj0() { // from class: yE
                    @Override // defpackage.InterfaceC1373Rj0
                    public final void invoke(Object obj) {
                        Z3 z3 = (Z3) obj;
                        switch (i3) {
                            case 0:
                                z3.s(y3P, c0020Aa);
                                break;
                            default:
                                z3.z(y3P, c0020Aa);
                                break;
                        }
                    }
                });
                break;
            default:
                int i4 = AbstractC0277Dh1.a;
                C8323zE c8323zE2 = ((UQ) cc0.c).a.r;
                final Y3 y3P2 = c8323zE2.P();
                final int i5 = 1;
                c8323zE2.Q(y3P2, 1032, new InterfaceC1373Rj0() { // from class: yE
                    @Override // defpackage.InterfaceC1373Rj0
                    public final void invoke(Object obj) {
                        Z3 z3 = (Z3) obj;
                        switch (i5) {
                            case 0:
                                z3.s(y3P2, c0020Aa);
                                break;
                            default:
                                z3.z(y3P2, c0020Aa);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
