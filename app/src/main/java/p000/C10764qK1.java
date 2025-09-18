package p000;

/* renamed from: qK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10764qK1 extends AbstractC10908rS1 {
    private static final C10764qK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzi;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";

    static {
        C10764qK1 c10764qK1 = new C10764qK1();
        zzc = c10764qK1;
        AbstractC10908rS1.m24344g(C10764qK1.class, c10764qK1);
    }

    /* renamed from: n */
    public static C10764qK1 m23979n() {
        return zzc;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC8967cK1.f17431a[i - 1]) {
            case 1:
                return new C10764qK1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C10764qK1.class) {
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
    public final int m23980m() {
        return this.zzi;
    }

    /* renamed from: o */
    public final String m23981o() {
        return this.zzg;
    }

    /* renamed from: p */
    public final String m23982p() {
        return this.zzj;
    }

    /* renamed from: q */
    public final String m23983q() {
        return this.zzf;
    }
}
