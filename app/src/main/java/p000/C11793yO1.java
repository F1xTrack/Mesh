package p000;

/* renamed from: yO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11793yO1 extends QG1 implements KI1 {
    private static final C11793yO1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        C11793yO1 c11793yO1 = new C11793yO1();
        zzb = c11793yO1;
        QG1.m6620h(C11793yO1.class, c11793yO1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", C7415By1.f1118j, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C11793yO1();
        }
        if (i2 == 4) {
            return new DR1(20, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
