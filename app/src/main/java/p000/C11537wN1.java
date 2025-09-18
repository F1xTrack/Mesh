package p000;

/* renamed from: wN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11537wN1 extends EE1 {
    private static final C11537wN1 zzb;
    private int zzd;
    private int zze;

    static {
        C11537wN1 c11537wN1 = new C11537wN1();
        zzb = c11537wN1;
        EE1.m2094i(C11537wN1.class, c11537wN1);
    }

    /* renamed from: n */
    public static /* synthetic */ void m25609n(C11537wN1 c11537wN1, int i) {
        c11537wN1.zze = i - 1;
        c11537wN1.zzd |= 1;
    }

    /* renamed from: o */
    public static C10770qN1 m25610o() {
        return (C10770qN1) zzb.m2095d();
    }

    @Override // p000.EE1
    /* renamed from: m */
    public final Object mo1649m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C11150tL1.f43027f});
        }
        if (i2 == 3) {
            return new C11537wN1();
        }
        if (i2 == 4) {
            return new C10770qN1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
