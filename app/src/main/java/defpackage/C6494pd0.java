package defpackage;

/* renamed from: pd0 */
/* loaded from: classes2.dex */
public final class C6494pd0 implements JI {
    public final C3427dd0 a;
    public final C3427dd0 b;
    public final C7977xP0 c;

    public C6494pd0(C7977xP0 c7977xP0, C5849mF0 c5849mF0, C6303od0 c6303od0, II ii) {
        O90.f(c7977xP0, "kotlinClass");
        O90.f(c5849mF0, "packageProto");
        O90.f(c6303od0, "nameResolver");
        C3427dd0 c3427dd0B = C3427dd0.b(VO0.a(c7977xP0.a));
        C5350je c5350je = c7977xP0.b;
        C3427dd0 c3427dd0D = null;
        String str = ((EnumC0039Ag0) c5350je.d) == EnumC0039Ag0.i ? (String) c5350je.c : null;
        if (str != null && str.length() > 0) {
            c3427dd0D = C3427dd0.d(str);
        }
        this.a = c3427dd0B;
        this.b = c3427dd0D;
        this.c = c7977xP0;
        C8089y00 c8089y00 = AbstractC0654Id0.m;
        O90.e(c8089y00, "packageModuleName");
        Integer num = (Integer) XM1.a(c5849mF0, c8089y00);
        if (num != null) {
            c6303od0.getString(num.intValue());
        }
    }

    public final C0074As a() {
        KX kx;
        C3427dd0 c3427dd0 = this.a;
        String str = c3427dd0.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            kx = KX.c;
            if (kx == null) {
                C3427dd0.a(7);
                throw null;
            }
        } else {
            kx = new KX(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strE = c3427dd0.e();
        O90.e(strE, "getInternalName(...)");
        return new C0074As(kx, C1559Tt0.e(AbstractC7538v51.U('/', strE, strE)));
    }

    public final String toString() {
        return C6494pd0.class.getSimpleName() + ": " + this.a;
    }
}
