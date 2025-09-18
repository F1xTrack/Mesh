package p000;

/* renamed from: uQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11288uQ1 extends QG1 implements KI1 {
    private static final C11288uQ1 zzb;
    private int zzd;
    private String zze = "";
    private MQ1 zzf;

    static {
        C11288uQ1 c11288uQ1 = new C11288uQ1();
        zzb = c11288uQ1;
        QG1.m6620h(C11288uQ1.class, c11288uQ1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C11288uQ1();
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
