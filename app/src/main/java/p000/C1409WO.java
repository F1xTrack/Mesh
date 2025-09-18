package p000;

import java.util.List;

/* renamed from: WO */
/* loaded from: classes2.dex */
public final class C1409WO extends C7165xs {
    /* JADX WARN: Illegal instructions before constructor call */
    public C1409WO(C8340Tt0 c8340Tt0) {
        C6298kP c6298kP = C6298kP.f36482a;
        C1662aP c1662aP = C6298kP.f36483b;
        EnumC10575os0 enumC10575os0 = EnumC10575os0.f39325d;
        EnumC0118Bs enumC0118Bs = EnumC0118Bs.f1060a;
        List list = C0779MN.f7117a;
        C7408Bv0 c7408Bv0 = W21.f12940O0;
        super(c1662aP, c8340Tt0, enumC10575os0, enumC0118Bs, list, C8582Yk0.f14497e);
        C6707qs c6707qs = new C6707qs(this, null, S20.f10539b, true, 1, c7408Bv0);
        c6707qs.m24075M1(list, AbstractC7066wI.f44763d);
        EnumC4051fP enumC4051fP = EnumC4051fP.f27180f;
        String str = c6707qs.getName().f11577a;
        O90.m5967e(str, "toString(...)");
        C3988eP c3988ePM22196b = C6298kP.m22196b(enumC4051fP, str, "");
        EnumC6235jP enumC6235jP = EnumC6235jP.f35137v;
        c6707qs.f1432h = new C4177hP(C6298kP.m22198d(enumC6235jP, new String[0]), c3988ePM22196b, enumC6235jP, list, false, new String[0]);
        m25952u(c3988ePM22196b, AbstractC11433vZ0.m25454e(c6707qs), c6707qs);
    }

    @Override // p000.AbstractC0189D, p000.R51
    /* renamed from: b */
    public final InterfaceC0266ED mo114b(C11571we1 c11571we1) {
        O90.m5968f(c11571we1, "substitutor");
        return this;
    }

    @Override // p000.AbstractC0189D, p000.AbstractC11725xs0
    /* renamed from: k */
    public final InterfaceC10059kq0 mo1491k(AbstractC11316ue1 abstractC11316ue1, C8054Og0 c8054Og0) {
        EnumC4051fP enumC4051fP = EnumC4051fP.f27180f;
        String str = getName().f11577a;
        O90.m5967e(str, "toString(...)");
        return C6298kP.m22196b(enumC4051fP, str, abstractC11316ue1.toString());
    }

    @Override // p000.AbstractC0189D
    /* renamed from: t */
    public final InterfaceC6976us mo114b(C11571we1 c11571we1) {
        O90.m5968f(c11571we1, "substitutor");
        return this;
    }

    @Override // p000.C7165xs
    public final String toString() {
        String strM7801b = getName().m7801b();
        O90.m5967e(strM7801b, "asString(...)");
        return strM7801b;
    }
}
