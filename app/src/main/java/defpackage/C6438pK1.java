package defpackage;

/* renamed from: pK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6438pK1 extends AbstractC6843rS1 {
    private static final C6438pK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C6438pK1 c6438pK1 = new C6438pK1();
        zzc = c6438pK1;
        AbstractC6843rS1.g(C6438pK1.class, c6438pK1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC2495cK1.a[i - 1]) {
            case 1:
                return new C6438pK1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C6438pK1.class) {
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

    public final String n() {
        return this.zzg;
    }
}
