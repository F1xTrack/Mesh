package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.common.internal.Preconditions;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class E80 {

    /* renamed from: a */
    public volatile Bitmap f2503a;

    /* renamed from: b */
    public volatile GQ0 f2504b;

    /* renamed from: c */
    public final int f2505c;

    /* renamed from: d */
    public final int f2506d;

    /* renamed from: e */
    public final int f2507e;

    /* renamed from: f */
    public final int f2508f;

    public E80(Bitmap bitmap) {
        this.f2503a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f2505c = bitmap.getWidth();
        this.f2506d = bitmap.getHeight();
        m2054c(0);
        this.f2507e = 0;
        this.f2508f = -1;
    }

    /* renamed from: a */
    public static E80 m2053a(Image image, int i) {
        E80 e80;
        int iLimit;
        C10274mV1 c10274mV1M1720e;
        E80 e802;
        long j;
        Bitmap bitmapCreateBitmap;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        m2054c(i);
        Preconditions.checkArgument(image.getFormat() == 256 || image.getFormat() == 35, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            Preconditions.checkArgument(image.getFormat() == 256, "Only JPEG is supported now");
            Image.Plane[] planes2 = image.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            if (i == 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height, matrix, true);
            }
            e80 = new E80(bitmapCreateBitmap);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            e80 = new E80(image, image.getWidth(), image.getHeight(), i);
            iLimit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int format = image.getFormat();
        int height2 = image.getHeight();
        int width2 = image.getWidth();
        synchronized (DV1.class) {
            byte b = (byte) (((byte) 1) | 2);
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            c10274mV1M1720e = DV1.m1720e(new RU1());
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        EnumC8723aQ1 enumC8723aQ1 = EnumC8723aQ1.INPUT_IMAGE_CONSTRUCTION;
        c10274mV1M1720e.getClass();
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap map = c10274mV1M1720e.f37742i;
        if (map.get(enumC8723aQ1) != null) {
            e802 = e80;
            j = jElapsedRealtime2;
            if (jElapsedRealtime3 - ((Long) map.get(enumC8723aQ1)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            }
            return e802;
        }
        e802 = e80;
        j = jElapsedRealtime2;
        map.put(enumC8723aQ1, Long.valueOf(jElapsedRealtime3));
        C1002Pv c1002Pv = new C1002Pv();
        c1002Pv.f9353c = format != -1 ? format != 35 ? format != 842094169 ? format != 16 ? format != 17 ? EnumC11158tP1.UNKNOWN_FORMAT : EnumC11158tP1.NV21 : EnumC11158tP1.NV16 : EnumC11158tP1.YV12 : EnumC11158tP1.YUV_420_888 : EnumC11158tP1.BITMAP;
        c1002Pv.f9352b = HP1.ANDROID_MEDIA_IMAGE;
        c1002Pv.f9354d = Integer.valueOf(iLimit & Integer.MAX_VALUE);
        c1002Pv.f9356f = Integer.valueOf(height2 & Integer.MAX_VALUE);
        c1002Pv.f9355e = Integer.valueOf(width2 & Integer.MAX_VALUE);
        c1002Pv.f9351a = Long.valueOf(j & Long.MAX_VALUE);
        c1002Pv.f9357g = Integer.valueOf(i & Integer.MAX_VALUE);
        KP1 kp1 = new KP1(c1002Pv);
        C8907bs1 c8907bs1 = new C8907bs1();
        c8907bs1.f17204c = kp1;
        C8389Ur1 c8389Ur1 = new C8389Ur1(c8907bs1);
        C9450g32 c9450g32 = c10274mV1M1720e.f37738e;
        MM1.f7115a.execute(new RunnableC1192Sx(c10274mV1M1720e, c8389Ur1, c9450g32.mo11144k() ? (String) c9450g32.mo11142i() : LibraryVersion.getInstance().getVersion(c10274mV1M1720e.f37740g)));
        return e802;
    }

    /* renamed from: c */
    public static void m2054c(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
    }

    /* renamed from: b */
    public final Image.Plane[] m2055b() {
        if (this.f2504b == null) {
            return null;
        }
        return ((Image) this.f2504b.f3735b).getPlanes();
    }

    public E80(Image image, int i, int i2, int i3) {
        Preconditions.checkNotNull(image);
        this.f2504b = new GQ0(11, image);
        this.f2505c = i;
        this.f2506d = i2;
        m2054c(i3);
        this.f2507e = i3;
        this.f2508f = 35;
    }
}
