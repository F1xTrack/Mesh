package p000;

/* loaded from: classes.dex */
public final class EK1 extends AbstractC10908rS1 {
    private static final EK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        EK1 ek1 = new EK1();
        zzc = ek1;
        AbstractC10908rS1.m24344g(EK1.class, ek1);
    }

    /* renamed from: m */
    public static DK1 m2127m() {
        return (DK1) zzc.m24346i();
    }

    /* renamed from: n */
    public static /* synthetic */ void m2128n(EK1 ek1, boolean z) {
        ek1.zze |= 32;
        ek1.zzk = z;
    }

    /* renamed from: o */
    public static /* synthetic */ void m2129o(EK1 ek1, boolean z) {
        ek1.zze |= 16;
        ek1.zzj = z;
    }

    /* renamed from: p */
    public static EK1 m2130p() {
        return zzc;
    }

    /* renamed from: q */
    public static /* synthetic */ void m2131q(EK1 ek1, boolean z) {
        ek1.zze |= 1;
        ek1.zzf = z;
    }

    /* renamed from: r */
    public static /* synthetic */ void m2132r(EK1 ek1, boolean z) {
        ek1.zze |= 64;
        ek1.zzl = z;
    }

    /* renamed from: t */
    public static /* synthetic */ void m2133t(EK1 ek1, boolean z) {
        ek1.zze |= 2;
        ek1.zzg = z;
    }

    /* renamed from: v */
    public static /* synthetic */ void m2134v(EK1 ek1, boolean z) {
        ek1.zze |= 4;
        ek1.zzh = z;
    }

    /* renamed from: x */
    public static /* synthetic */ void m2135x(EK1 ek1, boolean z) {
        ek1.zze |= 8;
        ek1.zzi = z;
    }

    /* renamed from: A */
    public final boolean m2136A() {
        return this.zzh;
    }

    /* renamed from: B */
    public final boolean m2137B() {
        return this.zzi;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new EK1();
            case 2:
                return new DK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (EK1.class) {
                        try {
                            c10246mH1 = zzd;
                            if (c10246mH1 == null) {
                                c10246mH1 = new C10246mH1(i2);
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

    /* renamed from: s */
    public final boolean m2138s() {
        return this.zzk;
    }

    /* renamed from: u */
    public final boolean m2139u() {
        return this.zzj;
    }

    /* renamed from: w */
    public final boolean m2140w() {
        return this.zzf;
    }

    /* renamed from: y */
    public final boolean m2141y() {
        return this.zzl;
    }

    /* renamed from: z */
    public final boolean m2142z() {
        return this.zzg;
    }
}
