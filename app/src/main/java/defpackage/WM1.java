package defpackage;

/* loaded from: classes.dex */
public final class WM1 extends EE1 {
    private static final WM1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        WM1 wm1 = new WM1();
        zzb = wm1;
        EE1.i(WM1.class, wm1);
    }

    public static /* synthetic */ void n(WM1 wm1, String str) {
        str.getClass();
        wm1.zzd |= 1;
        wm1.zze = str;
    }

    public static /* synthetic */ void o(WM1 wm1, String str) {
        str.getClass();
        wm1.zzd |= 2;
        wm1.zzf = str;
    }

    public static TM1 p() {
        return (TM1) zzb.d();
    }

    @Override // defpackage.EE1
    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new WM1();
        }
        if (i2 == 4) {
            return new TM1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
