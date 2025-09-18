package p000;

/* renamed from: Cy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7466Cy0 implements InterfaceC9347fG0 {

    /* renamed from: c */
    public static final C7754Im0 f1784c = new C7754Im0(14);

    /* renamed from: d */
    public static final C0876Nv f1785d = new C0876Nv(9);

    /* renamed from: a */
    public InterfaceC6227jH f1786a;

    /* renamed from: b */
    public volatile InterfaceC9347fG0 f1787b;

    public C7466Cy0(C7754Im0 c7754Im0, InterfaceC9347fG0 interfaceC9347fG0) {
        this.f1786a = c7754Im0;
        this.f1787b = interfaceC9347fG0;
    }

    /* renamed from: a */
    public final void m1482a(InterfaceC6227jH interfaceC6227jH) {
        InterfaceC9347fG0 interfaceC9347fG0;
        InterfaceC9347fG0 interfaceC9347fG02;
        InterfaceC9347fG0 interfaceC9347fG03 = this.f1787b;
        C0876Nv c0876Nv = f1785d;
        if (interfaceC9347fG03 != c0876Nv) {
            interfaceC6227jH.mo410h(interfaceC9347fG03);
            return;
        }
        synchronized (this) {
            interfaceC9347fG0 = this.f1787b;
            if (interfaceC9347fG0 != c0876Nv) {
                interfaceC9347fG02 = interfaceC9347fG0;
            } else {
                this.f1786a = new H30(this.f1786a, 3, interfaceC6227jH);
                interfaceC9347fG02 = null;
            }
        }
        if (interfaceC9347fG02 != null) {
            interfaceC6227jH.mo410h(interfaceC9347fG0);
        }
    }

    @Override // p000.InterfaceC9347fG0
    public final Object get() {
        return this.f1787b.get();
    }
}
