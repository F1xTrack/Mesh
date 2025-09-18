package p000;

/* renamed from: ez1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9310ez1 extends QG1 implements KI1 {
    private static final C9310ez1 zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        C9310ez1 c9310ez1 = new C9310ez1();
        zzb = c9310ez1;
        QG1.m6620h(C9310ez1.class, c9310ez1);
    }

    /* renamed from: n */
    public static C9310ez1 m18111n() {
        return zzb;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C9310ez1();
        }
        if (i2 == 4) {
            return new DR1(7, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    /* renamed from: o */
    public final String m18112o() {
        return this.zze;
    }

    /* renamed from: p */
    public final String m18113p() {
        return this.zzf;
    }
}
