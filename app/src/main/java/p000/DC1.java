package p000;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class DC1 extends QG1 implements KI1 {
    private static final DC1 zzb;
    private int zzd;
    private InterfaceC9862jH1 zze;
    private InterfaceC9862jH1 zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        DC1 dc1 = new DC1();
        zzb = dc1;
        QG1.m6620h(DC1.class, dc1);
    }

    public DC1() {
        ZF1 zf1 = ZF1.f14823d;
        this.zze = zf1;
        this.zzf = zf1;
    }

    /* renamed from: n */
    public static GA1 m1591n() {
        return (GA1) zzb.m6623d();
    }

    /* renamed from: o */
    public static /* synthetic */ void m1592o(DC1 dc1, int i) {
        dc1.zzd |= 2;
        dc1.zzh = i;
    }

    /* renamed from: p */
    public static void m1593p(DC1 dc1, float f) {
        List list = dc1.zze;
        if (!((LD1) list).f6553a) {
            int size = list.size();
            int i = size == 0 ? 10 : size + size;
            ZF1 zf1 = (ZF1) list;
            if (i < zf1.f14825c) {
                throw new IllegalArgumentException();
            }
            dc1.zze = new ZF1(Arrays.copyOf(zf1.f14824b, i), zf1.f14825c, true);
        }
        ((ZF1) dc1.zze).m9518h(f);
    }

    /* renamed from: q */
    public static void m1594q(DC1 dc1, float f) {
        List list = dc1.zzf;
        if (!((LD1) list).f6553a) {
            int size = list.size();
            int i = size == 0 ? 10 : size + size;
            ZF1 zf1 = (ZF1) list;
            if (i < zf1.f14825c) {
                throw new IllegalArgumentException();
            }
            dc1.zzf = new ZF1(Arrays.copyOf(zf1.f14824b, i), zf1.f14825c, true);
        }
        ((ZF1) dc1.zzf).m9518h(f);
    }

    /* renamed from: r */
    public static /* synthetic */ void m1595r(DC1 dc1, int i) {
        dc1.zzd |= 1;
        dc1.zzg = i;
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new DC1();
        }
        if (i2 == 4) {
            return new GA1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
