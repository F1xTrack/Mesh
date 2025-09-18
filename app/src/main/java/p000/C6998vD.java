package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: vD */
/* loaded from: classes.dex */
public final class C6998vD extends Drawable {

    /* renamed from: e */
    public InterfaceC11297uV0 f44257e;

    /* renamed from: f */
    public HashMap f44258f;

    /* renamed from: n */
    public int f44266n;

    /* renamed from: o */
    public int f44267o;

    /* renamed from: p */
    public int f44268p;

    /* renamed from: q */
    public int f44269q;

    /* renamed from: r */
    public int f44270r;

    /* renamed from: s */
    public long f44271s;

    /* renamed from: i */
    public final int f44261i = 80;

    /* renamed from: j */
    public final Paint f44262j = new Paint(1);

    /* renamed from: k */
    public final Matrix f44263k = new Matrix();

    /* renamed from: l */
    public final Rect f44264l = new Rect();

    /* renamed from: m */
    public final RectF f44265m = new RectF();

    /* renamed from: b */
    public int f44254b = -1;

    /* renamed from: c */
    public int f44255c = -1;

    /* renamed from: d */
    public int f44256d = -1;

    /* renamed from: g */
    public int f44259g = -1;

    /* renamed from: h */
    public int f44260h = -1;

    /* renamed from: a */
    public String f44253a = LocalNotification.Importance.NONE;

    public C6998vD() {
        this.f44258f = new HashMap();
        this.f44258f = new HashMap();
        invalidateSelf();
        this.f44271s = -1L;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void m25372a(Canvas canvas, String str, String str2, int i) {
        String strM26232i = AbstractC7222ym.m26232i(str, ": ");
        Paint paint = this.f44262j;
        float fMeasureText = paint.measureText(strM26232i);
        float fMeasureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i2 = this.f44269q;
        int i3 = this.f44270r;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + fMeasureText + fMeasureText2 + 4.0f, i3 + this.f44268p + 8, paint);
        paint.setColor(-1);
        canvas.drawText(strM26232i, this.f44269q, this.f44270r, paint);
        paint.setColor(i);
        canvas.drawText(str2, this.f44269q + fMeasureText, this.f44270r, paint);
        this.f44270r += this.f44268p;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Paint paint = this.f44262j;
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
        this.f44269q = this.f44266n;
        this.f44270r = this.f44267o;
        m25372a(canvas, "ID", this.f44253a, -1);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        Locale locale = Locale.US;
        m25372a(canvas, "D", iWidth + "x" + iHeight, -1);
        if (bounds.height() > 0) {
            m25372a(canvas, "DAR", String.valueOf(Float.valueOf(bounds.width() / bounds.height())), -1);
        }
        int i = this.f44254b;
        int i2 = this.f44255c;
        InterfaceC11297uV0 interfaceC11297uV0 = this.f44257e;
        int iWidth2 = getBounds().width();
        int iHeight2 = getBounds().height();
        int i3 = -65536;
        if (iWidth2 > 0 && iHeight2 > 0 && i > 0 && i2 > 0) {
            if (interfaceC11297uV0 != null) {
                Rect rect = this.f44264l;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth2;
                rect.bottom = iHeight2;
                Matrix matrix = this.f44263k;
                matrix.reset();
                ((AbstractC10522oR1) interfaceC11297uV0).m23403b(matrix, this.f44264l, i, i2, 0.0f, 0.0f);
                RectF rectF = this.f44265m;
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
        m25372a(canvas, "I", this.f44254b + "x" + this.f44255c, i3);
        int i4 = this.f44255c;
        if (i4 > 0) {
            m25372a(canvas, "IAR", String.valueOf(Float.valueOf(this.f44254b / i4)), -1);
        }
        m25372a(canvas, "I", (this.f44256d / 1024) + " KiB", -1);
        int i5 = this.f44259g;
        if (i5 > 0) {
            m25372a(canvas, "anim", AbstractC7222ym.m26229f(i5, "f ", this.f44260h, ", l "), -1);
        }
        InterfaceC11297uV0 interfaceC11297uV02 = this.f44257e;
        if (interfaceC11297uV02 != null) {
            m25372a(canvas, "scale", String.valueOf(interfaceC11297uV02), -1);
        }
        long j = this.f44271s;
        if (j >= 0) {
            m25372a(canvas, "t", j + " ms", -1);
        }
        for (Map.Entry entry : this.f44258f.entrySet()) {
            m25372a(canvas, (String) entry.getKey(), (String) entry.getValue(), -1);
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
        this.f44262j.setTextSize(iMin);
        int i = iMin + 8;
        this.f44268p = i;
        int i2 = this.f44261i;
        if (i2 == 80) {
            this.f44268p = i * (-1);
        }
        this.f44266n = rect.left + 10;
        this.f44267o = i2 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
