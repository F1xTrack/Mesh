package defpackage;

/* renamed from: r12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6760r12 extends QG1 implements KI1 {
    private static final C6760r12 zzb;

    static {
        C6760r12 c6760r12 = new C6760r12();
        zzb = c6760r12;
        QG1.h(C6760r12.class, c6760r12);
    }

    @Override // defpackage.QG1
    public final Object m(int i, QG1 qg1) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C8340zJ1(zzb, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new C6760r12();
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
