package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: x90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11635x90 {

    /* renamed from: a */
    public static final Charset f45425a;

    /* renamed from: b */
    public static final byte[] f45426b;

    static {
        Charset.forName("US-ASCII");
        f45425a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f45426b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw new X90("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i = (0 - 0) + length;
            if (i < 0) {
                throw new X90("Failed to parse the message.");
            }
            if (i > Integer.MAX_VALUE) {
                throw new X90("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (X90 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m25777a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
