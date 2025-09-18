package p000;

/* renamed from: xJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11656xJ1 extends AbstractC10908rS1 {
    private static final C11656xJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C11146tJ1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C11656xJ1 c11656xJ1 = new C11656xJ1();
        zzc = c11656xJ1;
        AbstractC10908rS1.m24344g(C11656xJ1.class, c11656xJ1);
    }

    /* renamed from: n */
    public static /* synthetic */ void m25827n(C11656xJ1 c11656xJ1, String str) {
        c11656xJ1.zze |= 2;
        c11656xJ1.zzg = str;
    }

    /* renamed from: p */
    public static C11529wJ1 m25828p() {
        return (C11529wJ1) zzc.m24346i();
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (HJ1.f4230a[i - 1]) {
            case 1:
                return new C11656xJ1();
            case 2:
                return new C11529wJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C11656xJ1.class) {
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
    public final int m25829m() {
        return this.zzf;
    }

    /* renamed from: o */
    public final C11146tJ1 m25830o() {
        C11146tJ1 c11146tJ1 = this.zzh;
        return c11146tJ1 == null ? C11146tJ1.m24866n() : c11146tJ1;
    }

    /* renamed from: q */
    public final String m25831q() {
        return this.zzg;
    }

    /* renamed from: r */
    public final boolean m25832r() {
        return this.zzi;
    }

    /* renamed from: s */
    public final boolean m25833s() {
        return this.zzj;
    }

    /* renamed from: t */
    public final boolean m25834t() {
        return this.zzk;
    }

    /* renamed from: u */
    public final boolean m25835u() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: v */
    public final boolean m25836v() {
        return (this.zze & 32) != 0;
    }
}
