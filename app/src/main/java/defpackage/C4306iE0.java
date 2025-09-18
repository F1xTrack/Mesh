package defpackage;

/* renamed from: iE0 */
/* loaded from: classes.dex */
public final class C4306iE0 extends IS0 {
    public final IS0 a;
    public final C5402jv0 b;
    public C8351zN0 c;
    public long d = 0;

    public C4306iE0(IS0 is0, C5402jv0 c5402jv0) {
        this.a = is0;
        this.b = c5402jv0;
    }

    @Override // defpackage.IS0
    public final long o() {
        return this.a.o();
    }

    @Override // defpackage.IS0
    public final C1859Xp0 p() {
        return this.a.p();
    }

    @Override // defpackage.IS0
    public final InterfaceC0827Kj w() {
        if (this.c == null) {
            this.c = JI1.b(new C1609Uk(this, this.a.w()));
        }
        return this.c;
    }
}
