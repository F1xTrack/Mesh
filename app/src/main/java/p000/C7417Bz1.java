package p000;

/* renamed from: Bz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7417Bz1 extends QG1 implements KI1 {
    private static final C7417Bz1 zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        C7417Bz1 c7417Bz1 = new C7417Bz1();
        zzb = c7417Bz1;
        QG1.m6620h(C7417Bz1.class, c7417Bz1);
    }

    /* renamed from: n */
    public static C7417Bz1 m941n() {
        return zzb;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C7415By1.f1112d, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C7417Bz1();
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

    /* renamed from: o */
    public final String m942o() {
        return this.zzg;
    }

    /* renamed from: p */
    public final String m943p() {
        return this.zze;
    }

    /* renamed from: q */
    public final int m944q() {
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
