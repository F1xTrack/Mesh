package p000;

import java.util.List;

/* loaded from: classes.dex */
public final class XK1 extends AbstractC10908rS1 {
    private static final XK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private OS1 zzg = BT1.f837e;

    static {
        XK1 xk1 = new XK1();
        zzc = xk1;
        AbstractC10908rS1.m24344g(XK1.class, xk1);
    }

    /* renamed from: o */
    public static /* synthetic */ void m8973o(XK1 xk1, int i) {
        xk1.zze |= 1;
        xk1.zzf = i;
    }

    /* renamed from: p */
    public static void m8974p(XK1 xk1, List list) {
        List list2 = xk1.zzg;
        if (!((RP1) list2).f10166a) {
            xk1.zzg = ((BT1) list2).mo724a(list2.size() << 1);
        }
        IP1.m3855b(list, xk1.zzg);
    }

    /* renamed from: r */
    public static WK1 m8975r() {
        return (WK1) zzc.m24346i();
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new XK1();
            case 2:
                return new WK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (XK1.class) {
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
    public final int m8976m() {
        return this.zzg.size();
    }

    /* renamed from: n */
    public final long m8977n(int i) {
        return ((BT1) this.zzg).m726h(i);
    }

    /* renamed from: q */
    public final int m8978q() {
        return this.zzf;
    }

    /* renamed from: s */
    public final List m8979s() {
        return this.zzg;
    }

    /* renamed from: t */
    public final boolean m8980t() {
        return (this.zze & 1) != 0;
    }
}
