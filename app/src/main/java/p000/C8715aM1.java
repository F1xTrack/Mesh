package p000;

/* renamed from: aM1 */
/* loaded from: classes.dex */
public final class C8715aM1 extends EE1 {
    private static final C8715aM1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C8715aM1 c8715aM1 = new C8715aM1();
        zzb = c8715aM1;
        EE1.m2094i(C8715aM1.class, c8715aM1);
    }

    /* renamed from: n */
    public static /* synthetic */ void m9716n(C8715aM1 c8715aM1, int i) {
        c8715aM1.zzd |= 1;
        c8715aM1.zze = i;
    }

    /* renamed from: o */
    public static /* synthetic */ void m9717o(C8715aM1 c8715aM1, String str) {
        str.getClass();
        c8715aM1.zzd |= 2;
        c8715aM1.zzf = str;
    }

    /* renamed from: p */
    public static /* synthetic */ void m9718p(C8715aM1 c8715aM1, String str) {
        c8715aM1.zzd |= 8;
        c8715aM1.zzh = str;
    }

    /* renamed from: q */
    public static /* synthetic */ void m9719q(C8715aM1 c8715aM1, int i) {
        c8715aM1.zzg = i - 1;
        c8715aM1.zzd |= 4;
    }

    /* renamed from: r */
    public static KL1 m9720r() {
        return (KL1) zzb.m2095d();
    }

    @Override // p000.EE1
    /* renamed from: m */
    public final Object mo1649m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C11150tL1.f43024c, "zzh"});
        }
        if (i2 == 3) {
            return new C8715aM1();
        }
        if (i2 == 4) {
            return new KL1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
