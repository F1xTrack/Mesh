package p000;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class QK1 extends AbstractC10908rS1 {
    private static final QK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private LS1 zzf = C8733aV1.f15539e;
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        QK1 qk1 = new QK1();
        zzc = qk1;
        AbstractC10908rS1.m24344g(QK1.class, qk1);
    }

    /* renamed from: n */
    public static PK1 m6648n(QK1 qk1) {
        AbstractC10524oS1 abstractC10524oS1M24346i = zzc.m24346i();
        abstractC10524oS1M24346i.m23411a(qk1);
        return (PK1) abstractC10524oS1M24346i;
    }

    /* renamed from: p */
    public static /* synthetic */ void m6649p(QK1 qk1, int i, SK1 sk1) {
        qk1.m6657B();
        qk1.zzf.set(i, sk1);
    }

    /* renamed from: q */
    public static /* synthetic */ void m6650q(QK1 qk1, String str) {
        str.getClass();
        qk1.zze |= 1;
        qk1.zzg = str;
    }

    /* renamed from: r */
    public static /* synthetic */ void m6651r(QK1 qk1, ArrayList arrayList) {
        qk1.m6657B();
        IP1.m3855b(arrayList, qk1.zzf);
    }

    /* renamed from: s */
    public static /* synthetic */ void m6652s(QK1 qk1, SK1 sk1) {
        qk1.m6657B();
        qk1.zzf.add(sk1);
    }

    /* renamed from: t */
    public static void m6653t(QK1 qk1) {
        qk1.zzf = C8733aV1.f15539e;
    }

    /* renamed from: u */
    public static /* synthetic */ void m6654u(QK1 qk1, String str) {
        str.getClass();
        qk1.zze |= 2;
        qk1.zzh = str;
    }

    /* renamed from: v */
    public static PK1 m6655v() {
        return (PK1) zzc.m24346i();
    }

    /* renamed from: A */
    public final boolean m6656A() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: B */
    public final void m6657B() {
        LS1 ls1 = this.zzf;
        if (((RP1) ls1).f10166a) {
            return;
        }
        this.zzf = ls1.mo724a(ls1.size() << 1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC11278uL1.f43678a[i - 1]) {
            case 1:
                return new QK1();
            case 2:
                return new PK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", SK1.class, "zzg", "zzh", "zzi", KJ1.f6021g});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (QK1.class) {
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
    public final int m6658m() {
        return this.zzf.size();
    }

    /* renamed from: o */
    public final SK1 m6659o(int i) {
        return (SK1) this.zzf.get(i);
    }

    /* renamed from: w */
    public final String m6660w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final String m6661x() {
        return this.zzh;
    }

    /* renamed from: y */
    public final List m6662y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final boolean m6663z() {
        return (this.zze & 1) != 0;
    }
}
