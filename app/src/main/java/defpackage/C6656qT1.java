package defpackage;

/* renamed from: qT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6656qT1 extends QG1 implements KI1 {
    private static final C6656qT1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        C6656qT1 c6656qT1 = new C6656qT1();
        zzb = c6656qT1;
        QG1.h(C6656qT1.class, c6656qT1);
    }

    public static C6656qT1 t() {
        return zzb;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C6656qT1();
        }
        if (i2 == 4) {
            return new C6837rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int n() {
        return this.zzg;
    }

    public final int o() {
        return this.zzh;
    }

    public final int p() {
        return this.zzi;
    }

    public final int q() {
        return this.zzf;
    }

    public final int r() {
        return this.zzj;
    }

    public final int s() {
        return this.zze;
    }

    public final boolean u() {
        return this.zzk;
    }
}
