package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

/* renamed from: tc1 */
/* loaded from: classes.dex */
public abstract class AbstractC11184tc1 {

    /* renamed from: a */
    public static final RectF f43173a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static Matrix m24947a(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f43173a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* renamed from: b */
    public static boolean m24948b(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    /* renamed from: c */
    public static boolean m24949c(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Invalid rotation degrees: "));
    }

    /* renamed from: d */
    public static boolean m24950d(Size size, boolean z, Size size2) {
        float width;
        float width2;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    /* renamed from: e */
    public static Size m24951e(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    /* renamed from: f */
    public static String m24952f(Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    /* renamed from: g */
    public static Size m24953g(Size size, int i) {
        AbstractC9104dM1.m17545d("Invalid rotation degrees: " + i, i % 90 == 0);
        return m24949c(m24954h(i)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    /* renamed from: h */
    public static int m24954h(int i) {
        return ((i % 360) + 360) % 360;
    }
}
