package p000;

import java.util.List;

/* renamed from: ov0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10581ov0 extends X01 implements InterfaceC6642pq {

    /* renamed from: b */
    public final EnumC6262jq f39354b;

    /* renamed from: c */
    public final C10709pv0 f39355c;

    /* renamed from: d */
    public final AbstractC8315Tg1 f39356d;

    /* renamed from: e */
    public final C7789Jd1 f39357e;

    /* renamed from: f */
    public final boolean f39358f;

    /* renamed from: g */
    public final boolean f39359g;

    public C10581ov0(EnumC6262jq enumC6262jq, C10709pv0 c10709pv0, AbstractC8315Tg1 abstractC8315Tg1, C7789Jd1 c7789Jd1, boolean z, boolean z2) {
        O90.m5968f(enumC6262jq, "captureStatus");
        O90.m5968f(c10709pv0, "constructor");
        O90.m5968f(c7789Jd1, "attributes");
        this.f39354b = enumC6262jq;
        this.f39355c = c10709pv0;
        this.f39356d = abstractC8315Tg1;
        this.f39357e = c7789Jd1;
        this.f39358f = z;
        this.f39359g = z2;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: B */
    public final C7789Jd1 mo3796B() {
        return this.f39357e;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: E */
    public final InterfaceC8101Pd1 mo3797E() {
        return this.f39355c;
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: G */
    public final boolean mo3798G() {
        return this.f39358f;
    }

    @Override // p000.X01, p000.AbstractC8315Tg1
    /* renamed from: P */
    public final AbstractC8315Tg1 mo250P(boolean z) {
        return new C10581ov0(this.f39354b, this.f39355c, this.f39356d, this.f39357e, z, 32);
    }

    @Override // p000.X01
    /* renamed from: U */
    public final X01 mo250P(boolean z) {
        return new C10581ov0(this.f39354b, this.f39355c, this.f39356d, this.f39357e, z, 32);
    }

    @Override // p000.X01
    /* renamed from: a0 */
    public final X01 mo252T(C7789Jd1 c7789Jd1) {
        O90.m5968f(c7789Jd1, "newAttributes");
        return new C10581ov0(this.f39354b, this.f39355c, this.f39356d, c7789Jd1, this.f39358f, this.f39359g);
    }

    @Override // p000.AbstractC8315Tg1
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C10581ov0 mo249I(C8054Og0 c8054Og0) {
        O90.m5968f(c8054Og0, "kotlinTypeRefiner");
        C10709pv0 c10709pv0 = this.f39355c;
        c10709pv0.getClass();
        AbstractC10804qe1 abstractC10804qe1Mo24040d = c10709pv0.f40434a.mo24040d(c8054Og0);
        C7053w5 c7053w5 = c10709pv0.f40435b != null ? new C7053w5(c10709pv0, 20, c8054Og0) : null;
        C10709pv0 c10709pv02 = c10709pv0.f40436c;
        if (c10709pv02 == null) {
            c10709pv02 = c10709pv0;
        }
        C10709pv0 c10709pv03 = new C10709pv0(abstractC10804qe1Mo24040d, c7053w5, c10709pv02, c10709pv0.f40437d);
        AbstractC8315Tg1 abstractC8315Tg1 = this.f39356d;
        return new C10581ov0(this.f39354b, c10709pv03, abstractC8315Tg1 != null ? abstractC8315Tg1 : null, this.f39357e, this.f39358f, 32);
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: d0 */
    public final InterfaceC10059kq0 mo3799d0() {
        return C6298kP.m22195a(EnumC4051fP.f27176b, true, new String[0]);
    }

    @Override // p000.AbstractC7742Ig0
    /* renamed from: u */
    public final List mo3800u() {
        return C0779MN.f7117a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10581ov0(EnumC6262jq enumC6262jq, C10709pv0 c10709pv0, AbstractC8315Tg1 abstractC8315Tg1, C7789Jd1 c7789Jd1, boolean z, int i) {
        if ((i & 8) != 0) {
            C7789Jd1.f5652b.getClass();
            c7789Jd1 = C7789Jd1.f5653c;
        }
        this(enumC6262jq, c10709pv0, abstractC8315Tg1, c7789Jd1, (i & 16) != 0 ? false : z, false);
    }
}
