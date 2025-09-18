package p000;

/* renamed from: bP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8849bP1 extends QG1 implements KI1 {
    private static final C8849bP1 zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C8849bP1 c8849bP1 = new C8849bP1();
        zzb = c8849bP1;
        QG1.m6620h(C8849bP1.class, c8849bP1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", C7415By1.f1122n, "zzf"});
        }
        if (i2 == 3) {
            return new C8849bP1();
        }
        if (i2 == 4) {
            return new DR1(23, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
