package defpackage;

/* renamed from: uR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7413uR1 extends QG1 implements KI1 {
    private static final C7413uR1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        C7413uR1 c7413uR1 = new C7413uR1();
        zzb = c7413uR1;
        QG1.h(C7413uR1.class, c7413uR1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", C0172By1.A, "zzg"});
        }
        if (i2 == 3) {
            return new C7413uR1();
        }
        if (i2 == 4) {
            return new C6837rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
