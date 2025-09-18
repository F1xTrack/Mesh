package p000;

/* renamed from: pd0 */
/* loaded from: classes2.dex */
public final class C10673pd0 implements InterfaceC0586JI {

    /* renamed from: a */
    public final C9137dd0 f40245a;

    /* renamed from: b */
    public final C9137dd0 f40246b;

    /* renamed from: c */
    public final C11667xP0 f40247c;

    public C10673pd0(C11667xP0 c11667xP0, C10241mF0 c10241mF0, C10545od0 c10545od0, EnumC0523II enumC0523II) {
        O90.m5968f(c11667xP0, "kotlinClass");
        O90.m5968f(c10241mF0, "packageProto");
        O90.m5968f(c10545od0, "nameResolver");
        C9137dd0 c9137dd0M17715b = C9137dd0.m17715b(VO0.m8433a(c11667xP0.f45572a));
        C6250je c6250je = c11667xP0.f45573b;
        C9137dd0 c9137dd0M17717d = null;
        String str = ((EnumC7326Ag0) c6250je.f35299d) == EnumC7326Ag0.f330i ? (String) c6250je.f35298c : null;
        if (str != null && str.length() > 0) {
            c9137dd0M17717d = C9137dd0.m17717d(str);
        }
        this.f40245a = c9137dd0M17715b;
        this.f40246b = c9137dd0M17717d;
        this.f40247c = c11667xP0;
        C11741y00 c11741y00 = AbstractC7736Id0.f5061m;
        O90.m5967e(c11741y00, "packageModuleName");
        Integer num = (Integer) XM1.m8993a(c10241mF0, c11741y00);
        if (num != null) {
            c10545od0.getString(num.intValue());
        }
    }

    /* renamed from: a */
    public final C0055As m23824a() {
        C0664KX c0664kx;
        C9137dd0 c9137dd0 = this.f40245a;
        String str = c9137dd0.f26169a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            c0664kx = C0664KX.f6145c;
            if (c0664kx == null) {
                C9137dd0.m17714a(7);
                throw null;
            }
        } else {
            c0664kx = new C0664KX(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strM17718e = c9137dd0.m17718e();
        O90.m5967e(strM17718e, "getInternalName(...)");
        return new C0055As(c0664kx, C8340Tt0.m7798e(AbstractC11374v51.m25346U('/', strM17718e, strM17718e)));
    }

    public final String toString() {
        return C10673pd0.class.getSimpleName() + ": " + this.f40245a;
    }
}
