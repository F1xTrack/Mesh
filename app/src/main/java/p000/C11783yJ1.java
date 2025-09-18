package p000;

import java.util.List;

/* renamed from: yJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11783yJ1 extends AbstractC10908rS1 {
    private static final C11783yJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private LS1 zzi = C8733aV1.f15539e;

    static {
        C11783yJ1 c11783yJ1 = new C11783yJ1();
        zzc = c11783yJ1;
        AbstractC10908rS1.m24344g(C11783yJ1.class, c11783yJ1);
    }

    /* renamed from: o */
    public static C11783yJ1 m26124o() {
        return zzc;
    }

    @Override // p000.AbstractC10908rS1
    /* renamed from: d */
    public final Object mo644d(int i) {
        int i2 = 3;
        switch (HJ1.f4230a[i - 1]) {
            case 1:
                return new C11783yJ1();
            case 2:
                return new C11274uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", KJ1.f6017c, "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                KU1 c10246mH1 = zzd;
                if (c10246mH1 == null) {
                    synchronized (C11783yJ1.class) {
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
    public final int m26125m() {
        return this.zzi.size();
    }

    /* renamed from: n */
    public final int m26126n() {
        int i;
        switch (this.zzf) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: p */
    public final String m26127p() {
        return this.zzg;
    }

    /* renamed from: q */
    public final List m26128q() {
        return this.zzi;
    }

    /* renamed from: r */
    public final boolean m26129r() {
        return this.zzh;
    }

    /* renamed from: s */
    public final boolean m26130s() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: t */
    public final boolean m26131t() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: u */
    public final boolean m26132u() {
        return (this.zze & 1) != 0;
    }
}
