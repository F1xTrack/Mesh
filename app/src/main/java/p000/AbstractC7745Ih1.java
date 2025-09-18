package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: Ih1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7745Ih1 {

    /* renamed from: a */
    public static final C6809sD f5085a = new C6809sD(9);

    /* renamed from: b */
    public static final C6809sD f5086b = new C6809sD(10);

    /* renamed from: c */
    public static final C6809sD f5087c = new C6809sD(11);

    /* renamed from: d */
    public static final C6809sD f5088d = new C6809sD(12);

    /* renamed from: e */
    public static final float f5089e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: a */
    public static void m3972a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) f5085a.get();
        Path path2 = (Path) f5086b.get();
        Path path3 = (Path) f5087c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = AbstractC8778as0.m10351c(fMin, length);
                fMax = AbstractC8778as0.m10351c(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = AbstractC8778as0.m10351c(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = AbstractC8778as0.m10351c(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    /* renamed from: b */
    public static void m3973b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static float m3974c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: d */
    public static Bitmap m3975d(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
