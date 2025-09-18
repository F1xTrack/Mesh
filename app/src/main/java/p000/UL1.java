package p000;

import java.util.List;

/* loaded from: classes.dex */
public final class UL1 extends AbstractC10908rS1 {
    private static final UL1 zzc;
    private static volatile KU1 zzd;
    private LS1 zze = C8733aV1.f15539e;

    static {
        UL1 ul1 = new UL1();
        zzc = ul1;
        AbstractC10908rS1.m24344g(UL1.class, ul1);
    }

    /* renamed from: n */
    public static UL1 m7987n() {
        return zzc;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        switch (TL1.f11326a[i - 1]) {
            case 1:
                return new UL1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", VL1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (UL1.class) {
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

    /* renamed from: m */
    public final int m7988m() {
        return this.zze.size();
    }

    /* renamed from: o */
    public final List m7989o() {
        return this.zze;
    }
}
