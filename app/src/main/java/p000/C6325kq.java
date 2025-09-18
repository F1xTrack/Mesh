package p000;

import java.util.List;

/* renamed from: kq */
/* loaded from: classes2.dex */
public final class C6325kq extends X01 implements InterfaceC6642pq {

    /* renamed from: b */
    public final AbstractC10804qe1 f36718b;

    /* renamed from: c */
    public final InterfaceC6451mq f36719c;

    /* renamed from: d */
    public final boolean f36720d;

    /* renamed from: e */
    public final C7789Jd1 f36721e;

    public C6325kq(AbstractC10804qe1 abstractC10804qe1, InterfaceC6451mq interfaceC6451mq, boolean z, C7789Jd1 c7789Jd1) {
        O90.m5968f(abstractC10804qe1, "typeProjection");
        O90.m5968f(interfaceC6451mq, "constructor");
        O90.m5968f(c7789Jd1, "attributes");
        this.f36718b = abstractC10804qe1;
        this.f36719c = interfaceC6451mq;
        this.f36720d = z;
        this.f36721e = c7789Jd1;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: B */
    public final C7789Jd1 mo3796B() {
        return this.f36721e;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: E */
    public final InterfaceC8101Pd1 mo3797E() {
        return this.f36719c;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: G */
    public final boolean mo3798G() {
        return this.f36720d;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: I */
    public final AbstractC7742Ig0 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        return new C6325kq(this.f36718b.mo24040d(c8054Og0), this.f36719c, this.f36720d, this.f36721e);
    }

    @Override // p000.X01, p000.AbstractC8315Tg1
    /* renamed from: P */
    public final AbstractC8315Tg1 mo250P(boolean z) {
        if (z == this.f36720d) {
            return this;
        }
        return new C6325kq(this.f36718b, this.f36719c, z, this.f36721e);
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: R */
    public final AbstractC8315Tg1 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        return new C6325kq(this.f36718b.mo24040d(c8054Og0), this.f36719c, this.f36720d, this.f36721e);
    }

    @Override // p000.X01
    /* renamed from: U */
    public final X01 mo250P(boolean z) {
        if (z == this.f36720d) {
            return this;
        }
        return new C6325kq(this.f36718b, this.f36719c, z, this.f36721e);
    }

    @Override // p000.X01
    /* renamed from: a0 */
    public final X01 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return new C6325kq(this.f36718b, this.f36719c, this.f36720d, c7789Jd1);
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: d0 */
    public final InterfaceC10059kq0 mo3799d0() {
        return C6298kP.m22195a(EnumC4051fP.f27176b, true, new String[0]);
    }

    @Override // p000.X01
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f36718b);
        sb.append(')');
        sb.append(this.f36720d ? "?" : "");
        return sb.toString();
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: u */
    public final List mo3800u() {
        return C0779MN.f7117a;
    }
}
