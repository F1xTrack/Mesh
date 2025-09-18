package defpackage;

/* renamed from: eQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3579eQ1 extends QG1 implements KI1 {
    private static final C3579eQ1 zzb;
    private int zzd;
    private int zze;
    private int zzf = 100;
    private int zzg;

    static {
        C3579eQ1 c3579eQ1 = new C3579eQ1();
        zzb = c3579eQ1;
        QG1.h(C3579eQ1.class, c3579eQ1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", C0172By1.x, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C3579eQ1();
        }
        if (i2 == 4) {
            return new DR1(28, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
