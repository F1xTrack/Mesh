package p000;

/* loaded from: classes.dex */
public final class IN1 extends EE1 {
    private static final IN1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private WM1 zzg;
    private C9618hN1 zzh;

    static {
        IN1 in1 = new IN1();
        zzb = in1;
        EE1.m2094i(IN1.class, in1);
    }

    /* renamed from: n */
    public static /* synthetic */ void m3835n(IN1 in1, C9748iO1 c9748iO1) {
        in1.zzf = c9748iO1;
        in1.zze = 4;
    }

    /* renamed from: o */
    public static /* synthetic */ void m3836o(IN1 in1, DM1 dm1) {
        in1.zzf = dm1;
        in1.zze = 5;
    }

    /* renamed from: p */
    public static /* synthetic */ void m3837p(IN1 in1, C9618hN1 c9618hN1) {
        in1.zzh = c9618hN1;
        in1.zzd |= 2;
    }

    /* renamed from: q */
    public static /* synthetic */ void m3838q(IN1 in1, WM1 wm1) {
        in1.zzg = wm1;
        in1.zzd |= 1;
    }

    /* renamed from: r */
    public static /* synthetic */ void m3839r(IN1 in1, C10382nL1 c10382nL1) {
        in1.zzf = c10382nL1;
        in1.zze = 2;
    }

    /* renamed from: s */
    public static /* synthetic */ void m3840s(IN1 in1, DL1 dl1) {
        in1.zzf = dl1;
        in1.zze = 3;
    }

    /* renamed from: t */
    public static FN1 m3841t() {
        return (FN1) zzb.m2095d();
    }

    @Override // p000.EE1
    /* renamed from: m */
    public final Object mo1649m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", C10382nL1.class, DL1.class, C9748iO1.class, DM1.class, "zzh"});
        }
        if (i2 == 3) {
            return new IN1();
        }
        if (i2 == 4) {
            return new FN1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
