package defpackage;

/* loaded from: classes.dex */
public final class XV1 extends QG1 implements KI1 {
    private static final XV1 zzb;
    private int zzd = 0;
    private Object zze;

    static {
        XV1 xv1 = new XV1();
        zzb = xv1;
        QG1.h(XV1.class, xv1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zze", "zzd", C6760r12.class, T32.class, C2063a32.class});
        }
        if (i2 == 3) {
            return new XV1();
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
