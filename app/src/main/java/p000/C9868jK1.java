package p000;

/* renamed from: jK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9868jK1 extends AbstractC10908rS1 {
    private static final C9868jK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C9868jK1 c9868jK1 = new C9868jK1();
        zzc = c9868jK1;
        AbstractC10908rS1.m24344g(C9868jK1.class, c9868jK1);
    }

    /* renamed from: n */
    public static /* synthetic */ void m22015n(C9868jK1 c9868jK1, String str) {
        str.getClass();
        c9868jK1.zze |= 1;
        c9868jK1.zzf = str;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC8967cK1.f17431a[i - 1]) {
            case 1:
                return new C9868jK1();
            case 2:
                return new C9740iK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C9868jK1.class) {
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
    public final int m22016m() {
        return this.zzi;
    }

    /* renamed from: o */
    public final String m22017o() {
        return this.zzf;
    }

    /* renamed from: p */
    public final boolean m22018p() {
        return this.zzg;
    }

    /* renamed from: q */
    public final boolean m22019q() {
        return this.zzh;
    }

    /* renamed from: r */
    public final boolean m22020r() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: s */
    public final boolean m22021s() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: t */
    public final boolean m22022t() {
        return (this.zze & 8) != 0;
    }
}
