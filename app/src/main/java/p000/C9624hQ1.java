package p000;

/* renamed from: hQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9624hQ1 extends QG1 implements KI1 {
    private static final C9624hQ1 zzb;
    private int zzd;
    private int zze;

    static {
        C9624hQ1 c9624hQ1 = new C9624hQ1();
        zzb = c9624hQ1;
        QG1.m6620h(C9624hQ1.class, c9624hQ1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C9624hQ1();
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
