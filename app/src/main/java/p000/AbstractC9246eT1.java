package p000;

import java.io.IOException;

/* renamed from: eT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9246eT1 {
    /* renamed from: a */
    public static void m17996a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* renamed from: b */
    public static void m17997b(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* renamed from: c */
    public static void m17998c(C9595hC0 c9595hC0, long j) throws IOException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException();
        }
        while (j > 0) {
            long jSkip = c9595hC0.skip(j);
            if (jSkip <= 0) {
                if (c9595hC0.read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j -= jSkip;
        }
    }
}
