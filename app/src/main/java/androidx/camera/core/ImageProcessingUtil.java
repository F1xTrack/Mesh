package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;
import p000.AbstractC7806Jm0;
import p000.AbstractC9104dM1;
import p000.C10607p60;
import p000.C9201e70;
import p000.InterfaceC9457g70;
import p000.InterfaceC9841j70;
import p000.MU0;

/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* renamed from: a */
    public static int f15955a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* renamed from: a */
    public static void m9887a(InterfaceC9457g70 interfaceC9457g70) {
        if (!m9893g(interfaceC9457g70)) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
            return;
        }
        int width = interfaceC9457g70.getWidth();
        int height = interfaceC9457g70.getHeight();
        int iM2891H = interfaceC9457g70.mo18406u()[0].m2891H();
        int iM2891H2 = interfaceC9457g70.mo18406u()[1].m2891H();
        int iM2891H3 = interfaceC9457g70.mo18406u()[2].m2891H();
        int iM2889F = interfaceC9457g70.mo18406u()[0].m2889F();
        int iM2889F2 = interfaceC9457g70.mo18406u()[1].m2889F();
        if (nativeShiftPixel(interfaceC9457g70.mo18406u()[0].m2886C(), iM2891H, interfaceC9457g70.mo18406u()[1].m2886C(), iM2891H2, interfaceC9457g70.mo18406u()[2].m2886C(), iM2891H3, iM2889F, iM2889F2, width, height, iM2889F, iM2889F2, iM2889F2) != 0) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
        }
    }

    /* renamed from: b */
    public static InterfaceC9457g70 m9888b(MU0 mu0, byte[] bArr) {
        AbstractC9104dM1.m17546e(mu0.mo4039c() == 256);
        bArr.getClass();
        Surface surfaceMo4044h = mu0.mo4044h();
        surfaceMo4044h.getClass();
        if (nativeWriteJpegToSurface(bArr, surfaceMo4044h) != 0) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
            return null;
        }
        InterfaceC9457g70 interfaceC9457g70Mo4037a = mu0.mo4037a();
        if (interfaceC9457g70Mo4037a == null) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
        }
        return interfaceC9457g70Mo4037a;
    }

    /* renamed from: c */
    public static Bitmap m9889c(InterfaceC9457g70 interfaceC9457g70) {
        if (interfaceC9457g70.mo18405j0() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = interfaceC9457g70.getWidth();
        int height = interfaceC9457g70.getHeight();
        int iM2891H = interfaceC9457g70.mo18406u()[0].m2891H();
        int iM2891H2 = interfaceC9457g70.mo18406u()[1].m2891H();
        int iM2891H3 = interfaceC9457g70.mo18406u()[2].m2891H();
        int iM2889F = interfaceC9457g70.mo18406u()[0].m2889F();
        int iM2889F2 = interfaceC9457g70.mo18406u()[1].m2889F();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC9457g70.getWidth(), interfaceC9457g70.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(interfaceC9457g70.mo18406u()[0].m2886C(), iM2891H, interfaceC9457g70.mo18406u()[1].m2886C(), iM2891H2, interfaceC9457g70.mo18406u()[2].m2886C(), iM2891H3, iM2889F, iM2889F2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    /* renamed from: d */
    public static C10607p60 m9890d(InterfaceC9457g70 interfaceC9457g70, InterfaceC9841j70 interfaceC9841j70, ByteBuffer byteBuffer, int i, boolean z) {
        if (!m9893g(interfaceC9457g70)) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
            return null;
        }
        System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
            return null;
        }
        Surface surfaceMo4044h = interfaceC9841j70.mo4044h();
        int width = interfaceC9457g70.getWidth();
        int height = interfaceC9457g70.getHeight();
        int iM2891H = interfaceC9457g70.mo18406u()[0].m2891H();
        int iM2891H2 = interfaceC9457g70.mo18406u()[1].m2891H();
        int iM2891H3 = interfaceC9457g70.mo18406u()[2].m2891H();
        int iM2889F = interfaceC9457g70.mo18406u()[0].m2889F();
        int iM2889F2 = interfaceC9457g70.mo18406u()[1].m2889F();
        if (nativeConvertAndroid420ToABGR(interfaceC9457g70.mo18406u()[0].m2886C(), iM2891H, interfaceC9457g70.mo18406u()[1].m2886C(), iM2891H2, interfaceC9457g70.mo18406u()[2].m2886C(), iM2891H3, iM2889F, iM2889F2, surfaceMo4044h, byteBuffer, width, height, z ? iM2889F : 0, z ? iM2889F2 : 0, z ? iM2889F2 : 0, i) != 0) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
            f15955a++;
        }
        InterfaceC9457g70 interfaceC9457g70Mo4037a = interfaceC9841j70.mo4037a();
        if (interfaceC9457g70Mo4037a == null) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
            return null;
        }
        C10607p60 c10607p60 = new C10607p60(interfaceC9457g70Mo4037a);
        c10607p60.m26161a(new C9201e70(interfaceC9457g70Mo4037a, interfaceC9457g70, 0));
        return c10607p60;
    }

    /* renamed from: e */
    public static void m9891e(ByteBuffer byteBuffer, int i, Bitmap bitmap) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    /* renamed from: f */
    public static void m9892f(ByteBuffer byteBuffer, int i, Bitmap bitmap) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    /* renamed from: g */
    public static boolean m9893g(InterfaceC9457g70 interfaceC9457g70) {
        return interfaceC9457g70.mo18405j0() == 35 && interfaceC9457g70.mo18406u().length == 3;
    }

    /* renamed from: h */
    public static C10607p60 m9894h(InterfaceC9457g70 interfaceC9457g70, InterfaceC9841j70 interfaceC9841j70, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (!m9893g(interfaceC9457g70)) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
            return null;
        }
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
            return null;
        }
        if (i > 0) {
            int width = interfaceC9457g70.getWidth();
            int height = interfaceC9457g70.getHeight();
            int iM2891H = interfaceC9457g70.mo18406u()[0].m2891H();
            int iM2891H2 = interfaceC9457g70.mo18406u()[1].m2891H();
            int iM2891H3 = interfaceC9457g70.mo18406u()[2].m2891H();
            int iM2889F = interfaceC9457g70.mo18406u()[1].m2889F();
            Image imageDequeueInputImage = imageWriter.dequeueInputImage();
            if (imageDequeueInputImage != null && nativeRotateYUV(interfaceC9457g70.mo18406u()[0].m2886C(), iM2891H, interfaceC9457g70.mo18406u()[1].m2886C(), iM2891H2, interfaceC9457g70.mo18406u()[2].m2886C(), iM2891H3, iM2889F, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) == 0) {
                imageWriter.queueInputImage(imageDequeueInputImage);
                InterfaceC9457g70 interfaceC9457g70Mo4037a = interfaceC9841j70.mo4037a();
                if (interfaceC9457g70Mo4037a == null) {
                    AbstractC7806Jm0.m4412f("ImageProcessingUtil");
                    return null;
                }
                C10607p60 c10607p60 = new C10607p60(interfaceC9457g70Mo4037a);
                c10607p60.m26161a(new C9201e70(interfaceC9457g70Mo4037a, interfaceC9457g70, 1));
                return c10607p60;
            }
        }
        AbstractC7806Jm0.m4412f("ImageProcessingUtil");
        return null;
    }

    /* renamed from: i */
    public static void m9895i(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            AbstractC7806Jm0.m4412f("ImageProcessingUtil");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
