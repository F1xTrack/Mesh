package p000;

/* renamed from: tJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11146tJ1 extends AbstractC10908rS1 {
    private static final C11146tJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private C11783yJ1 zzf;
    private C11402vJ1 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C11146tJ1 c11146tJ1 = new C11146tJ1();
        zzc = c11146tJ1;
        AbstractC10908rS1.m24344g(C11146tJ1.class, c11146tJ1);
    }

    /* renamed from: m */
    public static /* synthetic */ void m24865m(C11146tJ1 c11146tJ1, String str) {
        c11146tJ1.zze |= 8;
        c11146tJ1.zzi = str;
    }

    /* renamed from: n */
    public static C11146tJ1 m24866n() {
        return zzc;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (HJ1.f4230a[i - 1]) {
            case 1:
                return new C11146tJ1();
            case 2:
                return new C11018sJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C11146tJ1.class) {
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

    /* renamed from: o */
    public final C11402vJ1 m24867o() {
        C11402vJ1 c11402vJ1 = this.zzg;
        return c11402vJ1 == null ? C11402vJ1.m25388n() : c11402vJ1;
    }

    /* renamed from: p */
    public final C11783yJ1 m24868p() {
        C11783yJ1 c11783yJ1 = this.zzf;
        return c11783yJ1 == null ? C11783yJ1.m26124o() : c11783yJ1;
    }

    /* renamed from: q */
    public final String m24869q() {
        return this.zzi;
    }

    /* renamed from: r */
    public final boolean m24870r() {
        return this.zzh;
    }

    /* renamed from: s */
    public final boolean m24871s() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: t */
    public final boolean m24872t() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: u */
    public final boolean m24873u() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: v */
    public final boolean m24874v() {
        return (this.zze & 1) != 0;
    }
}
