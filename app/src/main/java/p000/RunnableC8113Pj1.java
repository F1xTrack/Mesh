package p000;

/* renamed from: Pj1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8113Pj1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f9265a;

    /* renamed from: b */
    public final /* synthetic */ C8165Qj1 f9266b;

    /* renamed from: c */
    public final /* synthetic */ C1398WD f9267c;

    public /* synthetic */ RunnableC8113Pj1(C8165Qj1 c8165Qj1, C1398WD c1398wd, int i) {
        this.f9265a = i;
        this.f9266b = c8165Qj1;
        this.f9267c = c1398wd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9265a) {
            case 0:
                C8165Qj1 c8165Qj1 = this.f9266b;
                c8165Qj1.getClass();
                int i = AbstractC7485Dh1.f2166a;
                C1474XQ c1474xq = ((SurfaceHolderCallbackC1285UQ) c8165Qj1.f9757b).f11780a;
                c1474xq.getClass();
                C7251zE c7251zE = c1474xq.f13736r;
                C1514Y3 c1514y3M26333P = c7251zE.m26333P();
                c7251zE.m26334Q(c1514y3M26333P, 1015, new C6810sE(c1514y3M26333P, this.f9267c, 1));
                break;
            default:
                C8165Qj1 c8165Qj12 = this.f9266b;
                C1398WD c1398wd = this.f9267c;
                c8165Qj12.getClass();
                synchronized (c1398wd) {
                }
                SurfaceHolderCallbackC1285UQ surfaceHolderCallbackC1285UQ = (SurfaceHolderCallbackC1285UQ) c8165Qj12.f9757b;
                int i2 = AbstractC7485Dh1.f2166a;
                C1474XQ c1474xq2 = surfaceHolderCallbackC1285UQ.f11780a;
                C7251zE c7251zE2 = c1474xq2.f13736r;
                C1514Y3 c1514y3M26330L = c7251zE2.m26330L((C7604Fp0) c7251zE2.f46734d.f9307e);
                c7251zE2.m26334Q(c1514y3M26330L, 1020, new C0424Gj(c1514y3M26330L, 18, c1398wd));
                c1474xq2.f13704P = null;
                break;
        }
    }
}
