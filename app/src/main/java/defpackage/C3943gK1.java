package defpackage;

import java.util.List;

/* renamed from: gK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3943gK1 extends AbstractC6843rS1 {
    private static final C3943gK1 zzc;
    private static volatile KU1 zzd;
    private int zze;
    private LS1 zzf;
    private LS1 zzg;
    private LS1 zzh;
    private boolean zzi;
    private LS1 zzj;

    static {
        C3943gK1 c3943gK1 = new C3943gK1();
        zzc = c3943gK1;
        AbstractC6843rS1.g(C3943gK1.class, c3943gK1);
    }

    public C3943gK1() {
        C2147aV1 c2147aV1 = C2147aV1.e;
        this.zzf = c2147aV1;
        this.zzg = c2147aV1;
        this.zzh = c2147aV1;
        this.zzj = c2147aV1;
    }

    public static C3943gK1 m() {
        return zzc;
    }

    @Override // defpackage.AbstractC6843rS1
    public final Object d(int i) {
        int i2 = 3;
        switch (AbstractC2495cK1.a[i - 1]) {
            case 1:
                return new C3943gK1();
            case 2:
                return new C7389uJ1(zzc);
            case 3:
                return new YU1(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", C3371dK1.class, "zzg", C3561eK1.class, "zzh", C3752fK1.class, "zzi", "zzj", C3371dK1.class});
            case 4:
                return zzc;
            case 5:
                KU1 c5856mH1 = zzd;
                if (c5856mH1 == null) {
                    synchronized (C3943gK1.class) {
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

    public final LS1 n() {
        return this.zzh;
    }

    public final List o() {
        return this.zzf;
    }

    public final List p() {
        return this.zzg;
    }

    public final List q() {
        return this.zzj;
    }

    public final boolean r() {
        return this.zzi;
    }

    public final boolean s() {
        return (this.zze & 1) != 0;
    }
}
