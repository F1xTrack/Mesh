package p000;

/* renamed from: aO1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8719aO1 extends QG1 implements KI1 {
    private static final C8719aO1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C8719aO1 c8719aO1 = new C8719aO1();
        zzb = c8719aO1;
        QG1.m6620h(C8719aO1.class, c8719aO1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C8719aO1();
        }
        if (i2 == 4) {
            return new DR1(18, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
