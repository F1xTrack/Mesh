package defpackage;

import java.util.List;

/* renamed from: yJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8150yJ1 extends AbstractC6843rS1 {
    private static final C8150yJ1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private LS1 zzi = C2147aV1.e;

    static {
        C8150yJ1 c8150yJ1 = new C8150yJ1();
        zzc = c8150yJ1;
        AbstractC6843rS1.g(C8150yJ1.class, c8150yJ1);
    }

    public static C8150yJ1 o() {
        return zzc;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (HJ1.a[i - 1]) {
            case 1:
                return new C8150yJ1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", KJ1.c, "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C8150yJ1.class) {
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
        return this.zzi.size();
    }

    public final int n() {
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

    public final String p() {
        return this.zzg;
    }

    public final List q() {
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
        return (this.zze & 1) != 0;
    }
}
