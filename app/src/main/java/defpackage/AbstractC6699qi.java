package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: qi */
/* loaded from: classes.dex */
public abstract class AbstractC6699qi {
    public static final F71 a = LB.b(X2.j);

    public static final V60 a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        F71 f71 = a;
        ByteBuffer byteBufferAllocate = (ByteBuffer) ((C5649lC0) f71.getValue()).i();
        if (byteBufferAllocate == null) {
            C6987sD c6987sD = KD.a;
            byteBufferAllocate = ByteBuffer.allocate(16384);
            O90.e(byteBufferAllocate, "allocate(DecodeBufferHel…mendedDecodeBufferSize())");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferAllocate.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            V60 v60 = new V60(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
            ((C5649lC0) f71.getValue()).d(byteBufferAllocate);
            return v60;
        } catch (Throwable th) {
            ((C5649lC0) f71.getValue()).d(byteBufferAllocate);
            throw th;
        }
    }

    public static final int b(Bitmap.Config config) {
        switch (config == null ? -1 : AbstractC6508pi.a[config.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int c(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "width must be > 0, width is: ").toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i2, "height must be > 0, height is: ").toString());
        }
        int iB = b(config);
        int i3 = i * i2 * iB;
        if (i3 > 0) {
            return i3;
        }
        StringBuilder sbM = AbstractC1705Vq.m("size must be > 0: size: ", ", width: ", i3, i, ", height: ");
        sbM.append(i2);
        sbM.append(", pixelSize: ");
        sbM.append(iB);
        throw new IllegalStateException(sbM.toString().toString());
    }

    public static final int d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
