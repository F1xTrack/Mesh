package defpackage;

/* loaded from: classes.dex */
public final class BK1 extends AbstractC6843rS1 {
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
        AbstractC6843rS1.g(BK1.class, bk1);
    }

    public static /* synthetic */ void A(BK1 bk1) {
        bk1.zze &= -33;
        bk1.zzk = zzc.zzk;
    }

    public static /* synthetic */ void B(BK1 bk1, String str) {
        bk1.zze |= 32;
        bk1.zzk = str;
    }

    public static /* synthetic */ void D(BK1 bk1) {
        bk1.zze &= -17;
        bk1.zzj = zzc.zzj;
    }

    public static /* synthetic */ void E(BK1 bk1, String str) {
        bk1.zze |= 16;
        bk1.zzj = str;
    }

    public static /* synthetic */ void n(BK1 bk1) {
        bk1.zze &= -5;
        bk1.zzh = zzc.zzh;
    }

    public static /* synthetic */ void o(BK1 bk1, long j) {
        bk1.zze |= 8;
        bk1.zzi = j;
    }

    public static /* synthetic */ void p(BK1 bk1, String str) {
        bk1.zze |= 4;
        bk1.zzh = str;
    }

    public static /* synthetic */ void r(BK1 bk1) {
        bk1.zze &= -3;
        bk1.zzg = zzc.zzg;
    }

    public static /* synthetic */ void s(BK1 bk1, long j) {
        bk1.zze |= 128;
        bk1.zzm = j;
    }

    public static /* synthetic */ void t(BK1 bk1, String str) {
        bk1.zze |= 2;
        bk1.zzg = str;
    }

    public static /* synthetic */ void u(BK1 bk1) {
        bk1.zze &= -2;
        bk1.zzf = zzc.zzf;
    }

    public static /* synthetic */ void v(BK1 bk1, String str) {
        bk1.zze |= 1;
        bk1.zzf = str;
    }

    public static AK1 w() {
        return (AK1) zzc.i();
    }

    public static /* synthetic */ void x(BK1 bk1) {
        bk1.zze &= -65;
        bk1.zzl = zzc.zzl;
    }

    public static /* synthetic */ void y(BK1 bk1, String str) {
        bk1.zze |= 64;
        bk1.zzl = str;
    }

    public static BK1 z() {
        return zzc;
    }

    public final String C() {
        return this.zzh;
    }

    public final String F() {
        return this.zzg;
    }

    public final String G() {
        return this.zzf;
    }

    public final String H() {
        return this.zzl;
    }

    public final String I() {
        return this.zzk;
    }

    public final String J() {
        return this.zzj;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final boolean N() {
        return (this.zze & 8) != 0;
    }

    public final boolean O() {
        return (this.zze & 128) != 0;
    }

    public final boolean P() {
        return (this.zze & 64) != 0;
    }

    public final boolean Q() {
        return (this.zze & 32) != 0;
    }

    public final boolean R() {
        return (this.zze & 16) != 0;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new BK1();
            case 2:
                return new AK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (BK1.class) {
                        try {
                            c5856mH1 = zzd;
                            if (c5856mH1 == null) {
                                c5856mH1 = new C5856mH1(3);
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

    public final long m() {
        return this.zzi;
    }

    public final long q() {
        return this.zzm;
    }
}
