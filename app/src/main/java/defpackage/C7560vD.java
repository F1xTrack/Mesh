package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.huawei.hms.rn.push.constants.LocalNotification;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: vD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7560vD extends Drawable {
    public InterfaceC7424uV0 e;
    public HashMap f;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public long s;
    public final int i = 80;
    public final Paint j = new Paint(1);
    public final Matrix k = new Matrix();
    public final Rect l = new Rect();
    public final RectF m = new RectF();
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public int g = -1;
    public int h = -1;
    public String a = LocalNotification.Importance.NONE;

    public C7560vD() {
        this.f = new HashMap();
        this.f = new HashMap();
        invalidateSelf();
        this.s = -1L;
        invalidateSelf();
    }

    public final void a(Canvas canvas, String str, String str2, int i) {
        String strI = AbstractC8235ym.i(str, ": ");
        Paint paint = this.j;
        float fMeasureText = paint.measureText(strI);
        float fMeasureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i2 = this.q;
        int i3 = this.r;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + fMeasureText + fMeasureText2 + 4.0f, i3 + this.p + 8, paint);
        paint.setColor(-1);
        canvas.drawText(strI, this.q, this.r, paint);
        paint.setColor(i);
        canvas.drawText(str2, this.q + fMeasureText, this.r, paint);
        this.r += this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Paint paint = this.j;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(0);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        paint.setStyle(style);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-1);
        this.q = this.n;
        this.r = this.o;
        a(canvas, "ID", this.a, -1);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        Locale locale = Locale.US;
        a(canvas, "D", iWidth + "x" + iHeight, -1);
        if (bounds.height() > 0) {
            a(canvas, "DAR", String.valueOf(Float.valueOf(bounds.width() / bounds.height())), -1);
        }
        int i = this.b;
        int i2 = this.c;
        InterfaceC7424uV0 interfaceC7424uV0 = this.e;
        int iWidth2 = getBounds().width();
        int iHeight2 = getBounds().height();
        int i3 = -65536;
        if (iWidth2 > 0 && iHeight2 > 0 && i > 0 && i2 > 0) {
            if (interfaceC7424uV0 != null) {
                Rect rect = this.l;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth2;
                rect.bottom = iHeight2;
                Matrix matrix = this.k;
                matrix.reset();
                ((AbstractC6268oR1) interfaceC7424uV0).b(matrix, this.l, i, i2, 0.0f, 0.0f);
                RectF rectF = this.m;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i;
                rectF.bottom = i2;
                matrix.mapRect(rectF);
                int iWidth3 = (int) rectF.width();
                int iHeight3 = (int) rectF.height();
                iWidth2 = Math.min(iWidth2, iWidth3);
                iHeight2 = Math.min(iHeight2, iHeight3);
            }
            float f = iWidth2;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = iHeight2;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int iAbs = Math.abs(i - iWidth2);
            int iAbs2 = Math.abs(i2 - iHeight2);
            float f7 = iAbs;
            if (f7 < f2 && iAbs2 < f5) {
                i3 = -16711936;
            } else if (f7 < f3 && iAbs2 < f6) {
                i3 = -256;
            }
        }
        a(canvas, "I", this.b + "x" + this.c, i3);
        int i4 = this.c;
        if (i4 > 0) {
            a(canvas, "IAR", String.valueOf(Float.valueOf(this.b / i4)), -1);
        }
        a(canvas, "I", (this.d / 1024) + " KiB", -1);
        int i5 = this.g;
        if (i5 > 0) {
            a(canvas, "anim", AbstractC8235ym.f(i5, "f ", this.h, ", l "), -1);
        }
        InterfaceC7424uV0 interfaceC7424uV02 = this.e;
        if (interfaceC7424uV02 != null) {
            a(canvas, "scale", String.valueOf(interfaceC7424uV02), -1);
        }
        long j = this.s;
        if (j >= 0) {
            a(canvas, "t", j + " ms", -1);
        }
        for (Map.Entry entry : this.f.entrySet()) {
            a(canvas, (String) entry.getKey(), (String) entry.getValue(), -1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.j.setTextSize(iMin);
        int i = iMin + 8;
        this.p = i;
        int i2 = this.i;
        if (i2 == 80) {
            this.p = i * (-1);
        }
        this.n = rect.left + 10;
        this.o = i2 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
