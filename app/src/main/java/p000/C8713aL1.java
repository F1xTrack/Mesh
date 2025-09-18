package p000;

/* renamed from: aL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8713aL1 extends AbstractC10908rS1 {
    private static final C8713aL1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C8713aL1 c8713aL1 = new C8713aL1();
        zzc = c8713aL1;
        AbstractC10908rS1.m24344g(C8713aL1.class, c8713aL1);
    }

    /* renamed from: m */
    public static ZK1 m9706m() {
        return (ZK1) zzc.m24346i();
    }

    /* renamed from: n */
    public static void m9707n(C8713aL1 c8713aL1, int i) {
        c8713aL1.zzh = AbstractC7222ym.m26247x(i);
        c8713aL1.zze |= 4;
    }

    /* renamed from: o */
    public static void m9708o(C8713aL1 c8713aL1, YK1 yk1) {
        c8713aL1.zzg = yk1.f14262a;
        c8713aL1.zze |= 2;
    }

    /* renamed from: p */
    public static void m9709p(C8713aL1 c8713aL1, int i) {
        c8713aL1.zzf = AbstractC7222ym.m26247x(i);
        c8713aL1.zze |= 1;
    }

    /* renamed from: t */
    public static C8713aL1 m9710t() {
        return zzc;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new C8713aL1();
            case 2:
                return new ZK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zze", "zzf", KJ1.f6025k, "zzg", KJ1.f6023i, "zzh", KJ1.f6024j});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C8713aL1.class) {
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

    /* renamed from: q */
    public final YK1 m9711q() {
        YK1 yk1M9258a = YK1.m9258a(this.zzg);
        return yk1M9258a == null ? YK1.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : yk1M9258a;
    }

    /* renamed from: r */
    public final int m9712r() {
        int iM6939c = RI1.m6939c(this.zzh);
        if (iM6939c == 0) {
            return 1;
        }
        return iM6939c;
    }

    /* renamed from: s */
    public final int m9713s() {
        int iM6940d = RI1.m6940d(this.zzf);
        if (iM6940d == 0) {
            return 1;
        }
        return iM6940d;
    }
}
