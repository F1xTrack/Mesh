package defpackage;

/* renamed from: uQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7410uQ1 extends QG1 implements KI1 {
    private static final C7410uQ1 zzb;
    private int zzd;
    private String zze = "";
    private MQ1 zzf;

    static {
        C7410uQ1 c7410uQ1 = new C7410uQ1();
        zzb = c7410uQ1;
        QG1.h(C7410uQ1.class, c7410uQ1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C7410uQ1();
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
