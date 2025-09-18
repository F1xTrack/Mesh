package defpackage;

/* renamed from: h01 */
/* loaded from: classes.dex */
public final class C4070h01 implements InterfaceC0326Dy {
    public final int a;
    public final L4 b;
    public final L4 c;
    public final L4 d;
    public final boolean e;

    public C4070h01(String str, int i, L4 l4, L4 l42, L4 l43, boolean z) {
        this.a = i;
        this.b = l4;
        this.c = l42;
        this.d = l43;
        this.e = z;
    }

    @Override // defpackage.InterfaceC0326Dy
    public final InterfaceC6937ry a(C5948mm0 c5948mm0, C1847Xl0 c1847Xl0, AbstractC6120ng abstractC6120ng) {
        return new C3428dd1(abstractC6120ng, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
