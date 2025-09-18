package defpackage;

/* renamed from: Ky1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0874Ky1 extends QG1 implements KI1 {
    private static final C0874Ky1 zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        C0874Ky1 c0874Ky1 = new C0874Ky1();
        zzb = c0874Ky1;
        QG1.h(C0874Ky1.class, c0874Ky1);
    }

    public static C0874Ky1 n() {
        return zzb;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C0874Ky1();
        }
        if (i2 == 4) {
            return new DR1(5, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String o() {
        return this.zze;
    }

    public final String p() {
        return this.zzf;
    }
}
