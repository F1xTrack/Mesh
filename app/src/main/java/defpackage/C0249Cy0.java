package defpackage;

/* renamed from: Cy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249Cy0 implements InterfaceC3739fG0 {
    public static final C0681Im0 c = new C0681Im0(14);
    public static final C1096Nv d = new C1096Nv(9);
    public InterfaceC5281jH a;
    public volatile InterfaceC3739fG0 b;

    public C0249Cy0(C0681Im0 c0681Im0, InterfaceC3739fG0 interfaceC3739fG0) {
        this.a = c0681Im0;
        this.b = interfaceC3739fG0;
    }

    public final void a(InterfaceC5281jH interfaceC5281jH) {
        InterfaceC3739fG0 interfaceC3739fG0;
        InterfaceC3739fG0 interfaceC3739fG02;
        InterfaceC3739fG0 interfaceC3739fG03 = this.b;
        C1096Nv c1096Nv = d;
        if (interfaceC3739fG03 != c1096Nv) {
            interfaceC5281jH.h(interfaceC3739fG03);
            return;
        }
        synchronized (this) {
            interfaceC3739fG0 = this.b;
            if (interfaceC3739fG0 != c1096Nv) {
                interfaceC3739fG02 = interfaceC3739fG0;
            } else {
                this.a = new H30(this.a, 3, interfaceC5281jH);
                interfaceC3739fG02 = null;
            }
        }
        if (interfaceC3739fG02 != null) {
            interfaceC5281jH.h(interfaceC3739fG0);
        }
    }

    @Override // defpackage.InterfaceC3739fG0
    public final Object get() {
        return this.b.get();
    }
}
