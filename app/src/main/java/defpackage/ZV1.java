package defpackage;

/* loaded from: classes.dex */
public final class ZV1 extends QG1 implements KI1 {
    private static final ZV1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private C6656qT1 zzj;
    private C6656qT1 zzk;

    static {
        ZV1 zv1 = new ZV1();
        zzb = zv1;
        QG1.h(ZV1.class, zv1);
    }

    public static ZV1 p() {
        return zzb;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new ZV1();
        }
        if (i2 == 4) {
            return new C6837rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final C6656qT1 n() {
        C6656qT1 c6656qT1 = this.zzk;
        return c6656qT1 == null ? C6656qT1.t() : c6656qT1;
    }

    public final C6656qT1 o() {
        C6656qT1 c6656qT1 = this.zzj;
        return c6656qT1 == null ? C6656qT1.t() : c6656qT1;
    }

    public final String q() {
        return this.zzf;
    }

    public final String r() {
        return this.zzg;
    }

    public final String s() {
        return this.zzh;
    }

    public final String t() {
        return this.zzi;
    }

    public final String u() {
        return this.zze;
    }
}
