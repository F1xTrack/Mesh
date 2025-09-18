package p000;

/* renamed from: r12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10852r12 extends QG1 implements KI1 {
    private static final C10852r12 zzb;

    static {
        C10852r12 c10852r12 = new C10852r12();
        zzb = c10852r12;
        QG1.m6620h(C10852r12.class, c10852r12);
    }

    @Override // p000.QG1
    /* renamed from: m */
    public final Object mo180m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C11910zJ1(zzb, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new C10852r12();
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
