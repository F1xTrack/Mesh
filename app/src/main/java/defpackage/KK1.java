package defpackage;

/* loaded from: classes.dex */
public final class KK1 extends AbstractC6843rS1 {
    private static final KK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private LS1 zzf = C2147aV1.e;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        KK1 kk1 = new KK1();
        zzc = kk1;
        AbstractC6843rS1.g(KK1.class, kk1);
    }

    public static /* synthetic */ void o(int i, KK1 kk1) {
        kk1.F();
        kk1.zzf.remove(i);
    }

    public static /* synthetic */ void p(long j, KK1 kk1) {
        kk1.zze |= 4;
        kk1.zzi = j;
    }

    public static /* synthetic */ void q(String str, KK1 kk1) {
        str.getClass();
        kk1.zze |= 1;
        kk1.zzg = str;
    }

    public static void r(KK1 kk1) {
        kk1.zzf = C2147aV1.e;
    }

    public static /* synthetic */ void s(KK1 kk1, int i, NK1 nk1) {
        kk1.F();
        kk1.zzf.set(i, nk1);
    }

    public static /* synthetic */ void t(KK1 kk1, Iterable iterable) {
        kk1.F();
        IP1.b(iterable, kk1.zzf);
    }

    public static /* synthetic */ void u(KK1 kk1, NK1 nk1) {
        nk1.getClass();
        kk1.F();
        kk1.zzf.add(nk1);
    }

    public static /* synthetic */ void w(long j, KK1 kk1) {
        kk1.zze |= 2;
        kk1.zzh = j;
    }

    public static JK1 z() {
        return (JK1) zzc.i();
    }

    public final String A() {
        return this.zzg;
    }

    public final LS1 B() {
        return this.zzf;
    }

    public final boolean C() {
        return (this.zze & 8) != 0;
    }

    public final boolean D() {
        return (this.zze & 4) != 0;
    }

    public final boolean E() {
        return (this.zze & 2) != 0;
    }

    public final void F() {
        LS1 ls1 = this.zzf;
        if (((RP1) ls1).a) {
            return;
        }
        this.zzf = ls1.a(ls1.size() << 1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new KK1();
            case 2:
                return new JK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", NK1.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (KK1.class) {
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
        return this.zzj;
    }

    public final NK1 n(int i) {
        return (NK1) this.zzf.get(i);
    }

    public final int v() {
        return this.zzf.size();
    }

    public final long x() {
        return this.zzi;
    }

    public final long y() {
        return this.zzh;
    }
}
