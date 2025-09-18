package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: z90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11889z90 {

    /* renamed from: a */
    public static final Charset f46666a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f46667b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f46667b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw Z90.m9501f();
        } catch (Z90 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static void m26313a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: b */
    public static int m26314b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static B00 m26315c(Object obj, Object obj2) {
        B00 b00 = (B00) ((AbstractC0694L0) obj);
        AbstractC10975s00 abstractC10975s00 = (AbstractC10975s00) b00.mo432d(5);
        abstractC10975s00.m24569h();
        AbstractC10975s00.m24566i(abstractC10975s00.f42194b, b00);
        AbstractC0694L0 abstractC0694L0 = (AbstractC0694L0) obj2;
        if (!abstractC10975s00.f42193a.getClass().isInstance(abstractC0694L0)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC10975s00.m24569h();
        AbstractC10975s00.m24566i(abstractC10975s00.f42194b, (B00) abstractC0694L0);
        return abstractC10975s00.m24568e();
    }
}
