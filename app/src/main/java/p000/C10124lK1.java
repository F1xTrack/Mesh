package p000;

import java.util.List;

/* renamed from: lK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10124lK1 extends AbstractC10908rS1 {
    private static final C10124lK1 zzc;
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
    private C9484gK1 zzr;
    private C10380nK1 zzs;
    private C10764qK1 zzt;
    private C10508oK1 zzu;
    private C10252mK1 zzv;

    static {
        C10124lK1 c10124lK1 = new C10124lK1();
        zzc = c10124lK1;
        AbstractC10908rS1.m24344g(C10124lK1.class, c10124lK1);
    }

    public C10124lK1() {
        C8733aV1 c8733aV1 = C8733aV1.f15539e;
        this.zzi = c8733aV1;
        this.zzj = c8733aV1;
        this.zzk = c8733aV1;
        this.zzl = "";
        this.zzn = c8733aV1;
        this.zzo = c8733aV1;
        this.zzp = "";
        this.zzq = "";
    }

    /* renamed from: o */
    public static void m22386o(C10124lK1 c10124lK1) {
        c10124lK1.zzk = C8733aV1.f15539e;
    }

    /* renamed from: p */
    public static void m22387p(C10124lK1 c10124lK1, int i, C9868jK1 c9868jK1) {
        LS1 ls1 = c10124lK1.zzj;
        if (!((RP1) ls1).f10166a) {
            c10124lK1.zzj = ls1.mo724a(ls1.size() << 1);
        }
        c10124lK1.zzj.set(i, c9868jK1);
    }

    /* renamed from: t */
    public static C9996kK1 m22388t() {
        return (C9996kK1) zzc.m24346i();
    }

    /* renamed from: u */
    public static C10124lK1 m22389u() {
        return zzc;
    }

    /* renamed from: A */
    public final LS1 m22390A() {
        return this.zzn;
    }

    /* renamed from: B */
    public final LS1 m22391B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final boolean m22392C() {
        return (this.zze & 128) != 0;
    }

    /* renamed from: D */
    public final boolean m22393D() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: E */
    public final boolean m22394E() {
        return (this.zze & 512) != 0;
    }

    /* renamed from: F */
    public final boolean m22395F() {
        return (this.zze & 1) != 0;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (AbstractC8967cK1.f17431a[i - 1]) {
            case 1:
                return new C10124lK1();
            case 2:
                return new C9996kK1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C10636pK1.class, "zzj", C9868jK1.class, "zzk", C10634pJ1.class, "zzl", "zzm", "zzn", WL1.class, "zzo", C9612hK1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C10124lK1.class) {
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
    public final int m22396m() {
        return this.zzn.size();
    }

    /* renamed from: n */
    public final C9868jK1 m22397n(int i) {
        return (C9868jK1) this.zzj.get(i);
    }

    /* renamed from: q */
    public final int m22398q() {
        return this.zzj.size();
    }

    /* renamed from: r */
    public final long m22399r() {
        return this.zzf;
    }

    /* renamed from: s */
    public final C9484gK1 m22400s() {
        C9484gK1 c9484gK1 = this.zzr;
        return c9484gK1 == null ? C9484gK1.m18427m() : c9484gK1;
    }

    /* renamed from: v */
    public final C10764qK1 m22401v() {
        C10764qK1 c10764qK1 = this.zzt;
        return c10764qK1 == null ? C10764qK1.m23979n() : c10764qK1;
    }

    /* renamed from: w */
    public final String m22402w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final String m22403x() {
        return this.zzp;
    }

    /* renamed from: y */
    public final List m22404y() {
        return this.zzk;
    }

    /* renamed from: z */
    public final LS1 m22405z() {
        return this.zzo;
    }
}
