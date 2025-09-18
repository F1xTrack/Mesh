package defpackage;

import java.util.List;

/* renamed from: kq */
/* loaded from: classes2.dex */
public final class C5577kq extends X01 implements InterfaceC6532pq {
    public final AbstractC6689qe1 b;
    public final InterfaceC5959mq c;
    public final boolean d;
    public final C0733Jd1 e;

    public C5577kq(AbstractC6689qe1 abstractC6689qe1, InterfaceC5959mq interfaceC5959mq, boolean z, C0733Jd1 c0733Jd1) {
        O90.f(abstractC6689qe1, "typeProjection");
        O90.f(interfaceC5959mq, "constructor");
        O90.f(c0733Jd1, "attributes");
        this.b = abstractC6689qe1;
        this.c = interfaceC5959mq;
        this.d = z;
        this.e = c0733Jd1;
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
        return this.d;
    }

    @Override // defpackage.AbstractC0663Ig0
    public final AbstractC0663Ig0 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        return new C5577kq(this.b.d(c1130Og0), this.c, this.d, this.e);
    }

    @Override // defpackage.X01, defpackage.AbstractC1521Tg1
    public final AbstractC1521Tg1 P(boolean z) {
        if (z == this.d) {
            return this;
        }
        return new C5577kq(this.b, this.c, z, this.e);
    }

    @Override // defpackage.AbstractC1521Tg1
    /* renamed from: R */
    public final AbstractC1521Tg1 I(C1130Og0 c1130Og0) {
        O90.f(c1130Og0, "kotlinTypeRefiner");
        return new C5577kq(this.b.d(c1130Og0), this.c, this.d, this.e);
    }

    @Override // defpackage.X01
    /* renamed from: U */
    public final X01 P(boolean z) {
        if (z == this.d) {
            return this;
        }
        return new C5577kq(this.b, this.c, z, this.e);
    }

    @Override // defpackage.X01
    /* renamed from: a0 */
    public final X01 T(C0733Jd1 c0733Jd1) {
        O90.f(c0733Jd1, "newAttributes");
        return new C5577kq(this.b, this.c, this.d, c0733Jd1);
    }

    @Override // defpackage.AbstractC0663Ig0
    public final InterfaceC5578kq0 d0() {
        return C5496kP.a(EnumC3765fP.b, true, new String[0]);
    }

    @Override // defpackage.X01
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.b);
        sb.append(')');
        sb.append(this.d ? "?" : "");
        return sb.toString();
    }

    @Override // defpackage.AbstractC0663Ig0
    public final List u() {
        return MN.a;
    }
}
