package defpackage;

/* loaded from: classes.dex */
public final class DL1 extends EE1 {
    private static final DL1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        DL1 dl1 = new DL1();
        zzb = dl1;
        EE1.i(DL1.class, dl1);
    }

    public static /* synthetic */ void n(DL1 dl1, C7782wN1 c7782wN1) {
        dl1.zzf = c7782wN1;
        dl1.zze = 2;
    }

    public static /* synthetic */ void o(DL1 dl1, int i) {
        dl1.zzg = i - 1;
        dl1.zzd |= 1;
    }

    public static AL1 p() {
        return (AL1) zzb.d();
    }

    @Override // defpackage.EE1
    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C7204tL1.b, C7782wN1.class});
        }
        if (i2 == 3) {
            return new DL1();
        }
        if (i2 == 4) {
            return new AL1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
