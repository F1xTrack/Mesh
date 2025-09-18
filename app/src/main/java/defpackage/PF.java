package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class PF implements H60 {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(NF nf, C8426zm0 c8426zm0) {
        int iA;
        short sD;
        try {
            int iA2 = nf.a();
            if ((iA2 & 65496) != 65496 && iA2 != 19789 && iA2 != 18761) {
                return -1;
            }
            while (nf.d() == 255 && (sD = nf.d()) != 218 && sD != 217) {
                iA = nf.a() - 2;
                if (sD == 225) {
                    break;
                }
                long j = iA;
                if (nf.c(j) != j) {
                    break;
                }
            }
            iA = -1;
            if (iA == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) c8426zm0.d(iA, byte[].class);
            try {
                return g(nf, bArr, iA);
            } finally {
                c8426zm0.h(bArr);
            }
        } catch (MF unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(NF nf) {
        try {
            int iA = nf.a();
            if (iA == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iD = (iA << 8) | nf.d();
            if (iD == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iD2 = (iD << 8) | nf.d();
            if (iD2 == -1991225785) {
                nf.c(21L);
                try {
                    return nf.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (MF unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                nf.c(4L);
                if (((nf.a() << 16) | nf.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iA2 = (nf.a() << 16) | nf.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iA2 & KotlinVersion.MAX_COMPONENT_VALUE;
                if (i == 88) {
                    nf.c(4L);
                    short sD = nf.d();
                    return (sD & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sD & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                nf.c(4L);
                return (nf.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((nf.a() << 16) | nf.a()) == 1718909296) {
                int iA3 = (nf.a() << 16) | nf.a();
                if (iA3 != 1635150182 && iA3 != 1635150195) {
                    nf.c(4L);
                    int i2 = iD2 - 16;
                    if (i2 % 4 == 0) {
                        int i3 = 0;
                        while (i3 < 5 && i2 > 0) {
                            int iA4 = (nf.a() << 16) | nf.a();
                            if (iA4 != 1635150182 && iA4 != 1635150195) {
                                i3++;
                                i2 -= 4;
                            }
                        }
                    }
                }
                return ImageHeaderParser$ImageType.AVIF;
            }
            return ImageHeaderParser$ImageType.UNKNOWN;
        } catch (MF unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(NF nf, byte[] bArr, int i) {
        short sD;
        int i2;
        int i3;
        if (nf.f(i, bArr) != i) {
            return -1;
        }
        byte[] bArr2 = a;
        boolean z = bArr != null && i > bArr2.length;
        if (z) {
            int i4 = 0;
            while (true) {
                if (i4 >= bArr2.length) {
                    break;
                }
                if (bArr[i4] != bArr2[i4]) {
                    z = false;
                    break;
                }
                i4++;
            }
        }
        if (!z) {
            return -1;
        }
        G10 g10 = new G10(bArr, i);
        short sD2 = g10.D(6);
        ByteOrder byteOrder = sD2 != 18761 ? sD2 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBuffer = (ByteBuffer) g10.b;
        byteBuffer.order(byteOrder);
        int i5 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short sD3 = g10.D(i5 + 6);
        for (int i6 = 0; i6 < sD3; i6++) {
            int i7 = (i6 * 12) + i5 + 8;
            if (g10.D(i7) == 274 && (sD = g10.D(i7 + 2)) >= 1 && sD <= 12) {
                int i8 = i7 + 4;
                int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : -1;
                if (i9 >= 0 && (i2 = i9 + b[sD]) <= 4 && (i3 = i7 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                    return g10.D(i3);
                }
            }
        }
        return -1;
    }

    @Override // defpackage.H60
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        IL1.d(byteBuffer, "Argument must not be null");
        return f(new LF(byteBuffer));
    }

    @Override // defpackage.H60
    public final int b(ByteBuffer byteBuffer, C8426zm0 c8426zm0) {
        LF lf = new LF(byteBuffer);
        IL1.d(c8426zm0, "Argument must not be null");
        return e(lf, c8426zm0);
    }

    @Override // defpackage.H60
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return f(new OF(inputStream));
    }

    @Override // defpackage.H60
    public final int d(InputStream inputStream, C8426zm0 c8426zm0) {
        OF of = new OF(inputStream);
        IL1.d(c8426zm0, "Argument must not be null");
        return e(of, c8426zm0);
    }
}
