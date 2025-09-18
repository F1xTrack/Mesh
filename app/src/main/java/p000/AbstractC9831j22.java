package p000;

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
public abstract class AbstractC9831j22 {
    /* renamed from: a */
    public static Bitmap m21966a(InterfaceC9457g70 interfaceC9457g70) {
        int iMo18405j0 = interfaceC9457g70.mo18405j0();
        if (iMo18405j0 == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC9457g70.getWidth(), interfaceC9457g70.getHeight(), Bitmap.Config.ARGB_8888);
            interfaceC9457g70.mo18406u()[0].m2886C().rewind();
            ImageProcessingUtil.m9892f(interfaceC9457g70.mo18406u()[0].m2886C(), interfaceC9457g70.mo18406u()[0].m2891H(), bitmapCreateBitmap);
            return bitmapCreateBitmap;
        }
        if (iMo18405j0 == 35) {
            return ImageProcessingUtil.m9889c(interfaceC9457g70);
        }
        if (iMo18405j0 != 256 && iMo18405j0 != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC9457g70.mo18405j0() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!m21967b(interfaceC9457g70.mo18405j0())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC9457g70.mo18405j0());
        }
        ByteBuffer byteBufferM2886C = interfaceC9457g70.mo18406u()[0].m2886C();
        int iCapacity = byteBufferM2886C.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferM2886C.rewind();
        byteBufferM2886C.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    /* renamed from: b */
    public static boolean m21967b(int i) {
        return i == 256 || i == 4101;
    }

    /* renamed from: c */
    public static byte[] m21968c(InterfaceC9457g70 interfaceC9457g70, Rect rect, int i, int i2) {
        if (interfaceC9457g70.mo18405j0() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC9457g70.mo18405j0());
        }
        G10 g10 = interfaceC9457g70.mo18406u()[0];
        G10 g102 = interfaceC9457g70.mo18406u()[1];
        G10 g103 = interfaceC9457g70.mo18406u()[2];
        ByteBuffer byteBufferM2886C = g10.m2886C();
        ByteBuffer byteBufferM2886C2 = g102.m2886C();
        ByteBuffer byteBufferM2886C3 = g103.m2886C();
        byteBufferM2886C.rewind();
        byteBufferM2886C2.rewind();
        byteBufferM2886C3.rewind();
        int iRemaining = byteBufferM2886C.remaining();
        byte[] bArr = new byte[((interfaceC9457g70.getHeight() * interfaceC9457g70.getWidth()) / 2) + iRemaining];
        int width = 0;
        for (int i3 = 0; i3 < interfaceC9457g70.getHeight(); i3++) {
            byteBufferM2886C.get(bArr, width, interfaceC9457g70.getWidth());
            width += interfaceC9457g70.getWidth();
            byteBufferM2886C.position(Math.min(iRemaining, g10.m2891H() + (byteBufferM2886C.position() - interfaceC9457g70.getWidth())));
        }
        int height = interfaceC9457g70.getHeight() / 2;
        int width2 = interfaceC9457g70.getWidth() / 2;
        int iM2891H = g103.m2891H();
        int iM2891H2 = g102.m2891H();
        int iM2889F = g103.m2889F();
        int iM2889F2 = g102.m2889F();
        byte[] bArr2 = new byte[iM2891H];
        byte[] bArr3 = new byte[iM2891H2];
        for (int i4 = 0; i4 < height; i4++) {
            byteBufferM2886C3.get(bArr2, 0, Math.min(iM2891H, byteBufferM2886C3.remaining()));
            byteBufferM2886C2.get(bArr3, 0, Math.min(iM2891H2, byteBufferM2886C2.remaining()));
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < width2; i7++) {
                int i8 = width + 1;
                bArr[width] = bArr2[i5];
                width += 2;
                bArr[i8] = bArr3[i6];
                i5 += iM2889F;
                i6 += iM2889F2;
            }
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, interfaceC9457g70.getWidth(), interfaceC9457g70.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0216DQ[] c0216dqArr = C6616pQ.f40055c;
        C6551oQ c6551oQ = new C6551oQ(ByteOrder.BIG_ENDIAN);
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = c6551oQ.f38994a;
        c6551oQ.m23396c(arrayList, "Orientation", strValueOf);
        c6551oQ.m23396c(arrayList, "XResolution", "72/1");
        c6551oQ.m23396c(arrayList, "YResolution", "72/1");
        c6551oQ.m23396c(arrayList, "ResolutionUnit", String.valueOf(2));
        c6551oQ.m23396c(arrayList, "YCbCrPositioning", String.valueOf(1));
        c6551oQ.m23396c(arrayList, "Make", Build.MANUFACTURER);
        c6551oQ.m23396c(arrayList, "Model", Build.MODEL);
        if (interfaceC9457g70.mo18403P() != null) {
            interfaceC9457g70.mo18403P().mo4563a(c6551oQ);
        }
        c6551oQ.m23400g(i2);
        c6551oQ.m23396c(arrayList, "ImageWidth", String.valueOf(interfaceC9457g70.getWidth()));
        c6551oQ.m23396c(arrayList, "ImageLength", String.valueOf(interfaceC9457g70.getHeight()));
        ArrayList list = Collections.list(new C6488nQ(c6551oQ));
        if (!((Map) list.get(1)).isEmpty()) {
            c6551oQ.m23395b("ExposureProgram", String.valueOf(0), list);
            c6551oQ.m23395b("ExifVersion", "0230", list);
            c6551oQ.m23395b("ComponentsConfiguration", C6616pQ.f40058f, list);
            c6551oQ.m23395b("MeteringMode", String.valueOf(0), list);
            c6551oQ.m23395b("LightSource", String.valueOf(0), list);
            c6551oQ.m23395b("FlashpixVersion", "0100", list);
            c6551oQ.m23395b("FocalPlaneResolutionUnit", String.valueOf(2), list);
            c6551oQ.m23395b("FileSource", String.valueOf(3), list);
            c6551oQ.m23395b("SceneType", String.valueOf(1), list);
            c6551oQ.m23395b("CustomRendered", String.valueOf(0), list);
            c6551oQ.m23395b("SceneCaptureType", String.valueOf(0), list);
            c6551oQ.m23395b("Contrast", String.valueOf(0), list);
            c6551oQ.m23395b("Saturation", String.valueOf(0), list);
            c6551oQ.m23395b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            c6551oQ.m23395b("GPSVersionID", "2300", list);
            c6551oQ.m23395b("GPSSpeedRef", "K", list);
            c6551oQ.m23395b("GPSTrackRef", "T", list);
            c6551oQ.m23395b("GPSImgDirectionRef", "T", list);
            c6551oQ.m23395b("GPSDestBearingRef", "T", list);
            c6551oQ.m23395b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, interfaceC9457g70.getWidth(), interfaceC9457g70.getHeight()) : rect, i, new C0153CQ(byteArrayOutputStream, new C6616pQ(c6551oQ.f38995b, list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new C11758y70("YuvImage failed to encode jpeg.");
    }

    /* renamed from: d */
    public static int m21969d(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* renamed from: e */
    public static boolean m21970e(AbstractC11305uZ0 abstractC11305uZ0, Collection collection) {
        collection.getClass();
        if (collection instanceof QE1) {
            collection = ((QE1) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= abstractC11305uZ0.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= abstractC11305uZ0.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = abstractC11305uZ0.iterator();
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
