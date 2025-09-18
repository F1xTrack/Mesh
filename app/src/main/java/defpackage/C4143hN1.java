package defpackage;

/* renamed from: hN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4143hN1 extends EE1 {
    private static final C4143hN1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C4143hN1 c4143hN1 = new C4143hN1();
        zzb = c4143hN1;
        EE1.i(C4143hN1.class, c4143hN1);
    }

    public static /* synthetic */ void n(C4143hN1 c4143hN1) {
        c4143hN1.zzd |= 2;
        c4143hN1.zzf = false;
    }

    public static C3380dN1 o() {
        return (C3380dN1) zzb.d();
    }

    @Override // defpackage.EE1
    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C4143hN1();
        }
        if (i2 == 4) {
            return new C3380dN1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
