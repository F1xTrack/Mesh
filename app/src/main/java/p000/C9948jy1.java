package p000;

/* renamed from: jy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9948jy1 extends QG1 implements KI1 {
    private static final C9948jy1 zzb;
    private int zzd;
    private int zze = 4369;
    private String zzf = "";

    static {
        C9948jy1 c9948jy1 = new C9948jy1();
        zzb = c9948jy1;
        QG1.m6620h(C9948jy1.class, c9948jy1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C7415By1.f1108B, "zzf"});
        }
        if (i2 == 3) {
            return new C9948jy1();
        }
        if (i2 == 4) {
            return new DR1(3, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
