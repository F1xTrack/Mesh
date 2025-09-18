package p000;

/* loaded from: classes.dex */
public final class GK1 extends AbstractC10908rS1 {
    private static final GK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private VK1 zzg;
    private VK1 zzh;
    private boolean zzi;

    static {
        GK1 gk1 = new GK1();
        zzc = gk1;
        AbstractC10908rS1.m24344g(GK1.class, gk1);
    }

    /* renamed from: n */
    public static /* synthetic */ void m3029n(GK1 gk1, int i) {
        gk1.zze |= 1;
        gk1.zzf = i;
    }

    /* renamed from: o */
    public static /* synthetic */ void m3030o(GK1 gk1, VK1 vk1) {
        gk1.zzg = vk1;
        gk1.zze |= 2;
    }

    /* renamed from: p */
    public static /* synthetic */ void m3031p(GK1 gk1, boolean z) {
        gk1.zze |= 8;
        gk1.zzi = z;
    }

    /* renamed from: q */
    public static FK1 m3032q() {
        return (FK1) zzc.m24346i();
    }

    /* renamed from: r */
    public static /* synthetic */ void m3033r(GK1 gk1, VK1 vk1) {
        vk1.getClass();
        gk1.zzh = vk1;
        gk1.zze |= 4;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new GK1();
            case 2:
                return new FK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (GK1.class) {
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
    public final int m3034m() {
        return this.zzf;
    }

    /* renamed from: s */
    public final VK1 m3035s() {
        VK1 vk1 = this.zzg;
        return vk1 == null ? VK1.m8408z() : vk1;
    }

    /* renamed from: t */
    public final VK1 m3036t() {
        VK1 vk1 = this.zzh;
        return vk1 == null ? VK1.m8408z() : vk1;
    }

    /* renamed from: u */
    public final boolean m3037u() {
        return this.zzi;
    }

    /* renamed from: v */
    public final boolean m3038v() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: w */
    public final boolean m3039w() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: x */
    public final boolean m3040x() {
        return (this.zze & 4) != 0;
    }
}
