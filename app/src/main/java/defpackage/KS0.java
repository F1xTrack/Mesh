package defpackage;

import androidx.lifecycle.b;

/* loaded from: classes.dex */
public final class KS0 extends AbstractC6856rX {
    public final InterfaceC6907ro b;
    public final AbstractC3987gZ0 c;
    public final InterfaceC0605Hn d;

    public KS0(InterfaceC6907ro interfaceC6907ro, InterfaceC0605Hn interfaceC0605Hn) {
        super(interfaceC6907ro);
        this.b = interfaceC6907ro;
        this.d = interfaceC0605Hn;
        this.c = interfaceC0605Hn.V();
        interfaceC0605Hn.B();
        interfaceC0605Hn.k0();
    }

    @Override // defpackage.AbstractC6856rX, defpackage.InterfaceC6907ro
    public final b f() {
        return !NR1.b(this.c, 6) ? new C0390Et0(0) : this.b.f();
    }

    @Override // defpackage.AbstractC6856rX, defpackage.InterfaceC6907ro
    public final InterfaceC6907ro g() {
        return this.b;
    }

    @Override // defpackage.AbstractC6856rX, defpackage.InterfaceC6907ro
    public final InterfaceC7411uR h() {
        return !NR1.b(this.c, 7) ? new C0162Bv0(20) : this.b.h();
    }

    @Override // defpackage.AbstractC6856rX, defpackage.InterfaceC6907ro
    public final boolean i(PT pt) {
        PT ptA = NR1.a(this.c, pt);
        if (ptA == null) {
            return false;
        }
        return this.b.i(ptA);
    }

    @Override // defpackage.AbstractC6856rX, defpackage.InterfaceC6907ro
    public final boolean r() {
        if (NR1.b(this.c, 5)) {
            return this.b.r();
        }
        return false;
    }

    @Override // defpackage.AbstractC6856rX, defpackage.InterfaceC6907ro
    public final b x() {
        return !NR1.b(this.c, 0) ? new C0390Et0(new C1198Pd(1.0f, 1.0f, 1.0f, 0.0f)) : this.b.x();
    }
}
