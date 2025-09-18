package p000;

/* loaded from: classes.dex */
public final class KK1 extends AbstractC10908rS1 {
    private static final KK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private LS1 zzf = C8733aV1.f15539e;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        KK1 kk1 = new KK1();
        zzc = kk1;
        AbstractC10908rS1.m24344g(KK1.class, kk1);
    }

    /* renamed from: o */
    public static /* synthetic */ void m4597o(int i, KK1 kk1) {
        kk1.m4611F();
        kk1.zzf.remove(i);
    }

    /* renamed from: p */
    public static /* synthetic */ void m4598p(long j, KK1 kk1) {
        kk1.zze |= 4;
        kk1.zzi = j;
    }

    /* renamed from: q */
    public static /* synthetic */ void m4599q(String str, KK1 kk1) {
        str.getClass();
        kk1.zze |= 1;
        kk1.zzg = str;
    }

    /* renamed from: r */
    public static void m4600r(KK1 kk1) {
        kk1.zzf = C8733aV1.f15539e;
    }

    /* renamed from: s */
    public static /* synthetic */ void m4601s(KK1 kk1, int i, NK1 nk1) {
        kk1.m4611F();
        kk1.zzf.set(i, nk1);
    }

    /* renamed from: t */
    public static /* synthetic */ void m4602t(KK1 kk1, Iterable iterable) {
        kk1.m4611F();
        IP1.m3855b(iterable, kk1.zzf);
    }

    /* renamed from: u */
    public static /* synthetic */ void m4603u(KK1 kk1, NK1 nk1) {
        nk1.getClass();
        kk1.m4611F();
        kk1.zzf.add(nk1);
    }

    /* renamed from: w */
    public static /* synthetic */ void m4604w(long j, KK1 kk1) {
        kk1.zze |= 2;
        kk1.zzh = j;
    }

    /* renamed from: z */
    public static JK1 m4605z() {
        return (JK1) zzc.m24346i();
    }

    /* renamed from: A */
    public final String m4606A() {
        return this.zzg;
    }

    /* renamed from: B */
    public final LS1 m4607B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final boolean m4608C() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: D */
    public final boolean m4609D() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: E */
    public final boolean m4610E() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: F */
    public final void m4611F() {
        LS1 ls1 = this.zzf;
        if (((RP1) ls1).f10166a) {
            return;
        }
        this.zzf = ls1.mo724a(ls1.size() << 1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new KK1();
            case 2:
                return new JK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", NK1.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (KK1.class) {
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
    public final int m4612m() {
        return this.zzj;
    }

    /* renamed from: n */
    public final NK1 m4613n(int i) {
        return (NK1) this.zzf.get(i);
    }

    /* renamed from: v */
    public final int m4614v() {
        return this.zzf.size();
    }

    /* renamed from: x */
    public final long m4615x() {
        return this.zzi;
    }

    /* renamed from: y */
    public final long m4616y() {
        return this.zzh;
    }
}
