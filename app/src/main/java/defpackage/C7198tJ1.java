package defpackage;

/* renamed from: tJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7198tJ1 extends AbstractC6843rS1 {
    private static final C7198tJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private C8150yJ1 zzf;
    private C7580vJ1 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C7198tJ1 c7198tJ1 = new C7198tJ1();
        zzc = c7198tJ1;
        AbstractC6843rS1.g(C7198tJ1.class, c7198tJ1);
    }

    public static /* synthetic */ void m(C7198tJ1 c7198tJ1, String str) {
        c7198tJ1.zze |= 8;
        c7198tJ1.zzi = str;
    }

    public static C7198tJ1 n() {
        return zzc;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (HJ1.a[i - 1]) {
            case 1:
                return new C7198tJ1();
            case 2:
                return new C7007sJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C7198tJ1.class) {
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

    public final C7580vJ1 o() {
        C7580vJ1 c7580vJ1 = this.zzg;
        return c7580vJ1 == null ? C7580vJ1.n() : c7580vJ1;
    }

    public final C8150yJ1 p() {
        C8150yJ1 c8150yJ1 = this.zzf;
        return c8150yJ1 == null ? C8150yJ1.o() : c8150yJ1;
    }

    public final String q() {
        return this.zzi;
    }

    public final boolean r() {
        return this.zzh;
    }

    public final boolean s() {
        return (this.zze & 4) != 0;
    }

    public final boolean t() {
        return (this.zze & 2) != 0;
    }

    public final boolean u() {
        return (this.zze & 8) != 0;
    }

    public final boolean v() {
        return (this.zze & 1) != 0;
    }
}
