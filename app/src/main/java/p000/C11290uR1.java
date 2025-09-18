package p000;

/* renamed from: uR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11290uR1 extends QG1 implements KI1 {
    private static final C11290uR1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        C11290uR1 c11290uR1 = new C11290uR1();
        zzb = c11290uR1;
        QG1.m6620h(C11290uR1.class, c11290uR1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", C7415By1.f1107A, "zzg"});
        }
        if (i2 == 3) {
            return new C11290uR1();
        }
        if (i2 == 4) {
            return new C10904rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
