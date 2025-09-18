package defpackage;

/* renamed from: hG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4120hG implements InterfaceC0453Fo0 {
    public final C4277i41 a;
    public final C3390dR b;
    public AbstractC0038Ag c;
    public InterfaceC0453Fo0 d;
    public boolean e = true;
    public boolean f;

    public C4120hG(C3390dR c3390dR, M71 m71) {
        this.b = c3390dR;
        this.a = new C4277i41(m71);
    }

    @Override // defpackage.InterfaceC0453Fo0
    public final void a(CB0 cb0) {
        InterfaceC0453Fo0 interfaceC0453Fo0 = this.d;
        if (interfaceC0453Fo0 != null) {
            interfaceC0453Fo0.a(cb0);
            cb0 = this.d.e();
        }
        this.a.a(cb0);
    }

    @Override // defpackage.InterfaceC0453Fo0
    public final long b() {
        if (this.e) {
            return this.a.b();
        }
        InterfaceC0453Fo0 interfaceC0453Fo0 = this.d;
        interfaceC0453Fo0.getClass();
        return interfaceC0453Fo0.b();
    }

    @Override // defpackage.InterfaceC0453Fo0
    public final boolean c() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        InterfaceC0453Fo0 interfaceC0453Fo0 = this.d;
        interfaceC0453Fo0.getClass();
        return interfaceC0453Fo0.c();
    }

    @Override // defpackage.InterfaceC0453Fo0
    public final CB0 e() {
        InterfaceC0453Fo0 interfaceC0453Fo0 = this.d;
        return interfaceC0453Fo0 != null ? interfaceC0453Fo0.e() : (CB0) this.a.e;
    }
}
