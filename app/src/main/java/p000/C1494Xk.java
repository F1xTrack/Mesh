package p000;

/* renamed from: Xk */
/* loaded from: classes2.dex */
public final class C1494Xk extends AbstractC0286EX {

    /* renamed from: b */
    public final /* synthetic */ C1557Yk f13940b;

    /* renamed from: c */
    public final /* synthetic */ C4198hk f13941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1494Xk(C1557Yk c1557Yk, C4198hk c4198hk, Z11 z11) {
        super(z11);
        this.f13940b = c1557Yk;
        this.f13941c = c4198hk;
    }

    @Override // p000.AbstractC0286EX, p000.Z11, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1557Yk c1557Yk = this.f13940b;
        C4198hk c4198hk = this.f13941c;
        synchronized (c1557Yk) {
            if (c4198hk.f28553a) {
                return;
            }
            c4198hk.f28553a = true;
            super.close();
            ((C1338VG) this.f13941c.f28554b).m8342e();
        }
    }
}
