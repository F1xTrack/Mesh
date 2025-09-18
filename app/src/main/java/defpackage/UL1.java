package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class UL1 extends AbstractC6843rS1 {
    private static final UL1 zzc;
    private static volatile KU1 zzd;
    private LS1 zze = C2147aV1.e;

    static {
        UL1 ul1 = new UL1();
        zzc = ul1;
        AbstractC6843rS1.g(UL1.class, ul1);
    }

    public static UL1 n() {
        return zzc;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        switch (TL1.a[i - 1]) {
            case 1:
                return new UL1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", VL1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (UL1.class) {
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

    public final int m() {
        return this.zze.size();
    }

    public final List o() {
        return this.zze;
    }
}
