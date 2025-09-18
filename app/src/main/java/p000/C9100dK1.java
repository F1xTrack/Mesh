package p000;

/* renamed from: dK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9100dK1 extends AbstractC10908rS1 {
    private static final C9100dK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C9100dK1 c9100dK1 = new C9100dK1();
        zzc = c9100dK1;
        AbstractC10908rS1.m24344g(C9100dK1.class, c9100dK1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC8967cK1.f17431a[i - 1]) {
            case 1:
                return new C9100dK1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", KJ1.f6019e, "zzg", KJ1.f6018d});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C9100dK1.class) {
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
    public final int m17543m() {
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

    /* renamed from: n */
    public final int m17544n() {
        int iM6938b = RI1.m6938b(this.zzf);
        if (iM6938b == 0) {
            return 1;
        }
        return iM6938b;
    }
}
