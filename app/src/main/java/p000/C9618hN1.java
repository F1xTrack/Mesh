package p000;

/* renamed from: hN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9618hN1 extends EE1 {
    private static final C9618hN1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C9618hN1 c9618hN1 = new C9618hN1();
        zzb = c9618hN1;
        EE1.m2094i(C9618hN1.class, c9618hN1);
    }

    /* renamed from: n */
    public static /* synthetic */ void m18810n(C9618hN1 c9618hN1) {
        c9618hN1.zzd |= 2;
        c9618hN1.zzf = false;
    }

    /* renamed from: o */
    public static C9106dN1 m18811o() {
        return (C9106dN1) zzb.m2095d();
    }

    @Override // p000.EE1
    /* renamed from: m */
    public final Object mo1649m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C9618hN1();
        }
        if (i2 == 4) {
            return new C9106dN1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
