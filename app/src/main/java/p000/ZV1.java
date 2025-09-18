package p000;

/* loaded from: classes.dex */
public final class ZV1 extends QG1 implements KI1 {
    private static final ZV1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private C10782qT1 zzj;
    private C10782qT1 zzk;

    static {
        ZV1 zv1 = new ZV1();
        zzb = zv1;
        QG1.m6620h(ZV1.class, zv1);
    }

    /* renamed from: p */
    public static ZV1 m9540p() {
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
            return new C11910zJ1(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new ZV1();
        }
        if (i2 == 4) {
            return new C10904rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: n */
    public final C10782qT1 m9541n() {
        C10782qT1 c10782qT1 = this.zzk;
        return c10782qT1 == null ? C10782qT1.m24006t() : c10782qT1;
    }

    /* renamed from: o */
    public final C10782qT1 m9542o() {
        C10782qT1 c10782qT1 = this.zzj;
        return c10782qT1 == null ? C10782qT1.m24006t() : c10782qT1;
    }

    /* renamed from: q */
    public final String m9543q() {
        return this.zzf;
    }

    /* renamed from: r */
    public final String m9544r() {
        return this.zzg;
    }

    /* renamed from: s */
    public final String m9545s() {
        return this.zzh;
    }

    /* renamed from: t */
    public final String m9546t() {
        return this.zzi;
    }

    /* renamed from: u */
    public final String m9547u() {
        return this.zze;
    }
}
