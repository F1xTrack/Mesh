package defpackage;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class NK1 extends AbstractC6843rS1 {
    private static final NK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private LS1 zzk = C2147aV1.e;

    static {
        NK1 nk1 = new NK1();
        zzc = nk1;
        AbstractC6843rS1.g(NK1.class, nk1);
    }

    public static MK1 A() {
        return (MK1) zzc.i();
    }

    public static /* synthetic */ void n(NK1 nk1, double d) {
        nk1.zze |= 16;
        nk1.zzj = d;
    }

    public static /* synthetic */ void o(NK1 nk1, long j) {
        nk1.zze |= 4;
        nk1.zzh = j;
    }

    public static /* synthetic */ void p(NK1 nk1, String str) {
        str.getClass();
        nk1.zze |= 1;
        nk1.zzf = str;
    }

    public static void q(NK1 nk1, ArrayList arrayList) {
        LS1 ls1 = nk1.zzk;
        if (!((RP1) ls1).a) {
            nk1.zzk = ls1.a(ls1.size() << 1);
        }
        IP1.b(arrayList, nk1.zzk);
    }

    public static void r(NK1 nk1, NK1 nk12) {
        LS1 ls1 = nk1.zzk;
        if (!((RP1) ls1).a) {
            nk1.zzk = ls1.a(ls1.size() << 1);
        }
        nk1.zzk.add(nk12);
    }

    public static /* synthetic */ void s(NK1 nk1) {
        nk1.zze &= -17;
        nk1.zzj = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public static /* synthetic */ void u(NK1 nk1) {
        nk1.zze &= -5;
        nk1.zzh = 0L;
    }

    public static /* synthetic */ void v(NK1 nk1, String str) {
        str.getClass();
        nk1.zze |= 2;
        nk1.zzg = str;
    }

    public static void x(NK1 nk1) {
        nk1.zzk = C2147aV1.e;
    }

    public static /* synthetic */ void z(NK1 nk1) {
        nk1.zze &= -3;
        nk1.zzg = zzc.zzg;
    }

    public final String B() {
        return this.zzf;
    }

    public final String C() {
        return this.zzg;
    }

    public final List D() {
        return this.zzk;
    }

    public final boolean E() {
        return (this.zze & 16) != 0;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    public final boolean G() {
        return (this.zze & 4) != 0;
    }

    public final boolean H() {
        return (this.zze & 1) != 0;
    }

    public final boolean I() {
        return (this.zze & 2) != 0;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new NK1();
            case 2:
                return new MK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", NK1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (NK1.class) {
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
        return this.zzj;
    }

    public final float t() {
        return this.zzi;
    }

    public final int w() {
        return this.zzk.size();
    }

    public final long y() {
        return this.zzh;
    }
}
