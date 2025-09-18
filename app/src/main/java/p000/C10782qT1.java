package p000;

/* renamed from: qT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10782qT1 extends QG1 implements KI1 {
    private static final C10782qT1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        C10782qT1 c10782qT1 = new C10782qT1();
        zzb = c10782qT1;
        QG1.m6620h(C10782qT1.class, c10782qT1);
    }

    /* renamed from: t */
    public static C10782qT1 m24006t() {
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
            return new C11910zJ1(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C10782qT1();
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
    public final int m24007n() {
        return this.zzg;
    }

    /* renamed from: o */
    public final int m24008o() {
        return this.zzh;
    }

    /* renamed from: p */
    public final int m24009p() {
        return this.zzi;
    }

    /* renamed from: q */
    public final int m24010q() {
        return this.zzf;
    }

    /* renamed from: r */
    public final int m24011r() {
        return this.zzj;
    }

    /* renamed from: s */
    public final int m24012s() {
        return this.zze;
    }

    /* renamed from: u */
    public final boolean m24013u() {
        return this.zzk;
    }
}
