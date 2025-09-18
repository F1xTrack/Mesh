package defpackage;

/* renamed from: Xx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884Xx1 extends QG1 implements KI1 {
    private static final C1884Xx1 zzb;
    private int zzd;
    private C5412jy1 zze;
    private boolean zzf;

    static {
        C1884Xx1 c1884Xx1 = new C1884Xx1();
        zzb = c1884Xx1;
        QG1.h(C1884Xx1.class, c1884Xx1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C1884Xx1();
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
