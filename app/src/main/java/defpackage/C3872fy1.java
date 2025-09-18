package defpackage;

/* renamed from: fy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3872fy1 extends QG1 implements KI1 {
    private static final C3872fy1 zzb;
    private InterfaceC7383uH1 zzd = C5480kJ1.d;

    static {
        C3872fy1 c3872fy1 = new C3872fy1();
        zzb = c3872fy1;
        QG1.h(C3872fy1.class, c3872fy1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C3681ey1.class});
        }
        if (i2 == 3) {
            return new C3872fy1();
        }
        if (i2 == 4) {
            return new DR1(1, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
