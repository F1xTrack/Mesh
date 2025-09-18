package defpackage;

/* renamed from: xJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7960xJ1 extends AbstractC6843rS1 {
    private static final C7960xJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C7198tJ1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C7960xJ1 c7960xJ1 = new C7960xJ1();
        zzc = c7960xJ1;
        AbstractC6843rS1.g(C7960xJ1.class, c7960xJ1);
    }

    public static /* synthetic */ void n(C7960xJ1 c7960xJ1, String str) {
        c7960xJ1.zze |= 2;
        c7960xJ1.zzg = str;
    }

    public static C7770wJ1 p() {
        return (C7770wJ1) zzc.i();
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (HJ1.a[i - 1]) {
            case 1:
                return new C7960xJ1();
            case 2:
                return new C7770wJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C7960xJ1.class) {
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

    public final C7198tJ1 o() {
        C7198tJ1 c7198tJ1 = this.zzh;
        return c7198tJ1 == null ? C7198tJ1.n() : c7198tJ1;
    }

    public final String q() {
        return this.zzg;
    }

    public final boolean r() {
        return this.zzi;
    }

    public final boolean s() {
        return this.zzj;
    }

    public final boolean t() {
        return this.zzk;
    }

    public final boolean u() {
        return (this.zze & 1) != 0;
    }

    public final boolean v() {
        return (this.zze & 32) != 0;
    }
}
