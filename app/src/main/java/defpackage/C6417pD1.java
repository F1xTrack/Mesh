package defpackage;

/* renamed from: pD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6417pD1 extends QG1 implements KI1 {
    private static final C6417pD1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C6417pD1 c6417pD1 = new C6417pD1();
        zzb = c6417pD1;
        QG1.h(C6417pD1.class, c6417pD1);
    }

    public static C6417pD1 n() {
        return zzb;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C6417pD1();
        }
        if (i2 == 4) {
            return new DR1(10, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String o() {
        return this.zzh;
    }

    public final String p() {
        return this.zze;
    }

    public final String q() {
        return this.zzj;
    }

    public final String r() {
        return this.zzi;
    }

    public final String s() {
        return this.zzg;
    }

    public final String t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzk;
    }
}
