package p000;

/* renamed from: p32, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10602p32 extends QG1 implements KI1 {
    private static final C10602p32 zzb;
    private int zzd;
    private C8557Xx1 zze;

    static {
        C10602p32 c10602p32 = new C10602p32();
        zzb = c10602p32;
        QG1.m6620h(C10602p32.class, c10602p32);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C10602p32();
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
