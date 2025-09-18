package defpackage;

/* renamed from: bP1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2320bP1 extends QG1 implements KI1 {
    private static final C2320bP1 zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C2320bP1 c2320bP1 = new C2320bP1();
        zzb = c2320bP1;
        QG1.h(C2320bP1.class, c2320bP1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", C0172By1.n, "zzf"});
        }
        if (i2 == 3) {
            return new C2320bP1();
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
