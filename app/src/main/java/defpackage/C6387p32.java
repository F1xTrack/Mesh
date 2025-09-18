package defpackage;

/* renamed from: p32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6387p32 extends QG1 implements KI1 {
    private static final C6387p32 zzb;
    private int zzd;
    private C1884Xx1 zze;

    static {
        C6387p32 c6387p32 = new C6387p32();
        zzb = c6387p32;
        QG1.h(C6387p32.class, c6387p32);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C6387p32();
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
