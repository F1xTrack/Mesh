package defpackage;

/* renamed from: wN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7782wN1 extends EE1 {
    private static final C7782wN1 zzb;
    private int zzd;
    private int zze;

    static {
        C7782wN1 c7782wN1 = new C7782wN1();
        zzb = c7782wN1;
        EE1.i(C7782wN1.class, c7782wN1);
    }

    public static /* synthetic */ void n(C7782wN1 c7782wN1, int i) {
        c7782wN1.zze = i - 1;
        c7782wN1.zzd |= 1;
    }

    public static C6638qN1 o() {
        return (C6638qN1) zzb.d();
    }

    @Override // defpackage.EE1
    public final Object m(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new NH1(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C7204tL1.f});
        }
        if (i2 == 3) {
            return new C7782wN1();
        }
        if (i2 == 4) {
            return new C6638qN1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
