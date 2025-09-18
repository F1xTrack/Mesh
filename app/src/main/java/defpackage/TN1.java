package defpackage;

/* loaded from: classes.dex */
public final class TN1 extends QG1 implements KI1 {
    private static final TN1 zzb;
    private int zzd;
    private int zze = -1;

    static {
        TN1 tn1 = new TN1();
        zzb = tn1;
        QG1.h(TN1.class, tn1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new TN1();
        }
        if (i2 == 4) {
            return new DR1(17, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
