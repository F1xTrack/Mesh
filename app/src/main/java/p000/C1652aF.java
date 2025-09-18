package p000;

/* renamed from: aF */
/* loaded from: classes.dex */
public final class C1652aF extends AbstractC6695qg {

    /* renamed from: d */
    public final /* synthetic */ int f15401d = 1;

    /* renamed from: e */
    public final Object f15402e;

    public C1652aF(I31 i31, int i) {
        super(i, i31.f4684k - 1);
        this.f15402e = i31;
    }

    @Override // p000.InterfaceC7550Eo0
    /* renamed from: e */
    public final long mo2423e() {
        switch (this.f15401d) {
            case 0:
                m24041a();
                return ((C1588ZE) this.f15402e).m9514f(this.f41099c);
            default:
                m24041a();
                return ((I31) this.f15402e).f4688o[(int) this.f41099c];
        }
    }

    @Override // p000.InterfaceC7550Eo0
    /* renamed from: h */
    public final long mo2424h() {
        switch (this.f15401d) {
            case 0:
                m24041a();
                return ((C1588ZE) this.f15402e).m9513e(this.f41099c);
            default:
                return ((I31) this.f15402e).m3741c((int) this.f41099c) + mo2423e();
        }
    }

    public C1652aF(C1588ZE c1588ze, long j, long j2) {
        super(j, j2);
        this.f15402e = c1588ze;
    }
}
