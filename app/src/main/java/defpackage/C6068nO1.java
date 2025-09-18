package defpackage;

/* renamed from: nO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6068nO1 extends QG1 implements KI1 {
    private static final C6068nO1 zzb;
    private int zzd;
    private String zze = "";
    private int zzf = 1;
    private boolean zzg;
    private int zzh;

    static {
        C6068nO1 c6068nO1 = new C6068nO1();
        zzb = c6068nO1;
        QG1.h(C6068nO1.class, c6068nO1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", C0172By1.i, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C6068nO1();
        }
        if (i2 == 4) {
            return new DR1(19, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
