package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class DC1 extends QG1 implements KI1 {
    private static final DC1 zzb;
    private int zzd;
    private InterfaceC5283jH1 zze;
    private InterfaceC5283jH1 zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        DC1 dc1 = new DC1();
        zzb = dc1;
        QG1.h(DC1.class, dc1);
    }

    public DC1() {
        ZF1 zf1 = ZF1.d;
        this.zze = zf1;
        this.zzf = zf1;
    }

    public static GA1 n() {
        return (GA1) zzb.d();
    }

    public static /* synthetic */ void o(DC1 dc1, int i) {
        dc1.zzd |= 2;
        dc1.zzh = i;
    }

    public static void p(DC1 dc1, float f) {
        List list = dc1.zze;
        if (!((LD1) list).a) {
            int size = list.size();
            int i = size == 0 ? 10 : size + size;
            ZF1 zf1 = (ZF1) list;
            if (i < zf1.c) {
                throw new IllegalArgumentException();
            }
            dc1.zze = new ZF1(Arrays.copyOf(zf1.b, i), zf1.c, true);
        }
        ((ZF1) dc1.zze).h(f);
    }

    public static void q(DC1 dc1, float f) {
        List list = dc1.zzf;
        if (!((LD1) list).a) {
            int size = list.size();
            int i = size == 0 ? 10 : size + size;
            ZF1 zf1 = (ZF1) list;
            if (i < zf1.c) {
                throw new IllegalArgumentException();
            }
            dc1.zzf = new ZF1(Arrays.copyOf(zf1.b, i), zf1.c, true);
        }
        ((ZF1) dc1.zzf).h(f);
    }

    public static /* synthetic */ void r(DC1 dc1, int i) {
        dc1.zzd |= 1;
        dc1.zzg = i;
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
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
