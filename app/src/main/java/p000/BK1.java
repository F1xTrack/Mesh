package p000;

/* loaded from: classes.dex */
public final class BK1 extends AbstractC10908rS1 {
    private static final BK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        BK1 bk1 = new BK1();
        zzc = bk1;
        AbstractC10908rS1.m24344g(BK1.class, bk1);
    }

    /* renamed from: A */
    public static /* synthetic */ void m614A(BK1 bk1) {
        bk1.zze &= -33;
        bk1.zzk = zzc.zzk;
    }

    /* renamed from: B */
    public static /* synthetic */ void m615B(BK1 bk1, String str) {
        bk1.zze |= 32;
        bk1.zzk = str;
    }

    /* renamed from: D */
    public static /* synthetic */ void m616D(BK1 bk1) {
        bk1.zze &= -17;
        bk1.zzj = zzc.zzj;
    }

    /* renamed from: E */
    public static /* synthetic */ void m617E(BK1 bk1, String str) {
        bk1.zze |= 16;
        bk1.zzj = str;
    }

    /* renamed from: n */
    public static /* synthetic */ void m618n(BK1 bk1) {
        bk1.zze &= -5;
        bk1.zzh = zzc.zzh;
    }

    /* renamed from: o */
    public static /* synthetic */ void m619o(BK1 bk1, long j) {
        bk1.zze |= 8;
        bk1.zzi = j;
    }

    /* renamed from: p */
    public static /* synthetic */ void m620p(BK1 bk1, String str) {
        bk1.zze |= 4;
        bk1.zzh = str;
    }

    /* renamed from: r */
    public static /* synthetic */ void m621r(BK1 bk1) {
        bk1.zze &= -3;
        bk1.zzg = zzc.zzg;
    }

    /* renamed from: s */
    public static /* synthetic */ void m622s(BK1 bk1, long j) {
        bk1.zze |= 128;
        bk1.zzm = j;
    }

    /* renamed from: t */
    public static /* synthetic */ void m623t(BK1 bk1, String str) {
        bk1.zze |= 2;
        bk1.zzg = str;
    }

    /* renamed from: u */
    public static /* synthetic */ void m624u(BK1 bk1) {
        bk1.zze &= -2;
        bk1.zzf = zzc.zzf;
    }

    /* renamed from: v */
    public static /* synthetic */ void m625v(BK1 bk1, String str) {
        bk1.zze |= 1;
        bk1.zzf = str;
    }

    /* renamed from: w */
    public static AK1 m626w() {
        return (AK1) zzc.m24346i();
    }

    /* renamed from: x */
    public static /* synthetic */ void m627x(BK1 bk1) {
        bk1.zze &= -65;
        bk1.zzl = zzc.zzl;
    }

    /* renamed from: y */
    public static /* synthetic */ void m628y(BK1 bk1, String str) {
        bk1.zze |= 64;
        bk1.zzl = str;
    }

    /* renamed from: z */
    public static BK1 m629z() {
        return zzc;
    }

    /* renamed from: C */
    public final String m630C() {
        return this.zzh;
    }

    /* renamed from: F */
    public final String m631F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String m632G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final String m633H() {
        return this.zzl;
    }

    /* renamed from: I */
    public final String m634I() {
        return this.zzk;
    }

    /* renamed from: J */
    public final String m635J() {
        return this.zzj;
    }

    /* renamed from: K */
    public final boolean m636K() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: L */
    public final boolean m637L() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: M */
    public final boolean m638M() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: N */
    public final boolean m639N() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: O */
    public final boolean m640O() {
        return (this.zze & 128) != 0;
    }

    /* renamed from: P */
    public final boolean m641P() {
        return (this.zze & 64) != 0;
    }

    /* renamed from: Q */
    public final boolean m642Q() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: R */
    public final boolean m643R() {
        return (this.zze & 16) != 0;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new BK1();
            case 2:
                return new AK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (BK1.class) {
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
    public final long m645m() {
        return this.zzi;
    }

    /* renamed from: q */
    public final long m646q() {
        return this.zzm;
    }
}
