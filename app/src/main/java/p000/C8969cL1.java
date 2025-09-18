package p000;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: cL1 */
/* loaded from: classes.dex */
public final class C8969cL1 extends AbstractC10908rS1 {
    private static final C8969cL1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C8969cL1 c8969cL1 = new C8969cL1();
        zzc = c8969cL1;
        AbstractC10908rS1.m24344g(C8969cL1.class, c8969cL1);
    }

    /* renamed from: n */
    public static /* synthetic */ void m10671n(C8969cL1 c8969cL1, double d) {
        c8969cL1.zze |= 32;
        c8969cL1.zzk = d;
    }

    /* renamed from: o */
    public static /* synthetic */ void m10672o(C8969cL1 c8969cL1, long j) {
        c8969cL1.zze |= 8;
        c8969cL1.zzi = j;
    }

    /* renamed from: p */
    public static /* synthetic */ void m10673p(C8969cL1 c8969cL1, String str) {
        str.getClass();
        c8969cL1.zze |= 2;
        c8969cL1.zzg = str;
    }

    /* renamed from: q */
    public static /* synthetic */ void m10674q(C8969cL1 c8969cL1) {
        c8969cL1.zze &= -33;
        c8969cL1.zzk = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    /* renamed from: s */
    public static /* synthetic */ void m10675s(C8969cL1 c8969cL1) {
        c8969cL1.zze &= -9;
        c8969cL1.zzi = 0L;
    }

    /* renamed from: t */
    public static /* synthetic */ void m10676t(C8969cL1 c8969cL1, long j) {
        c8969cL1.zze |= 1;
        c8969cL1.zzf = j;
    }

    /* renamed from: u */
    public static /* synthetic */ void m10677u(C8969cL1 c8969cL1, String str) {
        str.getClass();
        c8969cL1.zze |= 4;
        c8969cL1.zzh = str;
    }

    /* renamed from: w */
    public static /* synthetic */ void m10678w(C8969cL1 c8969cL1) {
        c8969cL1.zze &= -5;
        c8969cL1.zzh = zzc.zzh;
    }

    /* renamed from: y */
    public static C8841bL1 m10679y() {
        return (C8841bL1) zzc.m24346i();
    }

    /* renamed from: A */
    public final String m10680A() {
        return this.zzh;
    }

    /* renamed from: B */
    public final boolean m10681B() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: C */
    public final boolean m10682C() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: D */
    public final boolean m10683D() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: E */
    public final boolean m10684E() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: F */
    public final boolean m10685F() {
        return (this.zze & 4) != 0;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new C8969cL1();
            case 2:
                return new C8841bL1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C8969cL1.class) {
                        try {
                            c10246mH1 = zzd;
                            if (c10246mH1 == null) {
                                c10246mH1 = new C10246mH1(3);
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
    public final double m10686m() {
        return this.zzk;
    }

    /* renamed from: r */
    public final float m10687r() {
        return this.zzj;
    }

    /* renamed from: v */
    public final long m10688v() {
        return this.zzi;
    }

    /* renamed from: x */
    public final long m10689x() {
        return this.zzf;
    }

    /* renamed from: z */
    public final String m10690z() {
        return this.zzg;
    }
}
