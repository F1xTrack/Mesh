package p000;

/* renamed from: eK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9228eK1 extends AbstractC10908rS1 {
    private static final C9228eK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C9228eK1 c9228eK1 = new C9228eK1();
        zzc = c9228eK1;
        AbstractC10908rS1.m24344g(C9228eK1.class, c9228eK1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC8967cK1.f17431a[i - 1]) {
            case 1:
                return new C9228eK1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                KJ1 kj1 = KJ1.f6019e;
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", kj1, "zzg", kj1});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C9228eK1.class) {
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
    public final int m17912m() {
        int iM6938b = RI1.m6938b(this.zzg);
        if (iM6938b == 0) {
            return 1;
        }
        return iM6938b;
    }

    /* renamed from: n */
    public final int m17913n() {
        int iM6938b = RI1.m6938b(this.zzf);
        if (iM6938b == 0) {
            return 1;
        }
        return iM6938b;
    }
}
