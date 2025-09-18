package p000;

/* renamed from: rJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10890rJ1 extends AbstractC10908rS1 {
    private static final C10890rJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private LS1 zzh = C8733aV1.f15539e;
    private boolean zzi;
    private C11402vJ1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C10890rJ1 c10890rJ1 = new C10890rJ1();
        zzc = c10890rJ1;
        AbstractC10908rS1.m24344g(C10890rJ1.class, c10890rJ1);
    }

    /* renamed from: o */
    public static void m24259o(C10890rJ1 c10890rJ1, int i, C11146tJ1 c11146tJ1) {
        LS1 ls1 = c10890rJ1.zzh;
        if (!((RP1) ls1).f10166a) {
            c10890rJ1.zzh = ls1.mo724a(ls1.size() << 1);
        }
        c10890rJ1.zzh.set(i, c11146tJ1);
    }

    /* renamed from: p */
    public static /* synthetic */ void m24260p(C10890rJ1 c10890rJ1, String str) {
        c10890rJ1.zze |= 2;
        c10890rJ1.zzg = str;
    }

    /* renamed from: r */
    public static C10762qJ1 m24261r() {
        return (C10762qJ1) zzc.m24346i();
    }

    /* renamed from: A */
    public final boolean m24262A() {
        return (this.zze & 64) != 0;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (HJ1.f4230a[i - 1]) {
            case 1:
                return new C10890rJ1();
            case 2:
                return new C10762qJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C11146tJ1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C10890rJ1.class) {
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
    public final int m24263m() {
        return this.zzh.size();
    }

    /* renamed from: n */
    public final C11146tJ1 m24264n(int i) {
        return (C11146tJ1) this.zzh.get(i);
    }

    /* renamed from: q */
    public final int m24265q() {
        return this.zzf;
    }

    /* renamed from: s */
    public final C11402vJ1 m24266s() {
        C11402vJ1 c11402vJ1 = this.zzj;
        return c11402vJ1 == null ? C11402vJ1.m25388n() : c11402vJ1;
    }

    /* renamed from: t */
    public final String m24267t() {
        return this.zzg;
    }

    /* renamed from: u */
    public final LS1 m24268u() {
        return this.zzh;
    }

    /* renamed from: v */
    public final boolean m24269v() {
        return this.zzk;
    }

    /* renamed from: w */
    public final boolean m24270w() {
        return this.zzl;
    }

    /* renamed from: x */
    public final boolean m24271x() {
        return this.zzm;
    }

    /* renamed from: y */
    public final boolean m24272y() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: z */
    public final boolean m24273z() {
        return (this.zze & 1) != 0;
    }
}
