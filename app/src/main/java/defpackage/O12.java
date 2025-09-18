package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class O12 {
    public static int a(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(AbstractC8235ym.f(i3, "PROTOCOL_ERROR padding ", i, " > remaining length "));
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
