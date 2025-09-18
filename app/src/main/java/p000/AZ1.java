package p000;

/* loaded from: classes.dex */
public abstract class AZ1 {
    /* renamed from: a */
    public static final EnumC7531Ee1 m233a(EnumC9532gi1 enumC9532gi1) {
        int iOrdinal = enumC9532gi1.ordinal();
        if (iOrdinal == 0) {
            return EnumC7531Ee1.f2821d;
        }
        if (iOrdinal == 1) {
            return EnumC7531Ee1.f2819b;
        }
        if (iOrdinal == 2) {
            return EnumC7531Ee1.f2820c;
        }
        throw new C6838sg();
    }

    /* renamed from: b */
    public static final Object m234b(long j, AbstractC1571Yy abstractC1571Yy) {
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        if (j <= 0) {
            return c8313Tf1;
        }
        C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(abstractC1571Yy));
        c0619Jp.m4439s();
        if (j < Long.MAX_VALUE) {
            m235c(c0619Jp.f5712e).mo4313e(j, c0619Jp);
        }
        Object objM4438r = c0619Jp.m4438r();
        return objM4438r == EnumC0817Mz.f7418a ? objM4438r : c8313Tf1;
    }

    /* renamed from: c */
    public static final InterfaceC6939uH m235c(InterfaceC0125Bz interfaceC0125Bz) {
        InterfaceC7298zz interfaceC7298zzMo937g = interfaceC0125Bz.mo937g(C7460Cv0.f1753c);
        InterfaceC6939uH interfaceC6939uH = interfaceC7298zzMo937g instanceof InterfaceC6939uH ? (InterfaceC6939uH) interfaceC7298zzMo937g : null;
        return interfaceC6939uH == null ? AbstractC6874tF.f42962a : interfaceC6939uH;
    }
}
