package defpackage;

/* renamed from: Bz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175Bz1 extends QG1 implements KI1 {
    private static final C0175Bz1 zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        C0175Bz1 c0175Bz1 = new C0175Bz1();
        zzb = c0175Bz1;
        QG1.h(C0175Bz1.class, c0175Bz1);
    }

    public static C0175Bz1 n() {
        return zzb;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C0172By1.d, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C0175Bz1();
        }
        if (i2 == 4) {
            return new DR1(8, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzi = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String o() {
        return this.zzg;
    }

    public final String p() {
        return this.zze;
    }

    public final int q() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
