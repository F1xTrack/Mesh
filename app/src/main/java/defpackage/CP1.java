package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CP1 {
    public static void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
    }

    public static int b(InputStream inputStream, byte[] bArr, int i) throws IOException {
        inputStream.getClass();
        if (i < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        return i2;
    }
}
