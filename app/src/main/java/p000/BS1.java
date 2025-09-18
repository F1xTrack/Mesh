package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class BS1 {

    /* renamed from: a */
    public static final Charset f826a;

    /* renamed from: b */
    public static final byte[] f827b;

    static {
        Charset.forName("US-ASCII");
        f826a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f827b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw VS1.m8440b();
            }
            int i = (0 - 0) + length;
            if (i < 0) {
                throw VS1.m8441c();
            }
            if (i > Integer.MAX_VALUE) {
                throw VS1.m8442d();
            }
        } catch (VS1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m719a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
