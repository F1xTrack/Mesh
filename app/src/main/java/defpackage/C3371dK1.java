package defpackage;

/* renamed from: dK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3371dK1 extends AbstractC6843rS1 {
    private static final C3371dK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C3371dK1 c3371dK1 = new C3371dK1();
        zzc = c3371dK1;
        AbstractC6843rS1.g(C3371dK1.class, c3371dK1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC2495cK1.a[i - 1]) {
            case 1:
                return new C3371dK1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", KJ1.e, "zzg", KJ1.d});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C3371dK1.class) {
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
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int n() {
        int iB = RI1.b(this.zzf);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }
}
