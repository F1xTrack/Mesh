package p000;

/* renamed from: fK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9356fK1 extends AbstractC10908rS1 {
    private static final C9356fK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        C9356fK1 c9356fK1 = new C9356fK1();
        zzc = c9356fK1;
        AbstractC10908rS1.m24344g(C9356fK1.class, c9356fK1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC8967cK1.f17431a[i - 1]) {
            case 1:
                return new C9356fK1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C9356fK1.class) {
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
    public final String m18201m() {
        return this.zzf;
    }
}
