package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: z90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8309z90 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw Z90.f();
        } catch (Z90 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static B00 c(Object obj, Object obj2) {
        B00 b00 = (B00) ((L0) obj);
        AbstractC6945s00 abstractC6945s00 = (AbstractC6945s00) b00.d(5);
        abstractC6945s00.h();
        AbstractC6945s00.i(abstractC6945s00.b, b00);
        L0 l0 = (L0) obj2;
        if (!abstractC6945s00.a.getClass().isInstance(l0)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC6945s00.h();
        AbstractC6945s00.i(abstractC6945s00.b, (B00) l0);
        return abstractC6945s00.e();
    }
}
