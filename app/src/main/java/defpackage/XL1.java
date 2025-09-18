package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class XL1 extends AbstractC6843rS1 {
    private static final XL1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private LS1 zzg = C2147aV1.e;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        XL1 xl1 = new XL1();
        zzc = xl1;
        AbstractC6843rS1.g(XL1.class, xl1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        switch (TL1.a[i - 1]) {
            case 1:
                return new XL1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", KJ1.l, "zzg", XL1.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (XL1.class) {
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

    public final double m() {
        return this.zzk;
    }

    public final int n() {
        int iE = RI1.e(this.zzf);
        if (iE == 0) {
            return 1;
        }
        return iE;
    }

    public final String o() {
        return this.zzh;
    }

    public final String p() {
        return this.zzi;
    }

    public final List q() {
        return this.zzg;
    }

    public final boolean r() {
        return this.zzj;
    }

    public final boolean s() {
        return (this.zze & 8) != 0;
    }

    public final boolean t() {
        return (this.zze & 16) != 0;
    }

    public final boolean u() {
        return (this.zze & 4) != 0;
    }
}
