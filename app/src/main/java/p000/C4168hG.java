package p000;

/* renamed from: hG */
/* loaded from: classes.dex */
public final class C4168hG implements InterfaceC7602Fo0 {

    /* renamed from: a */
    public final C9708i41 f28352a;

    /* renamed from: b */
    public final C3928dR f28353b;

    /* renamed from: c */
    public AbstractC0043Ag f28354c;

    /* renamed from: d */
    public InterfaceC7602Fo0 f28355d;

    /* renamed from: e */
    public boolean f28356e = true;

    /* renamed from: f */
    public boolean f28357f;

    public C4168hG(C3928dR c3928dR, M71 m71) {
        this.f28353b = c3928dR;
        this.f28352a = new C9708i41(m71);
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: a */
    public final void mo2784a(CB0 cb0) {
        InterfaceC7602Fo0 interfaceC7602Fo0 = this.f28355d;
        if (interfaceC7602Fo0 != null) {
            interfaceC7602Fo0.mo2784a(cb0);
            cb0 = this.f28355d.mo2787e();
        }
        this.f28352a.mo2784a(cb0);
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: b */
    public final long mo2785b() {
        if (this.f28356e) {
            return this.f28352a.mo2785b();
        }
        InterfaceC7602Fo0 interfaceC7602Fo0 = this.f28355d;
        interfaceC7602Fo0.getClass();
        return interfaceC7602Fo0.mo2785b();
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: c */
    public final boolean mo2786c() {
        if (this.f28356e) {
            this.f28352a.getClass();
            return false;
        }
        InterfaceC7602Fo0 interfaceC7602Fo0 = this.f28355d;
        interfaceC7602Fo0.getClass();
        return interfaceC7602Fo0.mo2786c();
    }

    @Override // p000.InterfaceC7602Fo0
    /* renamed from: e */
    public final CB0 mo2787e() {
        InterfaceC7602Fo0 interfaceC7602Fo0 = this.f28355d;
        return interfaceC7602Fo0 != null ? interfaceC7602Fo0.mo2787e() : (CB0) this.f28352a.f28814e;
    }
}
