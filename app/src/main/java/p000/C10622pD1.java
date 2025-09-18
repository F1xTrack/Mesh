package p000;

/* renamed from: pD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10622pD1 extends QG1 implements KI1 {
    private static final C10622pD1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C10622pD1 c10622pD1 = new C10622pD1();
        zzb = c10622pD1;
        QG1.m6620h(C10622pD1.class, c10622pD1);
    }

    /* renamed from: n */
    public static C10622pD1 m23643n() {
        return zzb;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C10622pD1();
        }
        if (i2 == 4) {
            return new DR1(10, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: o */
    public final String m23644o() {
        return this.zzh;
    }

    /* renamed from: p */
    public final String m23645p() {
        return this.zze;
    }

    /* renamed from: q */
    public final String m23646q() {
        return this.zzj;
    }

    /* renamed from: r */
    public final String m23647r() {
        return this.zzi;
    }

    /* renamed from: s */
    public final String m23648s() {
        return this.zzg;
    }

    /* renamed from: t */
    public final String m23649t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final String m23650u() {
        return this.zzk;
    }
}
