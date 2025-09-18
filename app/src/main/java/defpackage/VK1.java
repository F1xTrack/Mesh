package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class VK1 extends AbstractC6843rS1 {
    private static final VK1 zzc;
    private static volatile KU1 zzd;
    private OS1 zze;
    private OS1 zzf;
    private LS1 zzg;
    private LS1 zzh;

    static {
        VK1 vk1 = new VK1();
        zzc = vk1;
        AbstractC6843rS1.g(VK1.class, vk1);
    }

    public VK1() {
        BT1 bt1 = BT1.e;
        this.zze = bt1;
        this.zzf = bt1;
        C2147aV1 c2147aV1 = C2147aV1.e;
        this.zzg = c2147aV1;
        this.zzh = c2147aV1;
    }

    public static void n(VK1 vk1) {
        vk1.zzg = C2147aV1.e;
    }

    public static void o(VK1 vk1, ArrayList arrayList) {
        LS1 ls1 = vk1.zzg;
        if (!((RP1) ls1).a) {
            vk1.zzg = ls1.a(ls1.size() << 1);
        }
        IP1.b(arrayList, vk1.zzg);
    }

    public static void q(VK1 vk1) {
        vk1.zzf = BT1.e;
    }

    public static void r(VK1 vk1, List list) {
        List list2 = vk1.zzf;
        if (!((RP1) list2).a) {
            vk1.zzf = ((BT1) list2).a(list2.size() << 1);
        }
        IP1.b(list, vk1.zzf);
    }

    public static void t(VK1 vk1) {
        vk1.zzh = C2147aV1.e;
    }

    public static void u(VK1 vk1, List list) {
        LS1 ls1 = vk1.zzh;
        if (!((RP1) ls1).a) {
            vk1.zzh = ls1.a(ls1.size() << 1);
        }
        IP1.b(list, vk1.zzh);
    }

    public static void w(VK1 vk1) {
        vk1.zze = BT1.e;
    }

    public static void x(VK1 vk1, List list) {
        List list2 = vk1.zze;
        if (!((RP1) list2).a) {
            vk1.zze = ((BT1) list2).a(list2.size() << 1);
        }
        IP1.b(list, vk1.zze);
    }

    public static UK1 y() {
        return (UK1) zzc.i();
    }

    public static VK1 z() {
        return zzc;
    }

    public final LS1 A() {
        return this.zzg;
    }

    public final List B() {
        return this.zzf;
    }

    public final LS1 C() {
        return this.zzh;
    }

    public final List D() {
        return this.zze;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC7395uL1.a[i - 1]) {
            case 1:
                return new VK1();
            case 2:
                return new UK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", IK1.class, "zzh", XK1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (VK1.class) {
                        try {
                            c5856mH1 = zzd;
                            if (c5856mH1 == null) {
                                c5856mH1 = new C5856mH1(i2);
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
        return this.zzg.size();
    }

    public final int p() {
        return this.zzf.size();
    }

    public final int s() {
        return this.zzh.size();
    }

    public final int v() {
        return this.zze.size();
    }
}
