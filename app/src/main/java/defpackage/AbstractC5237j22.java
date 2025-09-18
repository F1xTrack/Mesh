package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: j22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5237j22 {
    public static Bitmap a(InterfaceC3903g70 interfaceC3903g70) {
        int iJ0 = interfaceC3903g70.j0();
        if (iJ0 == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC3903g70.getWidth(), interfaceC3903g70.getHeight(), Bitmap.Config.ARGB_8888);
            interfaceC3903g70.u()[0].C().rewind();
            ImageProcessingUtil.f(interfaceC3903g70.u()[0].C(), interfaceC3903g70.u()[0].H(), bitmapCreateBitmap);
            return bitmapCreateBitmap;
        }
        if (iJ0 == 35) {
            return ImageProcessingUtil.c(interfaceC3903g70);
        }
        if (iJ0 != 256 && iJ0 != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC3903g70.j0() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!b(interfaceC3903g70.j0())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC3903g70.j0());
        }
        ByteBuffer byteBufferC = interfaceC3903g70.u()[0].C();
        int iCapacity = byteBufferC.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferC.rewind();
        byteBufferC.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static boolean b(int i) {
        return i == 256 || i == 4101;
    }

    public static byte[] c(InterfaceC3903g70 interfaceC3903g70, Rect rect, int i, int i2) {
        if (interfaceC3903g70.j0() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC3903g70.j0());
        }
        G10 g10 = interfaceC3903g70.u()[0];
        G10 g102 = interfaceC3903g70.u()[1];
        G10 g103 = interfaceC3903g70.u()[2];
        ByteBuffer byteBufferC = g10.C();
        ByteBuffer byteBufferC2 = g102.C();
        ByteBuffer byteBufferC3 = g103.C();
        byteBufferC.rewind();
        byteBufferC2.rewind();
        byteBufferC3.rewind();
        int iRemaining = byteBufferC.remaining();
        byte[] bArr = new byte[((interfaceC3903g70.getHeight() * interfaceC3903g70.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i3 = 0; i3 < interfaceC3903g70.getHeight(); i3++) {
            byteBufferC.get(bArr, width, interfaceC3903g70.getWidth());
            width += interfaceC3903g70.getWidth();
            byteBufferC.position(Math.min(iRemaining, g10.H() + (byteBufferC.position() - interfaceC3903g70.getWidth())));
        }
        int height = interfaceC3903g70.getHeight() / 2;
        int width2 = interfaceC3903g70.getWidth() / 2;
        int iH = g103.H();
        int iH2 = g102.H();
        int iF = g103.F();
        int iF2 = g102.F();
        byte[] bArr2 = new byte[iH];
        byte[] bArr3 = new byte[iH2];
        for (int i4 = 0; i4 < height; i4++) {
            byteBufferC3.get(bArr2, 0, Math.min(iH, byteBufferC3.remaining()));
            byteBufferC2.get(bArr3, 0, Math.min(iH2, byteBufferC2.remaining()));
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < width2; i7++) {
                int i8 = width + 1;
                bArr[width] = bArr2[i5];
                width += 2;
                bArr[i8] = bArr3[i6];
                i5 += iF;
                i6 += iF2;
            }
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, interfaceC3903g70.getWidth(), interfaceC3903g70.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DQ[] dqArr = C6454pQ.c;
        C6263oQ c6263oQ = new C6263oQ(ByteOrder.BIG_ENDIAN);
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = c6263oQ.a;
        c6263oQ.c(arrayList, "Orientation", strValueOf);
        c6263oQ.c(arrayList, "XResolution", "72/1");
        c6263oQ.c(arrayList, "YResolution", "72/1");
        c6263oQ.c(arrayList, "ResolutionUnit", String.valueOf(2));
        c6263oQ.c(arrayList, "YCbCrPositioning", String.valueOf(1));
        c6263oQ.c(arrayList, "Make", Build.MANUFACTURER);
        c6263oQ.c(arrayList, "Model", Build.MODEL);
        if (interfaceC3903g70.P() != null) {
            interfaceC3903g70.P().a(c6263oQ);
        }
        c6263oQ.g(i2);
        c6263oQ.c(arrayList, "ImageWidth", String.valueOf(interfaceC3903g70.getWidth()));
        c6263oQ.c(arrayList, "ImageLength", String.valueOf(interfaceC3903g70.getHeight()));
        ArrayList list = Collections.list(new C6072nQ(c6263oQ));
        if (!((Map) list.get(1)).isEmpty()) {
            c6263oQ.b("ExposureProgram", String.valueOf(0), list);
            c6263oQ.b("ExifVersion", "0230", list);
            c6263oQ.b("ComponentsConfiguration", C6454pQ.f, list);
            c6263oQ.b("MeteringMode", String.valueOf(0), list);
            c6263oQ.b("LightSource", String.valueOf(0), list);
            c6263oQ.b("FlashpixVersion", "0100", list);
            c6263oQ.b("FocalPlaneResolutionUnit", String.valueOf(2), list);
            c6263oQ.b("FileSource", String.valueOf(3), list);
            c6263oQ.b("SceneType", String.valueOf(1), list);
            c6263oQ.b("CustomRendered", String.valueOf(0), list);
            c6263oQ.b("SceneCaptureType", String.valueOf(0), list);
            c6263oQ.b("Contrast", String.valueOf(0), list);
            c6263oQ.b("Saturation", String.valueOf(0), list);
            c6263oQ.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            c6263oQ.b("GPSVersionID", "2300", list);
            c6263oQ.b("GPSSpeedRef", "K", list);
            c6263oQ.b("GPSTrackRef", "T", list);
            c6263oQ.b("GPSImgDirectionRef", "T", list);
            c6263oQ.b("GPSDestBearingRef", "T", list);
            c6263oQ.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, interfaceC3903g70.getWidth(), interfaceC3903g70.getHeight()) : rect, i, new CQ(byteArrayOutputStream, new C6454pQ(c6263oQ.b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new C8113y70("YuvImage failed to encode jpeg.");
    }

    public static int d(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static boolean e(AbstractC7436uZ0 abstractC7436uZ0, Collection collection) {
        collection.getClass();
        if (collection instanceof QE1) {
            collection = ((QE1) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= abstractC7436uZ0.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= abstractC7436uZ0.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = abstractC7436uZ0.iterator();
        collection.getClass();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }
}
