package defpackage;

/* renamed from: xY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8005xY1 extends QG1 implements KI1 {
    private static final C8005xY1 zzb;
    private int zzd;
    private C6417pD1 zze;
    private InterfaceC7383uH1 zzh;
    private InterfaceC7383uH1 zzi;
    private InterfaceC7383uH1 zzj;
    private InterfaceC7383uH1 zzk;
    private String zzl;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        C8005xY1 c8005xY1 = new C8005xY1();
        zzb = c8005xY1;
        QG1.h(C8005xY1.class, c8005xY1);
    }

    public C8005xY1() {
        C5480kJ1 c5480kJ1 = C5480kJ1.d;
        this.zzh = c5480kJ1;
        this.zzi = c5480kJ1;
        this.zzj = c5480kJ1;
        this.zzk = c5480kJ1;
        this.zzl = "";
    }

    public static C8005xY1 o() {
        return zzb;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C8132yD1.class, "zzi", B22.class, "zzj", "zzk", C5462kD1.class, "zzl"});
        }
        if (i2 == 3) {
            return new C8005xY1();
        }
        if (i2 == 4) {
            return new C6837rQ1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzm = qg1 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final C6417pD1 n() {
        C6417pD1 c6417pD1 = this.zze;
        return c6417pD1 == null ? C6417pD1.n() : c6417pD1;
    }

    public final String p() {
        return this.zzf;
    }

    public final String q() {
        return this.zzg;
    }

    public final InterfaceC7383uH1 r() {
        return this.zzk;
    }

    public final InterfaceC7383uH1 s() {
        return this.zzi;
    }

    public final InterfaceC7383uH1 t() {
        return this.zzh;
    }

    public final InterfaceC7383uH1 u() {
        return this.zzj;
    }
}
