package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: lQ */
/* loaded from: classes.dex */
public final class C6362lQ {

    /* renamed from: d */
    public static final Charset f37044d = StandardCharsets.US_ASCII;

    /* renamed from: e */
    public static final String[] f37045e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: f */
    public static final int[] f37046f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: a */
    public final int f37047a;

    /* renamed from: b */
    public final int f37048b;

    /* renamed from: c */
    public final byte[] f37049c;

    public C6362lQ(byte[] bArr, int i, int i2) {
        this.f37047a = i;
        this.f37048b = i2;
        this.f37049c = bArr;
    }

    /* renamed from: a */
    public static C6362lQ m22426a(long j, ByteOrder byteOrder) {
        return m22427b(new long[]{j}, byteOrder);
    }

    /* renamed from: b */
    public static C6362lQ m22427b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f37046f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new C6362lQ(byteBufferWrap.array(), 4, jArr.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(f37045e[this.f37047a]);
        sb.append(", data length:");
        return AbstractC1374Vq.m8591j(sb, this.f37049c.length, ")");
    }
}
