package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public final class G60 {
    public static final byte[] b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    public final C3513e41 a;

    public G60(InputStream inputStream) {
        this.a = new C3513e41(20, inputStream);
    }

    public final int a() throws IOException {
        int i;
        short s;
        int i2;
        int i3;
        int i4;
        short s2;
        InputStream inputStream = (InputStream) this.a.b;
        int i5 = ((inputStream.read() << 8) & 65280) | (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE);
        if ((i5 & 65496) != 65496 && i5 != 19789 && i5 != 18761) {
            return -1;
        }
        while (((short) (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE)) == 255 && (s2 = (short) (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE)) != 218 && s2 != 217) {
            i = (((inputStream.read() << 8) & 65280) | (inputStream.read() & KotlinVersion.MAX_COMPONENT_VALUE)) - 2;
            if (s2 == 225) {
                break;
            }
            long j = i;
            long j2 = 0;
            if (j >= 0) {
                long j3 = j;
                while (j3 > 0) {
                    long jSkip = inputStream.skip(j3);
                    if (jSkip <= 0) {
                        if (inputStream.read() == -1) {
                            break;
                        }
                        jSkip = 1;
                    }
                    j3 -= jSkip;
                }
                j2 = j - j3;
            }
            if (j2 != j) {
                break;
            }
        }
        i = -1;
        if (i == -1) {
            return -1;
        }
        byte[] bArr = new byte[i];
        int i6 = i;
        while (i6 > 0) {
            int i7 = inputStream.read(bArr, i - i6, i6);
            if (i7 == -1) {
                break;
            }
            i6 -= i7;
        }
        if (i - i6 != i) {
            return -1;
        }
        byte[] bArr2 = b;
        boolean z = i > bArr2.length;
        if (z) {
            int i8 = 0;
            while (true) {
                if (i8 >= bArr2.length) {
                    break;
                }
                if (bArr[i8] != bArr2[i8]) {
                    z = false;
                    break;
                }
                i8++;
            }
        }
        if (!z) {
            return -1;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ByteBuffer byteBuffer = (ByteBuffer) byteBufferWrap.order(byteOrder).limit(i);
        short s3 = byteBuffer.getShort(6);
        if (s3 != 19789 && s3 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        byteBuffer.order(byteOrder);
        int i9 = byteBuffer.getInt(10);
        short s4 = byteBuffer.getShort(i9 + 6);
        for (int i10 = 0; i10 < s4; i10++) {
            int i11 = (i10 * 12) + i9 + 8;
            if (byteBuffer.getShort(i11) == 274 && (s = byteBuffer.getShort(i11 + 2)) >= 1 && s <= 12 && (i2 = byteBuffer.getInt(i11 + 4)) >= 0 && (i3 = i2 + c[s]) <= 4 && (i4 = i11 + 8) >= 0 && i4 <= byteBuffer.remaining() && i3 >= 0 && i3 + i4 <= byteBuffer.remaining()) {
                return byteBuffer.getShort(i4);
            }
        }
        return -1;
    }
}
