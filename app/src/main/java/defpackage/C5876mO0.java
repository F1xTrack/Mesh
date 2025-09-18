package defpackage;

/* renamed from: mO0 */
/* loaded from: classes.dex */
public final class C5876mO0 implements InterfaceC0326Dy {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final L4 c;
    public final boolean d;
    public final R4 e;
    public final Object f;

    public C5876mO0(String str, L4 l4, L4 l42, P4 p4, boolean z) {
        this.b = str;
        this.c = l4;
        this.e = l42;
        this.f = p4;
        this.d = z;
    }

    @Override // defpackage.InterfaceC0326Dy
    public final InterfaceC6937ry a(C5948mm0 c5948mm0, C1847Xl0 c1847Xl0, AbstractC6120ng abstractC6120ng) {
        switch (this.a) {
            case 0:
                return new C5685lO0(c5948mm0, abstractC6120ng, this);
            default:
                return new C3963gR0(c5948mm0, abstractC6120ng, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((K4) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public C5876mO0(String str, R4 r4, K4 k4, L4 l4, boolean z) {
        this.b = str;
        this.e = r4;
        this.f = k4;
        this.c = l4;
        this.d = z;
    }
}
