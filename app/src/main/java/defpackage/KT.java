package defpackage;

/* loaded from: classes2.dex */
public final class KT extends IS0 {
    public final IS0 a;
    public final PT b;

    public KT(IS0 is0, PT pt) {
        this.a = is0;
        this.b = pt;
    }

    @Override // defpackage.IS0
    public final long o() {
        IS0 is0 = this.a;
        if (is0 != null) {
            return is0.o();
        }
        return -1L;
    }

    @Override // defpackage.IS0
    public final C1859Xp0 p() {
        IS0 is0 = this.a;
        if (is0 != null) {
            return is0.p();
        }
        return null;
    }

    @Override // defpackage.IS0
    public final InterfaceC0827Kj w() {
        IS0 is0 = this.a;
        O90.c(is0);
        return JI1.b(new C7414uS(is0.w(), this));
    }
}
