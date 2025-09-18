package p000;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: fJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9353fJ0 {

    /* renamed from: a */
    public static final byte f27134a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f27135b = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    public static String m18200a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[17]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        byte b = bArrArray[0];
        bArrArray[16] = b;
        bArrArray[0] = (byte) ((b & f27135b) | f27134a);
        return new String(Base64.encode(bArrArray, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
