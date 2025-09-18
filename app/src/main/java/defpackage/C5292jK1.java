package defpackage;

/* renamed from: jK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5292jK1 extends AbstractC6843rS1 {
    private static final C5292jK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C5292jK1 c5292jK1 = new C5292jK1();
        zzc = c5292jK1;
        AbstractC6843rS1.g(C5292jK1.class, c5292jK1);
    }

    public static /* synthetic */ void n(C5292jK1 c5292jK1, String str) {
        str.getClass();
        c5292jK1.zze |= 1;
        c5292jK1.zzf = str;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC2495cK1.a[i - 1]) {
            case 1:
                return new C5292jK1();
            case 2:
                return new C4325iK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C5292jK1.class) {
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
        return this.zzf;
    }

    public final boolean p() {
        return this.zzg;
    }

    public final boolean q() {
        return this.zzh;
    }

    public final boolean r() {
        return (this.zze & 2) != 0;
    }

    public final boolean s() {
        return (this.zze & 4) != 0;
    }

    public final boolean t() {
        return (this.zze & 8) != 0;
    }
}
