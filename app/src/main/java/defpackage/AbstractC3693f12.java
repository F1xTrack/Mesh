package defpackage;

import java.util.Arrays;

/* renamed from: f12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3693f12 {
    public static final boolean a(C0607Hn1 c0607Hn1) {
        O90.f(c0607Hn1, "<this>");
        return (c0607Hn1.a.c() & 8) != 0;
    }

    public static ES1 b(C4103hA0 c4103hA0) {
        c4103hA0.H(1);
        int iX = c4103hA0.x();
        long j = c4103hA0.b + iX;
        int i = iX / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jO = c4103hA0.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jO;
            jArrCopyOf2[i2] = c4103hA0.o();
            c4103hA0.H(2);
            i2++;
        }
        c4103hA0.H((int) (j - c4103hA0.b));
        return new ES1(jArrCopyOf, jArrCopyOf2, false, 11);
    }
}
