package defpackage;

import java.util.List;

/* renamed from: pJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6435pJ1 extends AbstractC6843rS1 {
    private static final C6435pJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private LS1 zzg;
    private LS1 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C6435pJ1 c6435pJ1 = new C6435pJ1();
        zzc = c6435pJ1;
        AbstractC6843rS1.g(C6435pJ1.class, c6435pJ1);
    }

    public C6435pJ1() {
        C2147aV1 c2147aV1 = C2147aV1.e;
        this.zzg = c2147aV1;
        this.zzh = c2147aV1;
    }

    public static void o(C6435pJ1 c6435pJ1, int i, C6816rJ1 c6816rJ1) {
        LS1 ls1 = c6435pJ1.zzh;
        if (!((RP1) ls1).a) {
            c6435pJ1.zzh = ls1.a(ls1.size() << 1);
        }
        c6435pJ1.zzh.set(i, c6816rJ1);
    }

    public static void p(C6435pJ1 c6435pJ1, int i, C7960xJ1 c7960xJ1) {
        LS1 ls1 = c6435pJ1.zzg;
        if (!((RP1) ls1).a) {
            c6435pJ1.zzg = ls1.a(ls1.size() << 1);
        }
        c6435pJ1.zzg.set(i, c7960xJ1);
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (HJ1.a[i - 1]) {
            case 1:
                return new C6435pJ1();
            case 2:
                return new C6244oJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C7960xJ1.class, "zzh", C6816rJ1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C6435pJ1.class) {
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
        return this.zzf;
    }

    public final C6816rJ1 n(int i) {
        return (C6816rJ1) this.zzh.get(i);
    }

    public final int q() {
        return this.zzh.size();
    }

    public final C7960xJ1 r(int i) {
        return (C7960xJ1) this.zzg.get(i);
    }

    public final int s() {
        return this.zzg.size();
    }

    public final List t() {
        return this.zzh;
    }

    public final List u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zze & 1) != 0;
    }
}
