package p000;

/* renamed from: ey1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9308ey1 extends QG1 implements KI1 {
    private static final C9308ey1 zzb;
    private int zzd;
    private int zze;
    private JE1 zzf = JE1.f5402b;

    static {
        C9308ey1 c9308ey1 = new C9308ey1();
        zzb = c9308ey1;
        QG1.m6620h(C9308ey1.class, c9308ey1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C9308ey1();
        }
        if (i2 == 4) {
            return new DR1(2, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
