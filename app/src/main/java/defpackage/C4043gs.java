package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* renamed from: gs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4043gs extends AbstractC6317oi {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC0660If0.a);

    @Override // defpackage.InterfaceC0660If0
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.AbstractC6317oi
    public final Bitmap c(InterfaceC5935mi interfaceC5935mi, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapO;
        Paint paint = AbstractC7827wc1.a;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        int i3 = Build.VERSION.SDK_INT;
        Bitmap.Config config = (i3 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
        if (config.equals(bitmap.getConfig())) {
            bitmapO = bitmap;
        } else {
            bitmapO = interfaceC5935mi.o(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(bitmapO).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapO2 = interfaceC5935mi.o(iMin, iMin, (i3 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16);
        bitmapO2.setHasAlpha(true);
        Lock lock = AbstractC7827wc1.d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapO2);
            canvas.drawCircle(f2, f2, f2, AbstractC7827wc1.b);
            canvas.drawBitmap(bitmapO, (Rect) null, rectF, AbstractC7827wc1.c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapO.equals(bitmap)) {
                interfaceC5935mi.i(bitmapO);
            }
            return bitmapO2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC0660If0
    public final boolean equals(Object obj) {
        return obj instanceof C4043gs;
    }

    @Override // defpackage.InterfaceC0660If0
    public final int hashCode() {
        return 1101716364;
    }
}
