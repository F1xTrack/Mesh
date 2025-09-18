package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class FT0 extends Drawable implements DT0 {
    public final int i;
    public final float[] a = new float[8];
    public final float[] b = new float[8];
    public final Paint c = new Paint(1);
    public float d = 0.0f;
    public int e = 0;
    public boolean f = false;
    public final Path g = new Path();
    public final Path h = new Path();
    public final RectF j = new RectF();
    public int k = KotlinVersion.MAX_COMPONENT_VALUE;

    public FT0(int i) {
        this.i = 0;
        if (this.i != i) {
            this.i = i;
            invalidateSelf();
        }
    }

    public final void b() {
        Path path = this.g;
        path.reset();
        Path path2 = this.h;
        path2.reset();
        RectF rectF = this.j;
        rectF.set(getBounds());
        float f = this.d / 2.0f;
        rectF.inset(f, f);
        int i = 0;
        while (true) {
            float[] fArr = this.b;
            int length = fArr.length;
            float[] fArr2 = this.a;
            if (i >= length) {
                Path.Direction direction = Path.Direction.CW;
                path2.addRoundRect(rectF, fArr, direction);
                float f2 = (-this.d) / 2.0f;
                rectF.inset(f2, f2);
                rectF.inset(0.0f, 0.0f);
                path.addRoundRect(rectF, fArr2, direction);
                rectF.inset(-0.0f, -0.0f);
                return;
            }
            fArr[i] = (fArr2[i] + 0.0f) - (this.d / 2.0f);
            i++;
        }
    }

    @Override // defpackage.DT0
    public final void c() {
        Arrays.fill(this.a, 0.0f);
        b();
        invalidateSelf();
    }

    @Override // defpackage.DT0
    public final void d(float f, int i) {
        if (this.e != i) {
            this.e = i;
            invalidateSelf();
        }
        if (this.d != f) {
            this.d = f;
            b();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.c;
        paint.setColor(AbstractC2432c02.d(this.i, this.k));
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(this.f);
        canvas.drawPath(this.g, paint);
        if (this.d != 0.0f) {
            paint.setColor(AbstractC2432c02.d(this.e, this.k));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.d);
            canvas.drawPath(this.h, paint);
        }
    }

    @Override // defpackage.DT0
    public final void f(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iD = AbstractC2432c02.d(this.i, this.k) >>> 24;
        if (iD == 255) {
            return -1;
        }
        return iD == 0 ? -2 : -3;
    }

    @Override // defpackage.DT0
    public final void i() {
        b();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b();
    }

    @Override // defpackage.DT0
    public final void s(float[] fArr) {
        float[] fArr2 = this.a;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            ML1.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        b();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.k) {
            this.k = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.DT0
    public final void a() {
    }

    @Override // defpackage.DT0
    public final void l() {
    }

    @Override // defpackage.DT0
    public final void q() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
