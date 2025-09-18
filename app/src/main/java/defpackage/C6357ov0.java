package defpackage;

import java.util.List;

/* renamed from: ov0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6357ov0 extends X01 implements InterfaceC6532pq {
    public final EnumC5386jq b;
    public final C6548pv0 c;
    public final AbstractC1521Tg1 d;
    public final C0733Jd1 e;
    public final boolean f;
    public final boolean g;

    public C6357ov0(EnumC5386jq enumC5386jq, C6548pv0 c6548pv0, AbstractC1521Tg1 abstractC1521Tg1, C0733Jd1 c0733Jd1, boolean z, boolean z2) {
        O90.f(enumC5386jq, "captureStatus");
        O90.f(c6548pv0, "constructor");
        O90.f(c0733Jd1, "attributes");
        this.b = enumC5386jq;
        this.c = c6548pv0;
        this.d = abstractC1521Tg1;
        this.e = c0733Jd1;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final C0733Jd1 B() {
        return this.e;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final InterfaceC1200Pd1 E() {
        return this.c;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final boolean G() {
        return this.f;
    }

    @Override // defpackage.X01, defpackage.AbstractC1521Tg1
    public final AbstractC1521Tg1 P(boolean z) {
        return new C6357ov0(this.b, this.c, this.d, this.e, z, 32);
    }

    @Override // defpackage.X01
    /* renamed from: U */
    public final X01 P(boolean z) {
        return new C6357ov0(this.b, this.c, this.d, this.e, z, 32);
    }

    @Override // defpackage.X01
    /* renamed from: a0 */
    public final X01 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return new C6357ov0(this.b, this.c, this.d, c0733Jd1, this.f, this.g);
    }

    @Override // defpackage.AbstractC1521Tg1
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C6357ov0 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        C6548pv0 c6548pv0 = this.c;
        c6548pv0.getClass();
        AbstractC6689qe1 abstractC6689qe1D = c6548pv0.a.d(c1130Og0);
        C7726w5 c7726w5 = c6548pv0.b != null ? new C7726w5(c6548pv0, 20, c1130Og0) : null;
        C6548pv0 c6548pv02 = c6548pv0.c;
        if (c6548pv02 == null) {
            c6548pv02 = c6548pv0;
        }
        C6548pv0 c6548pv03 = new C6548pv0(abstractC6689qe1D, c7726w5, c6548pv02, c6548pv0.d);
        AbstractC1521Tg1 abstractC1521Tg1 = this.d;
        return new C6357ov0(this.b, c6548pv03, abstractC1521Tg1 != null ? abstractC1521Tg1 : null, this.e, this.f, 32);
    }

    @Override // defpackage.AbstractC0663Ig0
    public final InterfaceC5578kq0 d0() {
        return C5496kP.a(EnumC3765fP.b, true, new String[0]);
    }

    @Override // defpackage.AbstractC0663Ig0
    public final List u() {
        return MN.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6357ov0(EnumC5386jq enumC5386jq, C6548pv0 c6548pv0, AbstractC1521Tg1 abstractC1521Tg1, C0733Jd1 c0733Jd1, boolean z, int i) {
        if ((i & 8) != 0) {
            C0733Jd1.b.getClass();
            c0733Jd1 = C0733Jd1.c;
        }
        this(enumC5386jq, c6548pv0, abstractC1521Tg1, c0733Jd1, (i & 16) != 0 ? false : z, false);
    }
}
