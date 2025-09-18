package p000;

/* renamed from: mO0 */
/* loaded from: classes.dex */
public final class C10259mO0 implements InterfaceC0250Dy {

    /* renamed from: a */
    public final /* synthetic */ int f37663a = 1;

    /* renamed from: b */
    public final String f37664b;

    /* renamed from: c */
    public final C0698L4 f37665c;

    /* renamed from: d */
    public final boolean f37666d;

    /* renamed from: e */
    public final InterfaceC1074R4 f37667e;

    /* renamed from: f */
    public final Object f37668f;

    public C10259mO0(String str, C0698L4 c0698l4, C0698L4 c0698l42, C0949P4 c0949p4, boolean z) {
        this.f37664b = str;
        this.f37665c = c0698l4;
        this.f37667e = c0698l42;
        this.f37668f = c0949p4;
        this.f37666d = z;
    }

    @Override // p000.InterfaceC0250Dy
    /* renamed from: a */
    public final InterfaceC6793ry mo1954a(C10307mm0 c10307mm0, C8532Xl0 c8532Xl0, AbstractC6504ng abstractC6504ng) {
        switch (this.f37663a) {
            case 0:
                return new C10131lO0(c10307mm0, abstractC6504ng, this);
            default:
                return new C9497gR0(c10307mm0, abstractC6504ng, this);
        }
    }

    public String toString() {
        switch (this.f37663a) {
            case 0:
                return "RectangleShape{position=" + this.f37667e + ", size=" + ((C0635K4) this.f37668f) + '}';
            default:
                return super.toString();
        }
    }

    public C10259mO0(String str, InterfaceC1074R4 interfaceC1074R4, C0635K4 c0635k4, C0698L4 c0698l4, boolean z) {
        this.f37664b = str;
        this.f37667e = interfaceC1074R4;
        this.f37668f = c0635k4;
        this.f37665c = c0698l4;
        this.f37666d = z;
    }
}
