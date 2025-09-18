package defpackage;

/* renamed from: iO1 */
/* loaded from: classes.dex */
public final class C4337iO1 extends EE1 {
    private static final C4337iO1 zzb;
    private int zzd;
    private int zze;

    static {
        C4337iO1 c4337iO1 = new C4337iO1();
        zzb = c4337iO1;
        EE1.i(C4337iO1.class, c4337iO1);
    }

    public static C4337iO1 n() {
        return zzb;
    }

    @Override // defpackage.EE1
    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C7204tL1.g});
        }
        if (i2 == 3) {
            return new C4337iO1();
        }
        if (i2 == 4) {
            return new C2507cO1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
