package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class LT0 extends Drawable implements DT0, InterfaceC5919mc1 {
    public final Drawable a;
    public boolean b = false;
    public float c = 0.0f;
    public final Path d = new Path();
    public boolean e = true;
    public int f = 0;
    public final Path g = new Path();
    public final float[] h = new float[8];
    public final float[] i = new float[8];
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final RectF l = new RectF();
    public final RectF m = new RectF();
    public final Matrix n = new Matrix();
    public final Matrix o = new Matrix();
    public final Matrix p = new Matrix();
    public final Matrix q = new Matrix();
    public final Matrix r = new Matrix();
    public final Matrix s = new Matrix();
    public boolean t = false;
    public boolean u = true;
    public Drawable v;

    public LT0(Drawable drawable) {
        this.a = drawable;
    }

    public final void b() {
        if (!this.u) {
            return;
        }
        Path path = this.g;
        path.reset();
        RectF rectF = this.j;
        float f = this.c / 2.0f;
        rectF.inset(f, f);
        int i = 0;
        while (true) {
            float[] fArr = this.i;
            int length = fArr.length;
            float[] fArr2 = this.h;
            if (i >= length) {
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                float f2 = (-this.c) / 2.0f;
                rectF.inset(f2, f2);
                Path path2 = this.d;
                path2.reset();
                rectF.inset(0.0f, 0.0f);
                path2.addRoundRect(rectF, fArr2, direction);
                rectF.inset(-0.0f, -0.0f);
                path2.setFillType(Path.FillType.WINDING);
                this.u = false;
                return;
            }
            fArr[i] = (fArr2[i] + 0.0f) - (this.c / 2.0f);
            i++;
        }
    }

    @Override // defpackage.DT0
    public final void c() {
        Arrays.fill(this.h, 0.0f);
        this.b = false;
        this.u = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.a.clearColorFilter();
    }

    @Override // defpackage.DT0
    public final void d(float f, int i) {
        if (this.f == i && this.c == f) {
            return;
        }
        this.f = i;
        this.c = f;
        this.u = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC4368iZ.b();
        this.a.draw(canvas);
        AbstractC4368iZ.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, nc1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable, nc1] */
    public void e() {
        ?? r0 = this.v;
        Matrix matrix = this.p;
        RectF rectF = this.j;
        if (r0 != 0) {
            r0.e(matrix);
            this.v.m(rectF);
        } else {
            matrix.reset();
            rectF.set(getBounds());
        }
        RectF rectF2 = this.l;
        Drawable drawable = this.a;
        rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF3 = this.m;
        rectF3.set(drawable.getBounds());
        Matrix matrix2 = this.n;
        matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
        Matrix matrix3 = this.q;
        boolean zEquals = matrix.equals(matrix3);
        Matrix matrix4 = this.o;
        if (!zEquals || !matrix2.equals(matrix4)) {
            this.e = true;
            matrix.invert(this.r);
            Matrix matrix5 = this.s;
            matrix5.set(matrix);
            matrix5.preConcat(matrix2);
            matrix3.set(matrix);
            matrix4.set(matrix2);
        }
        RectF rectF4 = this.k;
        if (rectF.equals(rectF4)) {
            return;
        }
        this.u = true;
        rectF4.set(rectF);
    }

    @Override // defpackage.DT0
    public final void f(boolean z) {
        if (this.t != z) {
            this.t = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    @Override // defpackage.DT0
    public final void i() {
        this.u = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5919mc1
    public final void r(InterfaceC6110nc1 interfaceC6110nc1) {
        this.v = (Drawable) interfaceC6110nc1;
    }

    @Override // defpackage.DT0
    public final void s(float[] fArr) {
        float[] fArr2 = this.h;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.b = false;
        } else {
            ML1.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.b = false;
            for (int i = 0; i < 8; i++) {
                this.b |= fArr[i] > 0.0f;
            }
        }
        this.u = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override // defpackage.DT0
    public final void a() {
    }

    public void l() {
    }

    @Override // defpackage.DT0
    public final void q() {
    }
}
