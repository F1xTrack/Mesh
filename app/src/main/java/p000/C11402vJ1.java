package p000;

/* renamed from: vJ1 */
/* loaded from: classes.dex */
public final class C11402vJ1 extends AbstractC10908rS1 {
    private static final C11402vJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C11402vJ1 c11402vJ1 = new C11402vJ1();
        zzc = c11402vJ1;
        AbstractC10908rS1.m24344g(C11402vJ1.class, c11402vJ1);
    }

    /* renamed from: n */
    public static C11402vJ1 m25388n() {
        return zzc;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        switch (HJ1.f4230a[i - 1]) {
            case 1:
                return new C11402vJ1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", KJ1.f6016b, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C11402vJ1.class) {
                        try {
                            c10246mH1 = zzd;
                            if (c10246mH1 == null) {
                                c10246mH1 = new C10246mH1(3);
                                zzd = c10246mH1;
                            }
                        } finally {
                        }
                    }
                }
                return c10246mH1;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    /* renamed from: m */
    public final int m25389m() {
        int iM6937a = RI1.m6937a(this.zzf);
        if (iM6937a == 0) {
            return 1;
        }
        return iM6937a;
    }

    /* renamed from: o */
    public final String m25390o() {
        return this.zzh;
    }

    /* renamed from: p */
    public final String m25391p() {
        return this.zzj;
    }

    /* renamed from: q */
    public final String m25392q() {
        return this.zzi;
    }

    /* renamed from: r */
    public final boolean m25393r() {
        return this.zzg;
    }

    /* renamed from: s */
    public final boolean m25394s() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: t */
    public final boolean m25395t() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: u */
    public final boolean m25396u() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: v */
    public final boolean m25397v() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: w */
    public final boolean m25398w() {
        return (this.zze & 8) != 0;
    }
}
