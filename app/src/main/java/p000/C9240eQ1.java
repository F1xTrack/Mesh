package p000;

/* renamed from: eQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9240eQ1 extends QG1 implements KI1 {
    private static final C9240eQ1 zzb;
    private int zzd;
    private int zze;
    private int zzf = 100;
    private int zzg;

    static {
        C9240eQ1 c9240eQ1 = new C9240eQ1();
        zzb = c9240eQ1;
        QG1.m6620h(C9240eQ1.class, c9240eQ1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", C7415By1.f1132x, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C9240eQ1();
        }
        if (i2 == 4) {
            return new DR1(28, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
