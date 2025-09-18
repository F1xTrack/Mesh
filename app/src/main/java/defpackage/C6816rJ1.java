package defpackage;

/* renamed from: rJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6816rJ1 extends AbstractC6843rS1 {
    private static final C6816rJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private LS1 zzh = C2147aV1.e;
    private boolean zzi;
    private C7580vJ1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C6816rJ1 c6816rJ1 = new C6816rJ1();
        zzc = c6816rJ1;
        AbstractC6843rS1.g(C6816rJ1.class, c6816rJ1);
    }

    public static void o(C6816rJ1 c6816rJ1, int i, C7198tJ1 c7198tJ1) {
        LS1 ls1 = c6816rJ1.zzh;
        if (!((RP1) ls1).a) {
            c6816rJ1.zzh = ls1.a(ls1.size() << 1);
        }
        c6816rJ1.zzh.set(i, c7198tJ1);
    }

    public static /* synthetic */ void p(C6816rJ1 c6816rJ1, String str) {
        c6816rJ1.zze |= 2;
        c6816rJ1.zzg = str;
    }

    public static C6626qJ1 r() {
        return (C6626qJ1) zzc.i();
    }

    public final boolean A() {
        return (this.zze & 64) != 0;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (HJ1.a[i - 1]) {
            case 1:
                return new C6816rJ1();
            case 2:
                return new C6626qJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C7198tJ1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C6816rJ1.class) {
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
        return this.zzh.size();
    }

    public final C7198tJ1 n(int i) {
        return (C7198tJ1) this.zzh.get(i);
    }

    public final int q() {
        return this.zzf;
    }

    public final C7580vJ1 s() {
        C7580vJ1 c7580vJ1 = this.zzj;
        return c7580vJ1 == null ? C7580vJ1.n() : c7580vJ1;
    }

    public final String t() {
        return this.zzg;
    }

    public final LS1 u() {
        return this.zzh;
    }

    public final boolean v() {
        return this.zzk;
    }

    public final boolean w() {
        return this.zzl;
    }

    public final boolean x() {
        return this.zzm;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
