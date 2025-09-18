package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class WO extends C8063xs {
    /* JADX WARN: Illegal instructions before constructor call */
    public WO(C1559Tt0 c1559Tt0) {
        C5496kP c5496kP = C5496kP.a;
        C2127aP c2127aP = C5496kP.b;
        EnumC6348os0 enumC6348os0 = EnumC6348os0.d;
        EnumC0152Bs enumC0152Bs = EnumC0152Bs.a;
        List list = MN.a;
        C0162Bv0 c0162Bv0 = W21.O0;
        super(c2127aP, c1559Tt0, enumC6348os0, enumC0152Bs, list, C1922Yk0.e);
        C6729qs c6729qs = new C6729qs(this, null, S20.b, true, 1, c0162Bv0);
        c6729qs.M1(list, AbstractC7765wI.d);
        EnumC3765fP enumC3765fP = EnumC3765fP.f;
        String str = c6729qs.getName().a;
        O90.e(str, "toString(...)");
        C3574eP c3574ePB = C5496kP.b(enumC3765fP, str, "");
        EnumC5305jP enumC5305jP = EnumC5305jP.v;
        c6729qs.h = new C4147hP(C5496kP.d(enumC5305jP, new String[0]), c3574ePB, enumC5305jP, list, false, new String[0]);
        u(c3574ePB, AbstractC7627vZ0.e(c6729qs), c6729qs);
    }

    @Override // defpackage.D, defpackage.R51
    public final ED b(C7833we1 c7833we1) {
        O90.f(c7833we1, "substitutor");
        return this;
    }

    @Override // defpackage.D, defpackage.AbstractC8064xs0
    public final InterfaceC5578kq0 k(AbstractC7452ue1 abstractC7452ue1, C1130Og0 c1130Og0) {
        EnumC3765fP enumC3765fP = EnumC3765fP.f;
        String str = getName().a;
        O90.e(str, "toString(...)");
        return C5496kP.b(enumC3765fP, str, abstractC7452ue1.toString());
    }

    @Override // defpackage.D
    /* renamed from: t */
    public final InterfaceC7492us b(C7833we1 c7833we1) {
        O90.f(c7833we1, "substitutor");
        return this;
    }

    @Override // defpackage.C8063xs
    public final String toString() {
        String strB = getName().b();
        O90.e(strB, "asString(...)");
        return strB;
    }
}
