package defpackage;

/* loaded from: classes.dex */
public final class IN1 extends EE1 {
    private static final IN1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private WM1 zzg;
    private C4143hN1 zzh;

    static {
        IN1 in1 = new IN1();
        zzb = in1;
        EE1.i(IN1.class, in1);
    }

    public static /* synthetic */ void n(IN1 in1, C4337iO1 c4337iO1) {
        in1.zzf = c4337iO1;
        in1.zze = 4;
    }

    public static /* synthetic */ void o(IN1 in1, DM1 dm1) {
        in1.zzf = dm1;
        in1.zze = 5;
    }

    public static /* synthetic */ void p(IN1 in1, C4143hN1 c4143hN1) {
        in1.zzh = c4143hN1;
        in1.zzd |= 2;
    }

    public static /* synthetic */ void q(IN1 in1, WM1 wm1) {
        in1.zzg = wm1;
        in1.zzd |= 1;
    }

    public static /* synthetic */ void r(IN1 in1, C6059nL1 c6059nL1) {
        in1.zzf = c6059nL1;
        in1.zze = 2;
    }

    public static /* synthetic */ void s(IN1 in1, DL1 dl1) {
        in1.zzf = dl1;
        in1.zze = 3;
    }

    public static FN1 t() {
        return (FN1) zzb.d();
    }

    @Override // defpackage.EE1
    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", C6059nL1.class, DL1.class, C4337iO1.class, DM1.class, "zzh"});
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
