package p000;

/* loaded from: classes.dex */
public final class B22 extends QG1 implements KI1 {
    private static final B22 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        B22 b22 = new B22();
        zzb = b22;
        QG1.m6620h(B22.class, b22);
    }

    /* renamed from: n */
    public static B22 m470n() {
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
            return new C11910zJ1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", C7415By1.f1109C, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new B22();
        }
        if (i2 == 4) {
            return new C10904rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: o */
    public final String m471o() {
        return this.zzf;
    }

    /* renamed from: p */
    public final String m472p() {
        return this.zzh;
    }

    /* renamed from: q */
    public final String m473q() {
        return this.zzg;
    }

    /* renamed from: r */
    public final int m474r() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
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
