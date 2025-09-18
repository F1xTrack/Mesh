package defpackage;

/* renamed from: lQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5692lQ1 extends QG1 implements KI1 {
    private static final C5692lQ1 zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC7383uH1 zzf = C5480kJ1.d;

    static {
        C5692lQ1 c5692lQ1 = new C5692lQ1();
        zzb = c5692lQ1;
        QG1.h(C5692lQ1.class, c5692lQ1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C7150t32.class});
        }
        if (i2 == 3) {
            return new C5692lQ1();
        }
        if (i2 == 4) {
            return new DR1(22, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
