package p000;

/* renamed from: ua */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6958ua implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f43751a;

    /* renamed from: b */
    public final /* synthetic */ CC0 f43752b;

    /* renamed from: c */
    public final /* synthetic */ C0037Aa f43753c;

    public /* synthetic */ RunnableC6958ua(CC0 cc0, C0037Aa c0037Aa, int i) {
        this.f43751a = i;
        this.f43752b = cc0;
        this.f43753c = c0037Aa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C0037Aa c0037Aa = this.f43753c;
        CC0 cc0 = this.f43752b;
        int i = this.f43751a;
        cc0.getClass();
        switch (i) {
            case 0:
                int i2 = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a.f13736r;
                final C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                final int i3 = 0;
                c7251zE.m26334Q(c1514y3M26333P, 1031, new InterfaceC8216Rj0() { // from class: yE
                    @Override // p000.InterfaceC8216Rj0
                    public final void invoke(Object obj) {
                        InterfaceC1577Z3 interfaceC1577Z3 = (InterfaceC1577Z3) obj;
                        switch (i3) {
                            case 0:
                                interfaceC1577Z3.mo2257s(c1514y3M26333P, c0037Aa);
                                break;
                            default:
                                interfaceC1577Z3.mo2264z(c1514y3M26333P, c0037Aa);
                                break;
                        }
                    }
                });
                break;
            default:
                int i4 = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE2 = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a.f13736r;
                final C1514Y3 c1514y3M26333P2 = c7251zE2.m26333P();
                final int i5 = 1;
                c7251zE2.m26334Q(c1514y3M26333P2, 1032, new InterfaceC8216Rj0() { // from class: yE
                    @Override // p000.InterfaceC8216Rj0
                    public final void invoke(Object obj) {
                        InterfaceC1577Z3 interfaceC1577Z3 = (InterfaceC1577Z3) obj;
                        switch (i5) {
                            case 0:
                                interfaceC1577Z3.mo2257s(c1514y3M26333P2, c0037Aa);
                                break;
                            default:
                                interfaceC1577Z3.mo2264z(c1514y3M26333P2, c0037Aa);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
