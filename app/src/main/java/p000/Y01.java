package p000;

import java.util.List;

/* loaded from: classes2.dex */
public final class Y01 extends X01 {

    /* renamed from: b */
    public final InterfaceC8101Pd1 f14093b;

    /* renamed from: c */
    public final List f14094c;

    /* renamed from: d */
    public final boolean f14095d;

    /* renamed from: e */
    public final InterfaceC10059kq0 f14096e;

    /* renamed from: f */
    public final InterfaceC6497nZ f14097f;

    public Y01(InterfaceC8101Pd1 interfaceC8101Pd1, List list, boolean z, InterfaceC10059kq0 interfaceC10059kq0, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(interfaceC8101Pd1, "constructor");
        O90.m5968f(list, "arguments");
        O90.m5968f(interfaceC10059kq0, "memberScope");
        this.f14093b = interfaceC8101Pd1;
        this.f14094c = list;
        this.f14095d = z;
        this.f14096e = interfaceC10059kq0;
        this.f14097f = interfaceC6497nZ;
        if (!(interfaceC10059kq0 instanceof C3988eP) || (interfaceC10059kq0 instanceof C9260ea1)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + interfaceC10059kq0 + '\n' + interfaceC8101Pd1);
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: B */
    public final C7789Jd1 mo3796B() {
        C7789Jd1.f5652b.getClass();
        return C7789Jd1.f5653c;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: E */
    public final InterfaceC8101Pd1 mo3797E() {
        return this.f14093b;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: G */
    public final boolean mo3798G() {
        return this.f14095d;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: I */
    public final AbstractC7742Ig0 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        X01 x01 = (X01) this.f14097f.invoke(c8054Og0);
        return x01 == null ? this : x01;
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: R */
    public final AbstractC8315Tg1 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        X01 x01 = (X01) this.f14097f.invoke(c8054Og0);
        return x01 == null ? this : x01;
    }

    @Override // p000.X01
    /* renamed from: U */
    public final X01 mo250P(boolean z) {
        return z == this.f14095d ? this : z ? new C8240Rv0(this, 1) : new C8240Rv0(this, 0);
    }

    @Override // p000.X01
    /* renamed from: a0 */
    public final X01 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return c7789Jd1.isEmpty() ? this : new C8670a11(this, c7789Jd1);
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: d0 */
    public final InterfaceC10059kq0 mo3799d0() {
        return this.f14096e;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: u */
    public final List mo3800u() {
        return this.f14094c;
    }
}
