package defpackage;

/* loaded from: classes.dex */
public abstract class AZ1 {
    public static final EnumC0346Ee1 a(EnumC4015gi1 enumC4015gi1) {
        int iOrdinal = enumC4015gi1.ordinal();
        if (iOrdinal == 0) {
            return EnumC0346Ee1.d;
        }
        if (iOrdinal == 1) {
            return EnumC0346Ee1.b;
        }
        if (iOrdinal == 2) {
            return EnumC0346Ee1.c;
        }
        throw new C7074sg();
    }

    public static final Object b(long j, AbstractC1963Yy abstractC1963Yy) {
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        if (j <= 0) {
            return c1518Tf1;
        }
        C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(abstractC1963Yy));
        c0767Jp.s();
        if (j < Long.MAX_VALUE) {
            c(c0767Jp.e).e(j, c0767Jp);
        }
        Object objR = c0767Jp.r();
        return objR == EnumC1030Mz.a ? objR : c1518Tf1;
    }

    public static final InterfaceC7381uH c(InterfaceC0173Bz interfaceC0173Bz) {
        InterfaceC8464zz interfaceC8464zzG = interfaceC0173Bz.g(C0240Cv0.c);
        InterfaceC7381uH interfaceC7381uH = interfaceC8464zzG instanceof InterfaceC7381uH ? (InterfaceC7381uH) interfaceC8464zzG : null;
        return interfaceC7381uH == null ? AbstractC7184tF.a : interfaceC7381uH;
    }
}
