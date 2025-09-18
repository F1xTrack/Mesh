package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: Ih1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0667Ih1 {
    public static final C6987sD a = new C6987sD(9);
    public static final C6987sD b = new C6987sD(10);
    public static final C6987sD c = new C6987sD(11);
    public static final C6987sD d = new C6987sD(12);
    public static final float e = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = (PathMeasure) a.get();
        Path path2 = (Path) b.get();
        Path path3 = (Path) c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = AbstractC2215as0.c(fMin, length);
                fMax = AbstractC2215as0.c(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = AbstractC2215as0.c(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = AbstractC2215as0.c(fMax, length);
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

    public static void b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }
}
