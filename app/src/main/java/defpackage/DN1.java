package defpackage;

/* loaded from: classes.dex */
public final class DN1 extends QG1 implements KI1 {
    private static final DN1 zzb;
    private int zzd;
    private int zze;
    private C6077nR1 zzf;
    private C7410uQ1 zzg;
    private AQ1 zzh;

    static {
        DN1 dn1 = new DN1();
        zzb = dn1;
        QG1.h(DN1.class, dn1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003", new Object[]{"zzd", "zze", C0172By1.r, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new DN1();
        }
        if (i2 == 4) {
            return new DR1(15, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
