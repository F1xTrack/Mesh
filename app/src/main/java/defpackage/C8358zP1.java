package defpackage;

/* renamed from: zP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8358zP1 extends QG1 implements KI1 {
    private static final C8358zP1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C8358zP1 c8358zP1 = new C8358zP1();
        zzb = c8358zP1;
        QG1.h(C8358zP1.class, c8358zP1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C8358zP1();
        }
        if (i2 == 4) {
            return new DR1(25, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
