package defpackage;

/* loaded from: classes.dex */
public final class IK1 extends AbstractC6843rS1 {
    private static final IK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        IK1 ik1 = new IK1();
        zzc = ik1;
        AbstractC6843rS1.g(IK1.class, ik1);
    }

    public static /* synthetic */ void n(IK1 ik1, int i) {
        ik1.zze |= 1;
        ik1.zzf = i;
    }

    public static /* synthetic */ void o(IK1 ik1, long j) {
        ik1.zze |= 2;
        ik1.zzg = j;
    }

    public static HK1 q() {
        return (HK1) zzc.i();
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new IK1();
            case 2:
                return new HK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (IK1.class) {
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

    public final long p() {
        return this.zzg;
    }

    public final boolean r() {
        return (this.zze & 2) != 0;
    }

    public final boolean s() {
        return (this.zze & 1) != 0;
    }
}
