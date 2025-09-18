package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* renamed from: gs */
/* loaded from: classes.dex */
public final class C4143gs extends AbstractC6569oi {

    /* renamed from: b */
    public static final byte[] f28069b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC7740If0.f5069a);

    @Override // p000.InterfaceC7740If0
    /* renamed from: a */
    public final void mo967a(MessageDigest messageDigest) {
        messageDigest.update(f28069b);
    }

    @Override // p000.AbstractC6569oi
    /* renamed from: c */
    public final Bitmap mo3881c(InterfaceC6443mi interfaceC6443mi, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapMo320o;
        Paint paint = AbstractC11567wc1.f44995a;
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
            bitmapMo320o = bitmap;
        } else {
            bitmapMo320o = interfaceC6443mi.mo320o(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(bitmapMo320o).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapMo320o2 = interfaceC6443mi.mo320o(iMin, iMin, (i3 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16);
        bitmapMo320o2.setHasAlpha(true);
        Lock lock = AbstractC11567wc1.f44998d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo320o2);
            canvas.drawCircle(f2, f2, f2, AbstractC11567wc1.f44996b);
            canvas.drawBitmap(bitmapMo320o, (Rect) null, rectF, AbstractC11567wc1.f44997c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapMo320o.equals(bitmap)) {
                interfaceC6443mi.mo319i(bitmapMo320o);
            }
            return bitmapMo320o2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // p000.InterfaceC7740If0
    public final boolean equals(Object obj) {
        return obj instanceof C4143gs;
    }

    @Override // p000.InterfaceC7740If0
    public final int hashCode() {
        return 1101716364;
    }
}
