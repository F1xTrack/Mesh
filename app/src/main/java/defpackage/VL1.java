package defpackage;

/* loaded from: classes.dex */
public final class VL1 extends AbstractC6843rS1 {
    private static final VL1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private String zzf = "";
    private LS1 zzg = C2147aV1.e;

    static {
        VL1 vl1 = new VL1();
        zzc = vl1;
        AbstractC6843rS1.g(VL1.class, vl1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (TL1.a[i - 1]) {
            case 1:
                return new VL1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", XL1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (VL1.class) {
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

    public final String m() {
        return this.zzf;
    }

    public final LS1 n() {
        return this.zzg;
    }
}
