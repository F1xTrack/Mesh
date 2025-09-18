package defpackage;

import java.io.IOException;

/* renamed from: eT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3588eT1 {
    public static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void b(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void c(C4109hC0 c4109hC0, long j) throws IOException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException();
        }
        while (j > 0) {
            long jSkip = c4109hC0.skip(j);
            if (jSkip <= 0) {
                if (c4109hC0.read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j -= jSkip;
        }
    }
}
