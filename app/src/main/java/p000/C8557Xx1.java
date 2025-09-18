package p000;

/* renamed from: Xx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8557Xx1 extends QG1 implements KI1 {
    private static final C8557Xx1 zzb;
    private int zzd;
    private C9948jy1 zze;
    private boolean zzf;

    static {
        C8557Xx1 c8557Xx1 = new C8557Xx1();
        zzb = c8557Xx1;
        QG1.m6620h(C8557Xx1.class, c8557Xx1);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C8557Xx1();
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
