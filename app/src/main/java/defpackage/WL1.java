package defpackage;

/* loaded from: classes.dex */
public final class WL1 extends AbstractC6843rS1 {
    private static final WL1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private LS1 zzf = C2147aV1.e;
    private UL1 zzg;

    static {
        WL1 wl1 = new WL1();
        zzc = wl1;
        AbstractC6843rS1.g(WL1.class, wl1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (TL1.a[i - 1]) {
            case 1:
                return new WL1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", XL1.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (WL1.class) {
                        try {
                            c5856mH1 = zzd;
                            if (c5856mH1 == null) {
                                c5856mH1 = new C5856mH1(i2);
                                zzd = c5856mH1;
                            }
                        } finally {
                        }
                    }
                }
                return c5856mH1;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final UL1 m() {
        UL1 ul1 = this.zzg;
        return ul1 == null ? UL1.n() : ul1;
    }

    public final LS1 n() {
        return this.zzf;
    }
}
