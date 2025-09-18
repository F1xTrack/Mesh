package defpackage;

/* renamed from: ey1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3681ey1 extends QG1 implements KI1 {
    private static final C3681ey1 zzb;
    private int zzd;
    private int zze;
    private JE1 zzf = JE1.b;

    static {
        C3681ey1 c3681ey1 = new C3681ey1();
        zzb = c3681ey1;
        QG1.h(C3681ey1.class, c3681ey1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C3681ey1();
        }
        if (i2 == 4) {
            return new DR1(2, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
