package p000;

/* renamed from: zP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11922zP1 extends QG1 implements KI1 {
    private static final C11922zP1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C11922zP1 c11922zP1 = new C11922zP1();
        zzb = c11922zP1;
        QG1.m6620h(C11922zP1.class, c11922zP1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဇ\u0000\u0006ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C11922zP1();
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
