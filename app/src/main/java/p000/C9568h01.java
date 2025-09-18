package p000;

/* renamed from: h01 */
/* loaded from: classes.dex */
public final class C9568h01 implements InterfaceC0250Dy {

    /* renamed from: a */
    public final int f28148a;

    /* renamed from: b */
    public final C0698L4 f28149b;

    /* renamed from: c */
    public final C0698L4 f28150c;

    /* renamed from: d */
    public final C0698L4 f28151d;

    /* renamed from: e */
    public final boolean f28152e;

    public C9568h01(String str, int i, C0698L4 c0698l4, C0698L4 c0698l42, C0698L4 c0698l43, boolean z) {
        this.f28148a = i;
        this.f28149b = c0698l4;
        this.f28150c = c0698l42;
        this.f28151d = c0698l43;
        this.f28152e = z;
    }

    @Override // p000.InterfaceC0250Dy
    /* renamed from: a */
    public final InterfaceC6793ry mo1954a(C10307mm0 c10307mm0, C8532Xl0 c8532Xl0, AbstractC6504ng abstractC6504ng) {
        return new C9138dd1(abstractC6504ng, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f28149b + ", end: " + this.f28150c + ", offset: " + this.f28151d + "}";
    }
}
