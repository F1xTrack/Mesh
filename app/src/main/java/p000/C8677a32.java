package p000;

/* renamed from: a32 */
/* loaded from: classes.dex */
public final class C8677a32 extends QG1 implements KI1 {
    private static final C8677a32 zzb;
    private int zzd;
    private DN1 zzf;
    private JE1 zze = JE1.f5402b;
    private int zzg = 1;
    private float zzh = 0.75f;
    private boolean zzi = true;

    static {
        C8677a32 c8677a32 = new C8677a32();
        zzb = c8677a32;
        QG1.m6620h(C8677a32.class, c8677a32);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C8677a32();
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
