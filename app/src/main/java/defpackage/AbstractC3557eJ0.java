package defpackage;

/* renamed from: eJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3557eJ0 {
    public static final C3367dJ0 a = new C3367dJ0();
    public static final Q0 b;

    static {
        Integer num = AbstractC6866ra0.a;
        b = (num == null || num.intValue() >= 34) ? new C8315zB0() : new C6841rS();
    }

    public abstract int a(int i);

    public abstract int b();

    public abstract int c(int i);

    public abstract long d();

    public long e(long j) {
        return f(j);
    }

    public long f(long j) {
        long jD;
        long j2;
        int iB;
        if (j <= 0) {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0L) + ", " + Long.valueOf(j) + ").").toString());
        }
        if (j > 0) {
            if (((-j) & j) != j) {
                do {
                    jD = d() >>> 1;
                    j2 = jD % j;
                } while ((j - 1) + (jD - j2) < 0);
                return j2;
            }
            int i = (int) j;
            int i2 = (int) (j >>> 32);
            if (i != 0) {
                iB = a(31 - Integer.numberOfLeadingZeros(i));
            } else {
                if (i2 != 1) {
                    return (a(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (b() & 4294967295L);
                }
                iB = b();
            }
            return iB & 4294967295L;
        }
        while (true) {
            long jD2 = d();
            if (0 <= jD2 && jD2 < j) {
                return jD2;
            }
        }
    }
}
