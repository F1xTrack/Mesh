package defpackage;

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
    public volatile Bitmap a;
    public volatile GQ0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public E80(Bitmap bitmap) {
        this.a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.c = bitmap.getWidth();
        this.d = bitmap.getHeight();
        c(0);
        this.e = 0;
        this.f = -1;
    }

    public static E80 a(Image image, int i) {
        E80 e80;
        int iLimit;
        C5898mV1 c5898mV1E;
        E80 e802;
        long j;
        Bitmap bitmapCreateBitmap;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        c(i);
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
            c5898mV1E = DV1.e(new RU1());
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        EnumC2132aQ1 enumC2132aQ1 = EnumC2132aQ1.INPUT_IMAGE_CONSTRUCTION;
        c5898mV1E.getClass();
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap map = c5898mV1E.i;
        if (map.get(enumC2132aQ1) != null) {
            e802 = e80;
            j = jElapsedRealtime2;
            if (jElapsedRealtime3 - ((Long) map.get(enumC2132aQ1)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            }
            return e802;
        }
        e802 = e80;
        j = jElapsedRealtime2;
        map.put(enumC2132aQ1, Long.valueOf(jElapsedRealtime3));
        C1252Pv c1252Pv = new C1252Pv();
        c1252Pv.c = format != -1 ? format != 35 ? format != 842094169 ? format != 16 ? format != 17 ? EnumC7216tP1.UNKNOWN_FORMAT : EnumC7216tP1.NV21 : EnumC7216tP1.NV16 : EnumC7216tP1.YV12 : EnumC7216tP1.YUV_420_888 : EnumC7216tP1.BITMAP;
        c1252Pv.b = HP1.ANDROID_MEDIA_IMAGE;
        c1252Pv.d = Integer.valueOf(iLimit & Integer.MAX_VALUE);
        c1252Pv.f = Integer.valueOf(height2 & Integer.MAX_VALUE);
        c1252Pv.e = Integer.valueOf(width2 & Integer.MAX_VALUE);
        c1252Pv.a = Long.valueOf(j & Long.MAX_VALUE);
        c1252Pv.g = Integer.valueOf(i & Integer.MAX_VALUE);
        KP1 kp1 = new KP1(c1252Pv);
        C2407bs1 c2407bs1 = new C2407bs1();
        c2407bs1.c = kp1;
        C1632Ur1 c1632Ur1 = new C1632Ur1(c2407bs1);
        C3892g32 c3892g32 = c5898mV1E.e;
        MM1.a.execute(new RunnableC1492Sx(c5898mV1E, c1632Ur1, c3892g32.k() ? (String) c3892g32.i() : LibraryVersion.getInstance().getVersion(c5898mV1E.g)));
        return e802;
    }

    public static void c(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
    }

    public final Image.Plane[] b() {
        if (this.b == null) {
            return null;
        }
        return ((Image) this.b.b).getPlanes();
    }

    public E80(Image image, int i, int i2, int i3) {
        Preconditions.checkNotNull(image);
        this.b = new GQ0(11, image);
        this.c = i;
        this.d = i2;
        c(i3);
        this.e = i3;
        this.f = 35;
    }
}
