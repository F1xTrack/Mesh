package defpackage;

/* renamed from: hK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4134hK1 extends AbstractC6843rS1 {
    private static final C4134hK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private String zzf = "";
    private LS1 zzg = C2147aV1.e;
    private boolean zzh;

    static {
        C4134hK1 c4134hK1 = new C4134hK1();
        zzc = c4134hK1;
        AbstractC6843rS1.g(C4134hK1.class, c4134hK1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC2495cK1.a[i - 1]) {
            case 1:
                return new C4134hK1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C6247oK1.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C4134hK1.class) {
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
}
