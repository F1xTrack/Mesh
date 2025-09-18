package defpackage;

import java.util.List;

/* renamed from: lK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5674lK1 extends AbstractC6843rS1 {
    private static final C5674lK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private LS1 zzi;
    private LS1 zzj;
    private LS1 zzk;
    private String zzl;
    private boolean zzm;
    private LS1 zzn;
    private LS1 zzo;
    private String zzp;
    private String zzq;
    private C3943gK1 zzr;
    private C6056nK1 zzs;
    private C6629qK1 zzt;
    private C6247oK1 zzu;
    private C5865mK1 zzv;

    static {
        C5674lK1 c5674lK1 = new C5674lK1();
        zzc = c5674lK1;
        AbstractC6843rS1.g(C5674lK1.class, c5674lK1);
    }

    public C5674lK1() {
        C2147aV1 c2147aV1 = C2147aV1.e;
        this.zzi = c2147aV1;
        this.zzj = c2147aV1;
        this.zzk = c2147aV1;
        this.zzl = "";
        this.zzn = c2147aV1;
        this.zzo = c2147aV1;
        this.zzp = "";
        this.zzq = "";
    }

    public static void o(C5674lK1 c5674lK1) {
        c5674lK1.zzk = C2147aV1.e;
    }

    public static void p(C5674lK1 c5674lK1, int i, C5292jK1 c5292jK1) {
        LS1 ls1 = c5674lK1.zzj;
        if (!((RP1) ls1).a) {
            c5674lK1.zzj = ls1.a(ls1.size() << 1);
        }
        c5674lK1.zzj.set(i, c5292jK1);
    }

    public static C5483kK1 t() {
        return (C5483kK1) zzc.i();
    }

    public static C5674lK1 u() {
        return zzc;
    }

    public final LS1 A() {
        return this.zzn;
    }

    public final LS1 B() {
        return this.zzi;
    }

    public final boolean C() {
        return (this.zze & 128) != 0;
    }

    public final boolean D() {
        return (this.zze & 2) != 0;
    }

    public final boolean E() {
        return (this.zze & 512) != 0;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC2495cK1.a[i - 1]) {
            case 1:
                return new C5674lK1();
            case 2:
                return new C5483kK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C6438pK1.class, "zzj", C5292jK1.class, "zzk", C6435pJ1.class, "zzl", "zzm", "zzn", WL1.class, "zzo", C4134hK1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C5674lK1.class) {
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
        return this.zzn.size();
    }

    public final C5292jK1 n(int i) {
        return (C5292jK1) this.zzj.get(i);
    }

    public final int q() {
        return this.zzj.size();
    }

    public final long r() {
        return this.zzf;
    }

    public final C3943gK1 s() {
        C3943gK1 c3943gK1 = this.zzr;
        return c3943gK1 == null ? C3943gK1.m() : c3943gK1;
    }

    public final C6629qK1 v() {
        C6629qK1 c6629qK1 = this.zzt;
        return c6629qK1 == null ? C6629qK1.n() : c6629qK1;
    }

    public final String w() {
        return this.zzg;
    }

    public final String x() {
        return this.zzp;
    }

    public final List y() {
        return this.zzk;
    }

    public final LS1 z() {
        return this.zzo;
    }
}
