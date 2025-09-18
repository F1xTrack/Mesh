package p000;

/* renamed from: eJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9225eJ0 {

    /* renamed from: a */
    public static final C9097dJ0 f26655a = new C9097dJ0();

    /* renamed from: b */
    public static final AbstractC1008Q0 f26656b;

    static {
        Integer num = AbstractC10923ra0.f41736a;
        f26656b = (num == null || num.intValue() >= 34) ? new C11893zB0() : new C6744rS();
    }

    /* renamed from: a */
    public abstract int mo6522a(int i);

    /* renamed from: b */
    public abstract int mo6523b();

    /* renamed from: c */
    public abstract int mo6524c(int i);

    /* renamed from: d */
    public abstract long mo6525d();

    /* renamed from: e */
    public long mo17529e(long j) {
        return mo17530f(j);
    }

    /* renamed from: f */
    public long mo17530f(long j) {
        long jMo6525d;
        long j2;
        int iMo6523b;
        if (j <= 0) {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0L) + ", " + Long.valueOf(j) + ").").toString());
        }
        if (j > 0) {
            if (((-j) & j) != j) {
                do {
                    jMo6525d = mo6525d() >>> 1;
                    j2 = jMo6525d % j;
                } while ((j - 1) + (jMo6525d - j2) < 0);
                return j2;
            }
            int i = (int) j;
            int i2 = (int) (j >>> 32);
            if (i != 0) {
                iMo6523b = mo6522a(31 - Integer.numberOfLeadingZeros(i));
            } else {
                if (i2 != 1) {
                    return (mo6522a(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (mo6523b() & 4294967295L);
                }
                iMo6523b = mo6523b();
            }
            return iMo6523b & 4294967295L;
        }
        while (true) {
            long jMo6525d2 = mo6525d();
            if (0 <= jMo6525d2 && jMo6525d2 < j) {
                return jMo6525d2;
            }
        }
    }
}
