package p000;

import java.util.List;

/* renamed from: gK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9484gK1 extends AbstractC10908rS1 {
    private static final C9484gK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private LS1 zzf;
    private LS1 zzg;
    private LS1 zzh;
    private boolean zzi;
    private LS1 zzj;

    static {
        C9484gK1 c9484gK1 = new C9484gK1();
        zzc = c9484gK1;
        AbstractC10908rS1.m24344g(C9484gK1.class, c9484gK1);
    }

    public C9484gK1() {
        C8733aV1 c8733aV1 = C8733aV1.f15539e;
        this.zzf = c8733aV1;
        this.zzg = c8733aV1;
        this.zzh = c8733aV1;
        this.zzj = c8733aV1;
    }

    /* renamed from: m */
    public static C9484gK1 m18427m() {
        return zzc;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC8967cK1.f17431a[i - 1]) {
            case 1:
                return new C9484gK1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", C9100dK1.class, "zzg", C9228eK1.class, "zzh", C9356fK1.class, "zzi", "zzj", C9100dK1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C9484gK1.class) {
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

    /* renamed from: n */
    public final LS1 m18428n() {
        return this.zzh;
    }

    /* renamed from: o */
    public final List m18429o() {
        return this.zzf;
    }

    /* renamed from: p */
    public final List m18430p() {
        return this.zzg;
    }

    /* renamed from: q */
    public final List m18431q() {
        return this.zzj;
    }

    /* renamed from: r */
    public final boolean m18432r() {
        return this.zzi;
    }

    /* renamed from: s */
    public final boolean m18433s() {
        return (this.zze & 1) != 0;
    }
}
