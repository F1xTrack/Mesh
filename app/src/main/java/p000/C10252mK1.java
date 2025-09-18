package p000;

/* renamed from: mK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10252mK1 extends AbstractC10908rS1 {
    private static final C10252mK1 zzc;
    private static volatile KU1 zzd;
    private LS1 zze = C8733aV1.f15539e;

    static {
        C10252mK1 c10252mK1 = new C10252mK1();
        zzc = c10252mK1;
        AbstractC10908rS1.m24344g(C10252mK1.class, c10252mK1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        switch (AbstractC8967cK1.f17431a[i - 1]) {
            case 1:
                return new C10252mK1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C10252mK1.class) {
                        try {
                            c10246mH1 = zzd;
                            if (c10246mH1 == null) {
                                c10246mH1 = new C10246mH1(3);
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
}
