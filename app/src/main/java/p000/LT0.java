package p000;

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
public abstract class LT0 extends Drawable implements DT0, InterfaceC10288mc1 {

    /* renamed from: a */
    public final Drawable f6637a;

    /* renamed from: b */
    public boolean f6638b = false;

    /* renamed from: c */
    public float f6639c = 0.0f;

    /* renamed from: d */
    public final Path f6640d = new Path();

    /* renamed from: e */
    public boolean f6641e = true;

    /* renamed from: f */
    public int f6642f = 0;

    /* renamed from: g */
    public final Path f6643g = new Path();

    /* renamed from: h */
    public final float[] f6644h = new float[8];

    /* renamed from: i */
    public final float[] f6645i = new float[8];

    /* renamed from: j */
    public final RectF f6646j = new RectF();

    /* renamed from: k */
    public final RectF f6647k = new RectF();

    /* renamed from: l */
    public final RectF f6648l = new RectF();

    /* renamed from: m */
    public final RectF f6649m = new RectF();

    /* renamed from: n */
    public final Matrix f6650n = new Matrix();

    /* renamed from: o */
    public final Matrix f6651o = new Matrix();

    /* renamed from: p */
    public final Matrix f6652p = new Matrix();

    /* renamed from: q */
    public final Matrix f6653q = new Matrix();

    /* renamed from: r */
    public final Matrix f6654r = new Matrix();

    /* renamed from: s */
    public final Matrix f6655s = new Matrix();

    /* renamed from: t */
    public boolean f6656t = false;

    /* renamed from: u */
    public boolean f6657u = true;

    /* renamed from: v */
    public Drawable f6658v;

    public LT0(Drawable drawable) {
        this.f6637a = drawable;
    }

    /* renamed from: b */
    public final void m5004b() {
        if (!this.f6657u) {
            return;
        }
        Path path = this.f6643g;
        path.reset();
        RectF rectF = this.f6646j;
        float f = this.f6639c / 2.0f;
        rectF.inset(f, f);
        int i = 0;
        while (true) {
            float[] fArr = this.f6645i;
            int length = fArr.length;
            float[] fArr2 = this.f6644h;
            if (i >= length) {
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                float f2 = (-this.f6639c) / 2.0f;
                rectF.inset(f2, f2);
                Path path2 = this.f6640d;
                path2.reset();
                rectF.inset(0.0f, 0.0f);
                path2.addRoundRect(rectF, fArr2, direction);
                rectF.inset(-0.0f, -0.0f);
                path2.setFillType(Path.FillType.WINDING);
                this.f6657u = false;
                return;
            }
            fArr[i] = (fArr2[i] + 0.0f) - (this.f6639c / 2.0f);
            i++;
        }
    }

    @Override // p000.DT0
    /* renamed from: c */
    public final void mo1696c() {
        Arrays.fill(this.f6644h, 0.0f);
        this.f6638b = false;
        this.f6657u = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.f6637a.clearColorFilter();
    }

    @Override // p000.DT0
    /* renamed from: d */
    public final void mo1697d(float f, int i) {
        if (this.f6642f == i && this.f6639c == f) {
            return;
        }
        this.f6642f = i;
        this.f6639c = f;
        this.f6657u = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC4250iZ.m19063b();
        this.f6637a.draw(canvas);
        AbstractC4250iZ.m19063b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, nc1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable, nc1] */
    /* renamed from: e */
    public void mo2306e() {
        ?? r0 = this.f6658v;
        Matrix matrix = this.f6652p;
        RectF rectF = this.f6646j;
        if (r0 != 0) {
            r0.mo8644e(matrix);
            this.f6658v.mo23154m(rectF);
        } else {
            matrix.reset();
            rectF.set(getBounds());
        }
        RectF rectF2 = this.f6648l;
        Drawable drawable = this.f6637a;
        rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF3 = this.f6649m;
        rectF3.set(drawable.getBounds());
        Matrix matrix2 = this.f6650n;
        matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
        Matrix matrix3 = this.f6653q;
        boolean zEquals = matrix.equals(matrix3);
        Matrix matrix4 = this.f6651o;
        if (!zEquals || !matrix2.equals(matrix4)) {
            this.f6641e = true;
            matrix.invert(this.f6654r);
            Matrix matrix5 = this.f6655s;
            matrix5.set(matrix);
            matrix5.preConcat(matrix2);
            matrix3.set(matrix);
            matrix4.set(matrix2);
        }
        RectF rectF4 = this.f6647k;
        if (rectF.equals(rectF4)) {
            return;
        }
        this.f6657u = true;
        rectF4.set(rectF);
    }

    @Override // p000.DT0
    /* renamed from: f */
    public final void mo1698f(boolean z) {
        if (this.f6656t != z) {
            this.f6656t = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f6637a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f6637a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f6637a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f6637a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f6637a.getOpacity();
    }

    @Override // p000.DT0
    /* renamed from: i */
    public final void mo1699i() {
        this.f6657u = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f6637a.setBounds(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC10288mc1
    /* renamed from: r */
    public final void mo5005r(InterfaceC10416nc1 interfaceC10416nc1) {
        this.f6658v = (Drawable) interfaceC10416nc1;
    }

    @Override // p000.DT0
    /* renamed from: s */
    public final void mo1702s(float[] fArr) {
        float[] fArr2 = this.f6644h;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.f6638b = false;
        } else {
            ML1.m5335b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.f6638b = false;
            for (int i = 0; i < 8; i++) {
                this.f6638b |= fArr[i] > 0.0f;
            }
        }
        this.f6657u = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f6637a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f6637a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6637a.setColorFilter(colorFilter);
    }

    @Override // p000.DT0
    /* renamed from: a */
    public final void mo1695a() {
    }

    /* renamed from: l */
    public void mo1700l() {
    }

    @Override // p000.DT0
    /* renamed from: q */
    public final void mo1701q() {
    }
}
