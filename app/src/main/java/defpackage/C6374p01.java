package defpackage;

/* renamed from: p01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6374p01 extends AbstractC3309d1 {
    public long a;
    public C0767Jp b;

    @Override // defpackage.AbstractC3309d1
    public final boolean a(AbstractC2433c1 abstractC2433c1) {
        C6183o01 c6183o01 = (C6183o01) abstractC2433c1;
        if (this.a >= 0) {
            return false;
        }
        long j = c6183o01.h;
        if (j < c6183o01.i) {
            c6183o01.i = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.AbstractC3309d1
    public final InterfaceC1729Vy[] b(AbstractC2433c1 abstractC2433c1) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((C6183o01) abstractC2433c1).r(j);
    }
}
