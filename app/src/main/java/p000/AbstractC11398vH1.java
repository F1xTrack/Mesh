package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: vH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11398vH1 {

    /* renamed from: a */
    public static final Charset f44320a;

    /* renamed from: b */
    public static final byte[] f44321b;

    static {
        Charset.forName("US-ASCII");
        f44320a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f44321b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
