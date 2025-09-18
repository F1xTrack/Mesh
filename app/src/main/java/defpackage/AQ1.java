package defpackage;

/* loaded from: classes.dex */
public final class AQ1 extends QG1 implements KI1 {
    private static final AQ1 zzb;
    private int zzd;
    private InterfaceC7383uH1 zze = C5480kJ1.d;
    private HQ1 zzf;
    private LN1 zzg;

    static {
        AQ1 aq1 = new AQ1();
        zzb = aq1;
        QG1.h(AQ1.class, aq1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", C6077nR1.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new AQ1();
        }
        if (i2 == 4) {
            return new C6837rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
