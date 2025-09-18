package p000;

import java.util.Arrays;

/* renamed from: f12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9316f12 {
    /* renamed from: a */
    public static final boolean m18155a(C7705Hn1 c7705Hn1) {
        O90.m5968f(c7705Hn1, "<this>");
        return (c7705Hn1.f4508a.mo2780c() & 8) != 0;
    }

    /* renamed from: b */
    public static ES1 m18156b(C9591hA0 c9591hA0) {
        c9591hA0.m18742H(1);
        int iM18766x = c9591hA0.m18766x();
        long j = c9591hA0.f28294b + iM18766x;
        int i = iM18766x / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jM18757o = c9591hA0.m18757o();
            if (jM18757o == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM18757o;
            jArrCopyOf2[i2] = c9591hA0.m18757o();
            c9591hA0.m18742H(2);
            i2++;
        }
        c9591hA0.m18742H((int) (j - c9591hA0.f28294b));
        return new ES1(jArrCopyOf, jArrCopyOf2, false, 11);
    }
}
