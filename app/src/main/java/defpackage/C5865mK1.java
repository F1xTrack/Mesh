package defpackage;

/* renamed from: mK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5865mK1 extends AbstractC6843rS1 {
    private static final C5865mK1 zzc;
    private static volatile KU1 zzd;
    private LS1 zze = C2147aV1.e;

    static {
        C5865mK1 c5865mK1 = new C5865mK1();
        zzc = c5865mK1;
        AbstractC6843rS1.g(C5865mK1.class, c5865mK1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        switch (AbstractC2495cK1.a[i - 1]) {
            case 1:
                return new C5865mK1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C5865mK1.class) {
                        try {
                            c5856mH1 = zzd;
                            if (c5856mH1 == null) {
                                c5856mH1 = new C5856mH1(3);
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
}
