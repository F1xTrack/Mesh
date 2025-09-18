package defpackage;

/* loaded from: classes.dex */
public final class GK1 extends AbstractC6843rS1 {
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
        AbstractC6843rS1.g(GK1.class, gk1);
    }

    public static /* synthetic */ void n(GK1 gk1, int i) {
        gk1.zze |= 1;
        gk1.zzf = i;
    }

    public static /* synthetic */ void o(GK1 gk1, VK1 vk1) {
        gk1.zzg = vk1;
        gk1.zze |= 2;
    }

    public static /* synthetic */ void p(GK1 gk1, boolean z) {
        gk1.zze |= 8;
        gk1.zzi = z;
    }

    public static FK1 q() {
        return (FK1) zzc.i();
    }

    public static /* synthetic */ void r(GK1 gk1, VK1 vk1) {
        vk1.getClass();
        gk1.zzh = vk1;
        gk1.zze |= 4;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new GK1();
            case 2:
                return new FK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (GK1.class) {
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
        return this.zzf;
    }

    public final VK1 s() {
        VK1 vk1 = this.zzg;
        return vk1 == null ? VK1.z() : vk1;
    }

    public final VK1 t() {
        VK1 vk1 = this.zzh;
        return vk1 == null ? VK1.z() : vk1;
    }

    public final boolean u() {
        return this.zzi;
    }

    public final boolean v() {
        return (this.zze & 1) != 0;
    }

    public final boolean w() {
        return (this.zze & 8) != 0;
    }

    public final boolean x() {
        return (this.zze & 4) != 0;
    }
}
