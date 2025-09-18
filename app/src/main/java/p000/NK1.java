package p000;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class NK1 extends AbstractC10908rS1 {
    private static final NK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private LS1 zzk = C8733aV1.f15539e;

    static {
        NK1 nk1 = new NK1();
        zzc = nk1;
        AbstractC10908rS1.m24344g(NK1.class, nk1);
    }

    /* renamed from: A */
    public static MK1 m5625A() {
        return (MK1) zzc.m24346i();
    }

    /* renamed from: n */
    public static /* synthetic */ void m5626n(NK1 nk1, double d) {
        nk1.zze |= 16;
        nk1.zzj = d;
    }

    /* renamed from: o */
    public static /* synthetic */ void m5627o(NK1 nk1, long j) {
        nk1.zze |= 4;
        nk1.zzh = j;
    }

    /* renamed from: p */
    public static /* synthetic */ void m5628p(NK1 nk1, String str) {
        str.getClass();
        nk1.zze |= 1;
        nk1.zzf = str;
    }

    /* renamed from: q */
    public static void m5629q(NK1 nk1, ArrayList arrayList) {
        LS1 ls1 = nk1.zzk;
        if (!((RP1) ls1).f10166a) {
            nk1.zzk = ls1.mo724a(ls1.size() << 1);
        }
        IP1.m3855b(arrayList, nk1.zzk);
    }

    /* renamed from: r */
    public static void m5630r(NK1 nk1, NK1 nk12) {
        LS1 ls1 = nk1.zzk;
        if (!((RP1) ls1).f10166a) {
            nk1.zzk = ls1.mo724a(ls1.size() << 1);
        }
        nk1.zzk.add(nk12);
    }

    /* renamed from: s */
    public static /* synthetic */ void m5631s(NK1 nk1) {
        nk1.zze &= -17;
        nk1.zzj = ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    /* renamed from: u */
    public static /* synthetic */ void m5632u(NK1 nk1) {
        nk1.zze &= -5;
        nk1.zzh = 0L;
    }

    /* renamed from: v */
    public static /* synthetic */ void m5633v(NK1 nk1, String str) {
        str.getClass();
        nk1.zze |= 2;
        nk1.zzg = str;
    }

    /* renamed from: x */
    public static void m5634x(NK1 nk1) {
        nk1.zzk = C8733aV1.f15539e;
    }

    /* renamed from: z */
    public static /* synthetic */ void m5635z(NK1 nk1) {
        nk1.zze &= -3;
        nk1.zzg = zzc.zzg;
    }

    /* renamed from: B */
    public final String m5636B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final String m5637C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final List m5638D() {
        return this.zzk;
    }

    /* renamed from: E */
    public final boolean m5639E() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: F */
    public final boolean m5640F() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: G */
    public final boolean m5641G() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: H */
    public final boolean m5642H() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: I */
    public final boolean m5643I() {
        return (this.zze & 2) != 0;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new NK1();
            case 2:
                return new MK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", NK1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (NK1.class) {
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
    public final double m5644m() {
        return this.zzj;
    }

    /* renamed from: t */
    public final float m5645t() {
        return this.zzi;
    }

    /* renamed from: w */
    public final int m5646w() {
        return this.zzk.size();
    }

    /* renamed from: y */
    public final long m5647y() {
        return this.zzh;
    }
}
