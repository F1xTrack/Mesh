package p000;

/* renamed from: p01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10592p01 extends AbstractC3902d1 {

    /* renamed from: a */
    public long f39429a;

    /* renamed from: b */
    public C0619Jp f39430b;

    @Override // p000.AbstractC3902d1
    /* renamed from: a */
    public final boolean mo977a(AbstractC1821c1 abstractC1821c1) {
        C10464o01 c10464o01 = (C10464o01) abstractC1821c1;
        if (this.f39429a >= 0) {
            return false;
        }
        long j = c10464o01.f38673h;
        if (j < c10464o01.f38674i) {
            c10464o01.f38674i = j;
        }
        this.f39429a = j;
        return true;
    }

    @Override // p000.AbstractC3902d1
    /* renamed from: b */
    public final InterfaceC1382Vy[] mo978b(AbstractC1821c1 abstractC1821c1) {
        long j = this.f39429a;
        this.f39429a = -1L;
        this.f39430b = null;
        return ((C10464o01) abstractC1821c1).m23308r(j);
    }
}
