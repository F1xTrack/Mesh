package p000;

/* loaded from: classes.dex */
public final class TK1 extends AbstractC10908rS1 {
    private static final TK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf = 1;
    private LS1 zzg = C8733aV1.f15539e;

    static {
        TK1 tk1 = new TK1();
        zzc = tk1;
        AbstractC10908rS1.m24344g(TK1.class, tk1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new TK1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", KJ1.f6022h, "zzg", LK1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (TK1.class) {
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
}
