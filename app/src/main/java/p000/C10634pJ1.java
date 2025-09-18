package p000;

import java.util.List;

/* renamed from: pJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10634pJ1 extends AbstractC10908rS1 {
    private static final C10634pJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private LS1 zzg;
    private LS1 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C10634pJ1 c10634pJ1 = new C10634pJ1();
        zzc = c10634pJ1;
        AbstractC10908rS1.m24344g(C10634pJ1.class, c10634pJ1);
    }

    public C10634pJ1() {
        C8733aV1 c8733aV1 = C8733aV1.f15539e;
        this.zzg = c8733aV1;
        this.zzh = c8733aV1;
    }

    /* renamed from: o */
    public static void m23727o(C10634pJ1 c10634pJ1, int i, C10890rJ1 c10890rJ1) {
        LS1 ls1 = c10634pJ1.zzh;
        if (!((RP1) ls1).f10166a) {
            c10634pJ1.zzh = ls1.mo724a(ls1.size() << 1);
        }
        c10634pJ1.zzh.set(i, c10890rJ1);
    }

    /* renamed from: p */
    public static void m23728p(C10634pJ1 c10634pJ1, int i, C11656xJ1 c11656xJ1) {
        LS1 ls1 = c10634pJ1.zzg;
        if (!((RP1) ls1).f10166a) {
            c10634pJ1.zzg = ls1.mo724a(ls1.size() << 1);
        }
        c10634pJ1.zzg.set(i, c11656xJ1);
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (HJ1.f4230a[i - 1]) {
            case 1:
                return new C10634pJ1();
            case 2:
                return new C10506oJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C11656xJ1.class, "zzh", C10890rJ1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C10634pJ1.class) {
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
    public final int m23729m() {
        return this.zzf;
    }

    /* renamed from: n */
    public final C10890rJ1 m23730n(int i) {
        return (C10890rJ1) this.zzh.get(i);
    }

    /* renamed from: q */
    public final int m23731q() {
        return this.zzh.size();
    }

    /* renamed from: r */
    public final C11656xJ1 m23732r(int i) {
        return (C11656xJ1) this.zzg.get(i);
    }

    /* renamed from: s */
    public final int m23733s() {
        return this.zzg.size();
    }

    /* renamed from: t */
    public final List m23734t() {
        return this.zzh;
    }

    /* renamed from: u */
    public final List m23735u() {
        return this.zzg;
    }

    /* renamed from: v */
    public final boolean m23736v() {
        return (this.zze & 1) != 0;
    }
}
