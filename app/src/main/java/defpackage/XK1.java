package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class XK1 extends AbstractC6843rS1 {
    private static final XK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private OS1 zzg = BT1.e;

    static {
        XK1 xk1 = new XK1();
        zzc = xk1;
        AbstractC6843rS1.g(XK1.class, xk1);
    }

    public static /* synthetic */ void o(XK1 xk1, int i) {
        xk1.zze |= 1;
        xk1.zzf = i;
    }

    public static void p(XK1 xk1, List list) {
        List list2 = xk1.zzg;
        if (!((RP1) list2).a) {
            xk1.zzg = ((BT1) list2).a(list2.size() << 1);
        }
        IP1.b(list, xk1.zzg);
    }

    public static WK1 r() {
        return (WK1) zzc.i();
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new XK1();
            case 2:
                return new WK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (XK1.class) {
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
        return this.zzg.size();
    }

    public final long n(int i) {
        return ((BT1) this.zzg).h(i);
    }

    public final int q() {
        return this.zzf;
    }

    public final List s() {
        return this.zzg;
    }

    public final boolean t() {
        return (this.zze & 1) != 0;
    }
}
