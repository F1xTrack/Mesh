package p000;

/* loaded from: classes.dex */
public final class IK1 extends AbstractC10908rS1 {
    private static final IK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        IK1 ik1 = new IK1();
        zzc = ik1;
        AbstractC10908rS1.m24344g(IK1.class, ik1);
    }

    /* renamed from: n */
    public static /* synthetic */ void m3819n(IK1 ik1, int i) {
        ik1.zze |= 1;
        ik1.zzf = i;
    }

    /* renamed from: o */
    public static /* synthetic */ void m3820o(IK1 ik1, long j) {
        ik1.zze |= 2;
        ik1.zzg = j;
    }

    /* renamed from: q */
    public static HK1 m3821q() {
        return (HK1) zzc.m24346i();
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new IK1();
            case 2:
                return new HK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (IK1.class) {
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

    /* renamed from: m */
    public final int m3822m() {
        return this.zzf;
    }

    /* renamed from: p */
    public final long m3823p() {
        return this.zzg;
    }

    /* renamed from: r */
    public final boolean m3824r() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: s */
    public final boolean m3825s() {
        return (this.zze & 1) != 0;
    }
}
