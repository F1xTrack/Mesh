package p000;

/* renamed from: ta */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6895ta implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f43142a;

    /* renamed from: b */
    public final /* synthetic */ CC0 f43143b;

    /* renamed from: c */
    public final /* synthetic */ C1398WD f43144c;

    public /* synthetic */ RunnableC6895ta(CC0 cc0, C1398WD c1398wd, int i) {
        this.f43142a = i;
        this.f43143b = cc0;
        this.f43144c = c1398wd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43142a) {
            case 0:
                CC0 cc0 = this.f43143b;
                cc0.getClass();
                int i = AbstractC7485Dh1.f2166a;
                C1474XQ c1474xq = ((SurfaceHolderCallbackC1285UQ) cc0.f1251c).f11780a;
                c1474xq.getClass();
                C7251zE c7251zE = c1474xq.f13736r;
                C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                c7251zE.m26334Q(c1514y3M26333P, 1007, new C6810sE(c1514y3M26333P, this.f43144c, 5));
                break;
            default:
                CC0 cc02 = this.f43143b;
                C1398WD c1398wd = this.f43144c;
                cc02.getClass();
                synchronized (c1398wd) {
                }
                SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ = (SurfaceHolderCallbackC1285UQ) cc02.f1251c;
                int i2 = AbstractC7485Dh1.f2166a;
                C7251zE c7251zE2 = surfaceHolderCallbackC1285UQ.f11780a.f13736r;
                C1514Y3 c1514y3M26330L = c7251zE2.m26330L((C7604Fp0) c7251zE2.f46734d.f9307e);
                c7251zE2.m26334Q(c1514y3M26330L, 1013, new C6810sE(c1514y3M26330L, c1398wd, 0));
                break;
        }
    }
}
