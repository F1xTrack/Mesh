package p000;

/* renamed from: va */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7021va implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f44414a;

    /* renamed from: b */
    public final /* synthetic */ CC0 f44415b;

    /* renamed from: c */
    public final /* synthetic */ Exception f44416c;

    public /* synthetic */ RunnableC7021va(CC0 cc0, Exception exc, int i) {
        this.f44414a = i;
        this.f44415b = cc0;
        this.f44416c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.f44416c;
        CC0 cc0 = this.f44415b;
        int i = this.f44414a;
        cc0.getClass();
        switch (i) {
            case 0:
                int i2 = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a.f13736r;
                C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                c7251zE.m26334Q(c1514y3M26333P, 1029, new C6730rE(c1514y3M26333P, exc, 2));
                break;
            default:
                int i3 = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE2 = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a.f13736r;
                C1514Y3 c1514y3M26333P2 = c7251zE2.m26333P();
                c7251zE2.m26334Q(c1514y3M26333P2, 1014, new C6730rE(c1514y3M26333P2, exc, 3));
                break;
        }
    }
}
