package p000;

/* renamed from: bz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8921bz1 extends QG1 implements KI1 {
    private static final C8921bz1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C8921bz1 c8921bz1 = new C8921bz1();
        zzb = c8921bz1;
        QG1.m6620h(C8921bz1.class, c8921bz1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C8921bz1();
        }
        if (i2 == 4) {
            return new DR1(6, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
