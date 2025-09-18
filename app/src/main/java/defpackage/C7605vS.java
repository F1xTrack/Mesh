package defpackage;

/* renamed from: vS */
/* loaded from: classes.dex */
public final class C7605vS extends IS0 {
    public final String a;
    public final IS0 b;
    public final InterfaceC7795wS c;
    public C8351zN0 d;

    public C7605vS(String str, IS0 is0, InterfaceC7795wS interfaceC7795wS) {
        this.a = str;
        this.b = is0;
        this.c = interfaceC7795wS;
    }

    @Override // defpackage.IS0
    public final long o() {
        return this.b.o();
    }

    @Override // defpackage.IS0
    public final C1859Xp0 p() {
        return this.b.p();
    }

    @Override // defpackage.IS0
    public final InterfaceC0827Kj w() {
        if (this.d == null) {
            this.d = JI1.b(new C7414uS(this, this.b.w()));
        }
        return this.d;
    }
}
