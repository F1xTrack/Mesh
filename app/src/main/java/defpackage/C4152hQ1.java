package defpackage;

/* renamed from: hQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4152hQ1 extends QG1 implements KI1 {
    private static final C4152hQ1 zzb;
    private int zzd;
    private int zze;

    static {
        C4152hQ1 c4152hQ1 = new C4152hQ1();
        zzb = c4152hQ1;
        QG1.h(C4152hQ1.class, c4152hQ1);
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
            return new C4152hQ1();
        }
        if (i2 == 4) {
            return new DR1(29, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
