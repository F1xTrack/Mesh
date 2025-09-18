package defpackage;

/* renamed from: eK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3561eK1 extends AbstractC6843rS1 {
    private static final C3561eK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C3561eK1 c3561eK1 = new C3561eK1();
        zzc = c3561eK1;
        AbstractC6843rS1.g(C3561eK1.class, c3561eK1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC2495cK1.a[i - 1]) {
            case 1:
                return new C3561eK1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                KJ1 kj1 = KJ1.e;
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", kj1, "zzg", kj1});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C3561eK1.class) {
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
        int iB = RI1.b(this.zzg);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    public final int n() {
        int iB = RI1.b(this.zzf);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }
}
