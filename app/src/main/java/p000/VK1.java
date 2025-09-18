package p000;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class VK1 extends AbstractC10908rS1 {
    private static final VK1 zzc;
    private static volatile KU1 zzd;
    private OS1 zze;
    private OS1 zzf;
    private LS1 zzg;
    private LS1 zzh;

    static {
        VK1 vk1 = new VK1();
        zzc = vk1;
        AbstractC10908rS1.m24344g(VK1.class, vk1);
    }

    public VK1() {
        BT1 bt1 = BT1.f837e;
        this.zze = bt1;
        this.zzf = bt1;
        C8733aV1 c8733aV1 = C8733aV1.f15539e;
        this.zzg = c8733aV1;
        this.zzh = c8733aV1;
    }

    /* renamed from: n */
    public static void m8399n(VK1 vk1) {
        vk1.zzg = C8733aV1.f15539e;
    }

    /* renamed from: o */
    public static void m8400o(VK1 vk1, ArrayList arrayList) {
        LS1 ls1 = vk1.zzg;
        if (!((RP1) ls1).f10166a) {
            vk1.zzg = ls1.mo724a(ls1.size() << 1);
        }
        IP1.m3855b(arrayList, vk1.zzg);
    }

    /* renamed from: q */
    public static void m8401q(VK1 vk1) {
        vk1.zzf = BT1.f837e;
    }

    /* renamed from: r */
    public static void m8402r(VK1 vk1, List list) {
        List list2 = vk1.zzf;
        if (!((RP1) list2).f10166a) {
            vk1.zzf = ((BT1) list2).mo724a(list2.size() << 1);
        }
        IP1.m3855b(list, vk1.zzf);
    }

    /* renamed from: t */
    public static void m8403t(VK1 vk1) {
        vk1.zzh = C8733aV1.f15539e;
    }

    /* renamed from: u */
    public static void m8404u(VK1 vk1, List list) {
        LS1 ls1 = vk1.zzh;
        if (!((RP1) ls1).f10166a) {
            vk1.zzh = ls1.mo724a(ls1.size() << 1);
        }
        IP1.m3855b(list, vk1.zzh);
    }

    /* renamed from: w */
    public static void m8405w(VK1 vk1) {
        vk1.zze = BT1.f837e;
    }

    /* renamed from: x */
    public static void m8406x(VK1 vk1, List list) {
        List list2 = vk1.zze;
        if (!((RP1) list2).f10166a) {
            vk1.zze = ((BT1) list2).mo724a(list2.size() << 1);
        }
        IP1.m3855b(list, vk1.zze);
    }

    /* renamed from: y */
    public static UK1 m8407y() {
        return (UK1) zzc.m24346i();
    }

    /* renamed from: z */
    public static VK1 m8408z() {
        return zzc;
    }

    /* renamed from: A */
    public final LS1 m8409A() {
        return this.zzg;
    }

    /* renamed from: B */
    public final List m8410B() {
        return this.zzf;
    }

    /* renamed from: C */
    public final LS1 m8411C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final List m8412D() {
        return this.zze;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new VK1();
            case 2:
                return new UK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", IK1.class, "zzh", XK1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (VK1.class) {
                        try {
                            c10246mH1 = zzd;
                            if (c10246mH1 == null) {
                                c10246mH1 = new C10246mH1(i2);
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
    public final int m8413m() {
        return this.zzg.size();
    }

    /* renamed from: p */
    public final int m8414p() {
        return this.zzf.size();
    }

    /* renamed from: s */
    public final int m8415s() {
        return this.zzh.size();
    }

    /* renamed from: v */
    public final int m8416v() {
        return this.zze.size();
    }
}
