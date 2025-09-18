package p000;

/* loaded from: classes.dex */
public final class VL1 extends AbstractC10908rS1 {
    private static final VL1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private String zzf = "";
    private LS1 zzg = C8733aV1.f15539e;

    static {
        VL1 vl1 = new VL1();
        zzc = vl1;
        AbstractC10908rS1.m24344g(VL1.class, vl1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (TL1.f11326a[i - 1]) {
            case 1:
                return new VL1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", XL1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (VL1.class) {
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
    public final String m8420m() {
        return this.zzf;
    }

    /* renamed from: n */
    public final LS1 m8421n() {
        return this.zzg;
    }
}
