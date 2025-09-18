package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* renamed from: PF */
/* loaded from: classes.dex */
public final class C0960PF implements H60 {

    /* renamed from: a */
    public static final byte[] f8943a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f8944b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: e */
    public static int m6279e(InterfaceC0834NF interfaceC0834NF, C11967zm0 c11967zm0) {
        int iMo4932a;
        short sMo4935d;
        try {
            int iMo4932a2 = interfaceC0834NF.mo4932a();
            if ((iMo4932a2 & 65496) != 65496 && iMo4932a2 != 19789 && iMo4932a2 != 18761) {
                return -1;
            }
            while (interfaceC0834NF.mo4935d() == 255 && (sMo4935d = interfaceC0834NF.mo4935d()) != 218 && sMo4935d != 217) {
                iMo4932a = interfaceC0834NF.mo4932a() - 2;
                if (sMo4935d == 225) {
                    break;
                }
                long j = iMo4932a;
                if (interfaceC0834NF.mo4934c(j) != j) {
                    break;
                }
            }
            iMo4932a = -1;
            if (iMo4932a == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) c11967zm0.m26542d(iMo4932a, byte[].class);
            try {
                return m6281g(interfaceC0834NF, bArr, iMo4932a);
            } finally {
                c11967zm0.m26546h(bArr);
            }
        } catch (C0771MF unused) {
            return -1;
        }
    }

    /* renamed from: f */
    public static ImageHeaderParser$ImageType m6280f(InterfaceC0834NF interfaceC0834NF) {
        try {
            int iMo4932a = interfaceC0834NF.mo4932a();
            if (iMo4932a == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo4935d = (iMo4932a << 8) | interfaceC0834NF.mo4935d();
            if (iMo4935d == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo4935d2 = (iMo4935d << 8) | interfaceC0834NF.mo4935d();
            if (iMo4935d2 == -1991225785) {
                interfaceC0834NF.mo4934c(21L);
                try {
                    return interfaceC0834NF.mo4935d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C0771MF unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo4935d2 == 1380533830) {
                interfaceC0834NF.mo4934c(4L);
                if (((interfaceC0834NF.mo4932a() << 16) | interfaceC0834NF.mo4932a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo4932a2 = (interfaceC0834NF.mo4932a() << 16) | interfaceC0834NF.mo4932a();
                if ((iMo4932a2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo4932a2 & KotlinVersion.MAX_COMPONENT_VALUE;
                if (i == 88) {
                    interfaceC0834NF.mo4934c(4L);
                    short sMo4935d = interfaceC0834NF.mo4935d();
                    return (sMo4935d & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sMo4935d & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC0834NF.mo4934c(4L);
                return (interfaceC0834NF.mo4935d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC0834NF.mo4932a() << 16) | interfaceC0834NF.mo4932a()) == 1718909296) {
                int iMo4932a3 = (interfaceC0834NF.mo4932a() << 16) | interfaceC0834NF.mo4932a();
                if (iMo4932a3 != 1635150182 && iMo4932a3 != 1635150195) {
                    interfaceC0834NF.mo4934c(4L);
                    int i2 = iMo4935d2 - 16;
                    if (i2 % 4 == 0) {
                        int i3 = 0;
                        while (i3 < 5 && i2 > 0) {
                            int iMo4932a4 = (interfaceC0834NF.mo4932a() << 16) | interfaceC0834NF.mo4932a();
                            if (iMo4932a4 != 1635150182 && iMo4932a4 != 1635150195) {
                                i3++;
                                i2 -= 4;
                            }
                        }
                    }
                }
                return ImageHeaderParser$ImageType.AVIF;
            }
            return ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C0771MF unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* renamed from: g */
    public static int m6281g(InterfaceC0834NF interfaceC0834NF, byte[] bArr, int i) {
        short sM2887D;
        int i2;
        int i3;
        if (interfaceC0834NF.mo4936f(i, bArr) != i) {
            return -1;
        }
        byte[] bArr2 = f8943a;
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
        short sM2887D2 = g10.m2887D(6);
        ByteOrder byteOrder = sM2887D2 != 18761 ? sM2887D2 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBuffer = (ByteBuffer) g10.f3531b;
        byteBuffer.order(byteOrder);
        int i5 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short sM2887D3 = g10.m2887D(i5 + 6);
        for (int i6 = 0; i6 < sM2887D3; i6++) {
            int i7 = (i6 * 12) + i5 + 8;
            if (g10.m2887D(i7) == 274 && (sM2887D = g10.m2887D(i7 + 2)) >= 1 && sM2887D <= 12) {
                int i8 = i7 + 4;
                int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : -1;
                if (i9 >= 0 && (i2 = i9 + f8944b[sM2887D]) <= 4 && (i3 = i7 + 8) >= 0 && i3 <= byteBuffer.remaining() && i2 >= 0 && i2 + i3 <= byteBuffer.remaining()) {
                    return g10.m2887D(i3);
                }
            }
        }
        return -1;
    }

    @Override // p000.H60
    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo3297a(ByteBuffer byteBuffer) {
        IL1.m3830d(byteBuffer, "Argument must not be null");
        return m6280f(new C0709LF(byteBuffer));
    }

    @Override // p000.H60
    /* renamed from: b */
    public final int mo3298b(ByteBuffer byteBuffer, C11967zm0 c11967zm0) {
        C0709LF c0709lf = new C0709LF(byteBuffer);
        IL1.m3830d(c11967zm0, "Argument must not be null");
        return m6279e(c0709lf, c11967zm0);
    }

    @Override // p000.H60
    /* renamed from: c */
    public final ImageHeaderParser$ImageType mo3299c(InputStream inputStream) {
        return m6280f(new C0897OF(inputStream));
    }

    @Override // p000.H60
    /* renamed from: d */
    public final int mo3300d(InputStream inputStream, C11967zm0 c11967zm0) {
        C0897OF c0897of = new C0897OF(inputStream);
        IL1.m3830d(c11967zm0, "Argument must not be null");
        return m6279e(c0897of, c11967zm0);
    }
}
