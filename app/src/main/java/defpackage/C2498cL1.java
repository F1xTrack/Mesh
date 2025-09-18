package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: cL1 */
/* loaded from: classes.dex */
public final class C2498cL1 extends AbstractC6843rS1 {
    private static final C2498cL1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C2498cL1 c2498cL1 = new C2498cL1();
        zzc = c2498cL1;
        AbstractC6843rS1.g(C2498cL1.class, c2498cL1);
    }

    public static /* synthetic */ void n(C2498cL1 c2498cL1, double d) {
        c2498cL1.zze |= 32;
        c2498cL1.zzk = d;
    }

    public static /* synthetic */ void o(C2498cL1 c2498cL1, long j) {
        c2498cL1.zze |= 8;
        c2498cL1.zzi = j;
    }

    public static /* synthetic */ void p(C2498cL1 c2498cL1, String str) {
        str.getClass();
        c2498cL1.zze |= 2;
        c2498cL1.zzg = str;
    }

    public static /* synthetic */ void q(C2498cL1 c2498cL1) {
        c2498cL1.zze &= -33;
        c2498cL1.zzk = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public static /* synthetic */ void s(C2498cL1 c2498cL1) {
        c2498cL1.zze &= -9;
        c2498cL1.zzi = 0L;
    }

    public static /* synthetic */ void t(C2498cL1 c2498cL1, long j) {
        c2498cL1.zze |= 1;
        c2498cL1.zzf = j;
    }

    public static /* synthetic */ void u(C2498cL1 c2498cL1, String str) {
        str.getClass();
        c2498cL1.zze |= 4;
        c2498cL1.zzh = str;
    }

    public static /* synthetic */ void w(C2498cL1 c2498cL1) {
        c2498cL1.zze &= -5;
        c2498cL1.zzh = zzc.zzh;
    }

    public static C2308bL1 y() {
        return (C2308bL1) zzc.i();
    }

    public final String A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zze & 32) != 0;
    }

    public final boolean C() {
        return (this.zze & 16) != 0;
    }

    public final boolean D() {
        return (this.zze & 8) != 0;
    }

    public final boolean E() {
        return (this.zze & 1) != 0;
    }

    public final boolean F() {
        return (this.zze & 4) != 0;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new C2498cL1();
            case 2:
                return new C2308bL1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C2498cL1.class) {
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

    public final float r() {
        return this.zzj;
    }

    public final long v() {
        return this.zzi;
    }

    public final long x() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
