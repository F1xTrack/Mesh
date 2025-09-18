package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: dF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9090dF1 {

    /* renamed from: a */
    public static final Charset f25904a;

    /* renamed from: b */
    public static final byte[] f25905b;

    static {
        Charset.forName("US-ASCII");
        f25904a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f25905b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
