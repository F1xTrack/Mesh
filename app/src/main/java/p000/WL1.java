package p000;

/* loaded from: classes.dex */
public final class WL1 extends AbstractC10908rS1 {
    private static final WL1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private LS1 zzf = C8733aV1.f15539e;
    private UL1 zzg;

    static {
        WL1 wl1 = new WL1();
        zzc = wl1;
        AbstractC10908rS1.m24344g(WL1.class, wl1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (TL1.f11326a[i - 1]) {
            case 1:
                return new WL1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", XL1.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (WL1.class) {
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
    public final UL1 m8748m() {
        UL1 ul1 = this.zzg;
        return ul1 == null ? UL1.m7987n() : ul1;
    }

    /* renamed from: n */
    public final LS1 m8749n() {
        return this.zzf;
    }
}
