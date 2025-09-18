package p000;

/* renamed from: yD1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11771yD1 extends QG1 implements KI1 {
    private static final C11771yD1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C11771yD1 c11771yD1 = new C11771yD1();
        zzb = c11771yD1;
        QG1.m6620h(C11771yD1.class, c11771yD1);
    }

    /* renamed from: n */
    public static C11771yD1 m26102n() {
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
            return new C11910zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C7415By1.f1114f, "zzf"});
        }
        if (i2 == 3) {
            return new C11771yD1();
        }
        if (i2 == 4) {
            return new DR1(11, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: o */
    public final String m26103o() {
        return this.zzf;
    }

    /* renamed from: p */
    public final int m26104p() {
        int i;
        int i2 = this.zze;
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
