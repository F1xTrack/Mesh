package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: dF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3356dF1 {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
