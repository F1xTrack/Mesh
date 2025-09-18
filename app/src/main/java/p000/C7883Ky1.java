package p000;

/* renamed from: Ky1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7883Ky1 extends QG1 implements KI1 {
    private static final C7883Ky1 zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        C7883Ky1 c7883Ky1 = new C7883Ky1();
        zzb = c7883Ky1;
        QG1.m6620h(C7883Ky1.class, c7883Ky1);
    }

    /* renamed from: n */
    public static C7883Ky1 m4795n() {
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
            return new C7883Ky1();
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

    /* renamed from: o */
    public final String m4796o() {
        return this.zze;
    }

    /* renamed from: p */
    public final String m4797p() {
        return this.zzf;
    }
}
