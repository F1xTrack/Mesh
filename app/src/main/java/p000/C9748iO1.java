package p000;

/* renamed from: iO1 */
/* loaded from: classes.dex */
public final class C9748iO1 extends EE1 {
    private static final C9748iO1 zzb;
    private int zzd;
    private int zze;

    static {
        C9748iO1 c9748iO1 = new C9748iO1();
        zzb = c9748iO1;
        EE1.m2094i(C9748iO1.class, c9748iO1);
    }

    /* renamed from: n */
    public static C9748iO1 m19027n() {
        return zzb;
    }

    @Override // p000.EE1
    /* renamed from: m */
    public final Object mo1649m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C11150tL1.f43028g});
        }
        if (i2 == 3) {
            return new C9748iO1();
        }
        if (i2 == 4) {
            return new C8975cO1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
