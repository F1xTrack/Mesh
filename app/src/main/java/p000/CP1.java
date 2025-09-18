package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CP1 {
    /* renamed from: a */
    public static void m1181a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
    }

    /* renamed from: b */
    public static int m1182b(InputStream inputStream, byte[] bArr, int i) throws IOException {
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
