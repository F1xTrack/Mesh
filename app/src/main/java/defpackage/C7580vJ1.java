package defpackage;

/* renamed from: vJ1 */
/* loaded from: classes.dex */
public final class C7580vJ1 extends AbstractC6843rS1 {
    private static final C7580vJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C7580vJ1 c7580vJ1 = new C7580vJ1();
        zzc = c7580vJ1;
        AbstractC6843rS1.g(C7580vJ1.class, c7580vJ1);
    }

    public static C7580vJ1 n() {
        return zzc;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        switch (HJ1.a[i - 1]) {
            case 1:
                return new C7580vJ1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", KJ1.b, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C7580vJ1.class) {
                        try {
                            c5856mH1 = zzd;
                            if (c5856mH1 == null) {
                                c5856mH1 = new C5856mH1(3);
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
        int iA = RI1.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final String o() {
        return this.zzh;
    }

    public final String p() {
        return this.zzj;
    }

    public final String q() {
        return this.zzi;
    }

    public final boolean r() {
        return this.zzg;
    }

    public final boolean s() {
        return (this.zze & 1) != 0;
    }

    public final boolean t() {
        return (this.zze & 4) != 0;
    }

    public final boolean u() {
        return (this.zze & 2) != 0;
    }

    public final boolean v() {
        return (this.zze & 16) != 0;
    }

    public final boolean w() {
        return (this.zze & 8) != 0;
    }
}
