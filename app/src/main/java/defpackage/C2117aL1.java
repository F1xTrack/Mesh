package defpackage;

/* renamed from: aL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2117aL1 extends AbstractC6843rS1 {
    private static final C2117aL1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C2117aL1 c2117aL1 = new C2117aL1();
        zzc = c2117aL1;
        AbstractC6843rS1.g(C2117aL1.class, c2117aL1);
    }

    public static ZK1 m() {
        return (ZK1) zzc.i();
    }

    public static void n(C2117aL1 c2117aL1, int i) {
        c2117aL1.zzh = AbstractC8235ym.x(i);
        c2117aL1.zze |= 4;
    }

    public static void o(C2117aL1 c2117aL1, YK1 yk1) {
        c2117aL1.zzg = yk1.a;
        c2117aL1.zze |= 2;
    }

    public static void p(C2117aL1 c2117aL1, int i) {
        c2117aL1.zzf = AbstractC8235ym.x(i);
        c2117aL1.zze |= 1;
    }

    public static C2117aL1 t() {
        return zzc;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new C2117aL1();
            case 2:
                return new ZK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zze", "zzf", KJ1.k, "zzg", KJ1.i, "zzh", KJ1.j});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C2117aL1.class) {
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

    public final YK1 q() {
        YK1 yk1A = YK1.a(this.zzg);
        return yk1A == null ? YK1.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : yk1A;
    }

    public final int r() {
        int iC = RI1.c(this.zzh);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    public final int s() {
        int iD = RI1.d(this.zzf);
        if (iD == 0) {
            return 1;
        }
        return iD;
    }
}
