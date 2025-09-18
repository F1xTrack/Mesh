package defpackage;

/* loaded from: classes.dex */
public final class T32 extends QG1 implements KI1 {
    private static final T32 zzb;

    static {
        T32 t32 = new T32();
        zzb = t32;
        QG1.h(T32.class, t32);
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
            return new T32();
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
