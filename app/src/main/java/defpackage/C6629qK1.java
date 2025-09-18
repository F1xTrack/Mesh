package defpackage;

/* renamed from: qK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6629qK1 extends AbstractC6843rS1 {
    private static final C6629qK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzi;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";

    static {
        C6629qK1 c6629qK1 = new C6629qK1();
        zzc = c6629qK1;
        AbstractC6843rS1.g(C6629qK1.class, c6629qK1);
    }

    public static C6629qK1 n() {
        return zzc;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC2495cK1.a[i - 1]) {
            case 1:
                return new C6629qK1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C6629qK1.class) {
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

    public final int m() {
        return this.zzi;
    }

    public final String o() {
        return this.zzg;
    }

    public final String p() {
        return this.zzj;
    }

    public final String q() {
        return this.zzf;
    }
}
