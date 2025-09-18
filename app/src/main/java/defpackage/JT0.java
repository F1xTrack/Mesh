package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class JT0 extends C7810wX implements DT0 {
    public final int d;
    public final RectF e;
    public final float[] f;
    public final float[] g;
    public final Paint h;
    public float i;
    public int j;
    public int k;
    public boolean l;
    public final Path m;
    public final Path n;
    public final RectF o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JT0(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.d = 1;
        this.e = new RectF();
        this.f = new float[8];
        this.g = new float[8];
        this.h = new Paint(1);
        this.i = 0.0f;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.m = new Path();
        this.n = new Path();
        this.o = new RectF();
    }

    @Override // defpackage.DT0
    public final void a() {
        v();
        invalidateSelf();
    }

    @Override // defpackage.DT0
    public final void c() {
        Arrays.fill(this.f, 0.0f);
        v();
        invalidateSelf();
    }

    @Override // defpackage.DT0
    public final void d(float f, int i) {
        this.j = i;
        this.i = f;
        v();
        invalidateSelf();
    }

    @Override // defpackage.C7810wX, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.e.set(getBounds());
        int iX = AbstractC8235ym.x(this.d);
        Path path = this.m;
        Paint paint = this.h;
        if (iX == 0) {
            super.draw(canvas);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.k);
            paint.setStrokeWidth(0.0f);
            paint.setFilterBitmap(this.l);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
        } else if (iX == 1) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (this.j != 0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.j);
            paint.setStrokeWidth(this.i);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.n, paint);
        }
    }

    @Override // defpackage.DT0
    public final void f(boolean z) {
        if (this.l != z) {
            this.l = z;
            invalidateSelf();
        }
    }

    @Override // defpackage.DT0
    public final void i() {
        v();
        invalidateSelf();
    }

    @Override // defpackage.C7810wX, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        v();
    }

    @Override // defpackage.DT0
    public final void q() {
        v();
        invalidateSelf();
    }

    @Override // defpackage.DT0
    public final void s(float[] fArr) {
        float[] fArr2 = this.f;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            ML1.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        v();
        invalidateSelf();
    }

    public final void v() {
        Path path = this.m;
        path.reset();
        Path path2 = this.n;
        path2.reset();
        RectF rectF = this.o;
        rectF.set(getBounds());
        rectF.inset(0.0f, 0.0f);
        if (this.d == 1) {
            path.addRect(rectF, Path.Direction.CW);
        }
        Path.Direction direction = Path.Direction.CW;
        float[] fArr = this.f;
        path.addRoundRect(rectF, fArr, direction);
        rectF.inset(-0.0f, -0.0f);
        float f = this.i / 2.0f;
        rectF.inset(f, f);
        int i = 0;
        while (true) {
            float[] fArr2 = this.g;
            if (i >= fArr2.length) {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                float f2 = (-this.i) / 2.0f;
                rectF.inset(f2, f2);
                return;
            }
            fArr2[i] = (fArr[i] + 0.0f) - (this.i / 2.0f);
            i++;
        }
    }

    @Override // defpackage.DT0
    public final void l() {
    }
}
