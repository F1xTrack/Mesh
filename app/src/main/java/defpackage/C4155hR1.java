package defpackage;

/* renamed from: hR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4155hR1 extends QG1 implements KI1 {
    private static final C4155hR1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C4155hR1 c4155hR1 = new C4155hR1();
        zzb = c4155hR1;
        QG1.h(C4155hR1.class, c4155hR1);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C4155hR1();
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
