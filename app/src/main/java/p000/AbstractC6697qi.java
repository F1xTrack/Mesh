package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: qi */
/* loaded from: classes.dex */
public abstract class AbstractC6697qi {

    /* renamed from: a */
    public static final F71 f41109a = AbstractC0705LB.m4915b(C1450X2.f13506j);

    /* renamed from: a */
    public static final V60 m24048a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        F71 f71 = f41109a;
        ByteBuffer byteBufferAllocate = (ByteBuffer) ((C10107lC0) f71.getValue()).mo4581i();
        if (byteBufferAllocate == null) {
            C6809sD c6809sD = C0644KD.f5944a;
            byteBufferAllocate = ByteBuffer.allocate(16384);
            O90.m5967e(byteBufferAllocate, "allocate(DecodeBufferHel…mendedDecodeBufferSize())");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferAllocate.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            V60 v60 = new V60(options.outWidth, options.outHeight, Build.VERSION.SDK_INT >= 26 ? options.outColorSpace : null);
            ((C10107lC0) f71.getValue()).mo4580d(byteBufferAllocate);
            return v60;
        } catch (Throwable th) {
            ((C10107lC0) f71.getValue()).mo4580d(byteBufferAllocate);
            throw th;
        }
    }

    /* renamed from: b */
    public static final int m24049b(Bitmap.Config config) {
        switch (config == null ? -1 : AbstractC6634pi.f40286a[config.ordinal()]) {
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

    /* renamed from: c */
    public static final int m24050c(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "width must be > 0, width is: ").toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "height must be > 0, height is: ").toString());
        }
        int iM24049b = m24049b(config);
        int i3 = i * i2 * iM24049b;
        if (i3 > 0) {
            return i3;
        }
        StringBuilder sbM8594m = AbstractC1374Vq.m8594m("size must be > 0: size: ", ", width: ", i3, i, ", height: ");
        sbM8594m.append(i2);
        sbM8594m.append(", pixelSize: ");
        sbM8594m.append(iM24049b);
        throw new IllegalStateException(sbM8594m.toString().toString());
    }

    /* renamed from: d */
    public static final int m24051d(Bitmap bitmap) {
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
