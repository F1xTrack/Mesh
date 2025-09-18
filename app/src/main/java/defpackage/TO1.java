package defpackage;

/* loaded from: classes.dex */
public final class TO1 extends QG1 implements KI1 {
    private static final TO1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private InterfaceC7383uH1 zzg = C5480kJ1.d;
    private int zzh;

    static {
        TO1 to1 = new TO1();
        zzb = to1;
        QG1.h(TO1.class, to1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zzd", "zze", C0172By1.l, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new TO1();
        }
        if (i2 == 4) {
            return new DR1(21, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
