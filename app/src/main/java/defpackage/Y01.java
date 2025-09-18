package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class Y01 extends X01 {
    public final InterfaceC1200Pd1 b;
    public final List c;
    public final boolean d;
    public final InterfaceC5578kq0 e;
    public final InterfaceC6099nZ f;

    public Y01(InterfaceC1200Pd1 interfaceC1200Pd1, List list, boolean z, InterfaceC5578kq0 interfaceC5578kq0, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(interfaceC1200Pd1, "constructor");
        O90.f(list, "arguments");
        O90.f(interfaceC5578kq0, "memberScope");
        this.b = interfaceC1200Pd1;
        this.c = list;
        this.d = z;
        this.e = interfaceC5578kq0;
        this.f = interfaceC6099nZ;
        if (!(interfaceC5578kq0 instanceof C3574eP) || (interfaceC5578kq0 instanceof C3609ea1)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + interfaceC5578kq0 + '\n' + interfaceC1200Pd1);
    }

    @Override // defpackage.AbstractC0663Ig0
    public final C0733Jd1 B() {
        C0733Jd1.b.getClass();
        return C0733Jd1.c;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final InterfaceC1200Pd1 E() {
        return this.b;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final boolean G() {
        return this.d;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final AbstractC0663Ig0 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        X01 x01 = (X01) this.f.invoke(c1130Og0);
        return x01 == null ? this : x01;
    }

    @Override // defpackage.AbstractC1521Tg1
    /* renamed from: R */
    public final AbstractC1521Tg1 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        X01 x01 = (X01) this.f.invoke(c1130Og0);
        return x01 == null ? this : x01;
    }

    @Override // defpackage.X01
    /* renamed from: U */
    public final X01 P(boolean z) {
        return z == this.d ? this : z ? new C1409Rv0(this, 1) : new C1409Rv0(this, 0);
    }

    @Override // defpackage.X01
    /* renamed from: a0 */
    public final X01 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return c0733Jd1.isEmpty() ? this : new C2054a11(this, c0733Jd1);
    }

    @Override // defpackage.AbstractC0663Ig0
    public final InterfaceC5578kq0 d0() {
        return this.e;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final List u() {
        return this.c;
    }
}
