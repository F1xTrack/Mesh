package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sA */
/* loaded from: classes.dex */
public final class C6978sA implements InterfaceC6787rA {
    public static final C0240Cv0 c = new C0240Cv0(11);
    public final C0249Cy0 a;
    public final AtomicReference b = new AtomicReference(null);

    public C6978sA(C0249Cy0 c0249Cy0) {
        this.a = c0249Cy0;
        c0249Cy0.a(new B7(24, this));
    }

    @Override // defpackage.InterfaceC6787rA
    public final InterfaceC7117su0 a(String str) {
        InterfaceC6787rA interfaceC6787rA = (InterfaceC6787rA) this.b.get();
        return interfaceC6787rA == null ? c : interfaceC6787rA.a(str);
    }

    @Override // defpackage.InterfaceC6787rA
    public final boolean b() {
        InterfaceC6787rA interfaceC6787rA = (InterfaceC6787rA) this.b.get();
        return interfaceC6787rA != null && interfaceC6787rA.b();
    }

    @Override // defpackage.InterfaceC6787rA
    public final boolean c(String str) {
        InterfaceC6787rA interfaceC6787rA = (InterfaceC6787rA) this.b.get();
        return interfaceC6787rA != null && interfaceC6787rA.c(str);
    }

    @Override // defpackage.InterfaceC6787rA
    public final void d(String str, long j, C0110Be c0110Be) {
        this.a.a(new C0086Aw(str, j, c0110Be, 1));
    }
}
