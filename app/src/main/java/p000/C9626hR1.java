package p000;

/* renamed from: hR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9626hR1 extends QG1 implements KI1 {
    private static final C9626hR1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C9626hR1 c9626hR1 = new C9626hR1();
        zzb = c9626hR1;
        QG1.m6620h(C9626hR1.class, c9626hR1);
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
            return new C9626hR1();
        }
        if (i2 == 4) {
            return new C10904rQ1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
