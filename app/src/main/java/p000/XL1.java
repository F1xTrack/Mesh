package p000;

import java.util.List;

/* loaded from: classes.dex */
public final class XL1 extends AbstractC10908rS1 {
    private static final XL1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private LS1 zzg = C8733aV1.f15539e;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        XL1 xl1 = new XL1();
        zzc = xl1;
        AbstractC10908rS1.m24344g(XL1.class, xl1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        switch (TL1.f11326a[i - 1]) {
            case 1:
                return new XL1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", KJ1.f6026l, "zzg", XL1.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (XL1.class) {
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
    public final double m8984m() {
        return this.zzk;
    }

    /* renamed from: n */
    public final int m8985n() {
        int iM6941e = RI1.m6941e(this.zzf);
        if (iM6941e == 0) {
            return 1;
        }
        return iM6941e;
    }

    /* renamed from: o */
    public final String m8986o() {
        return this.zzh;
    }

    /* renamed from: p */
    public final String m8987p() {
        return this.zzi;
    }

    /* renamed from: q */
    public final List m8988q() {
        return this.zzg;
    }

    /* renamed from: r */
    public final boolean m8989r() {
        return this.zzj;
    }

    /* renamed from: s */
    public final boolean m8990s() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: t */
    public final boolean m8991t() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: u */
    public final boolean m8992u() {
        return (this.zze & 4) != 0;
    }
}
