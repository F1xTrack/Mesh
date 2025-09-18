package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class JT0 extends C7081wX implements DT0 {

    /* renamed from: d */
    public final int f5528d;

    /* renamed from: e */
    public final RectF f5529e;

    /* renamed from: f */
    public final float[] f5530f;

    /* renamed from: g */
    public final float[] f5531g;

    /* renamed from: h */
    public final Paint f5532h;

    /* renamed from: i */
    public float f5533i;

    /* renamed from: j */
    public int f5534j;

    /* renamed from: k */
    public int f5535k;

    /* renamed from: l */
    public boolean f5536l;

    /* renamed from: m */
    public final Path f5537m;

    /* renamed from: n */
    public final Path f5538n;

    /* renamed from: o */
    public final RectF f5539o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JT0(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.f5528d = 1;
        this.f5529e = new RectF();
        this.f5530f = new float[8];
        this.f5531g = new float[8];
        this.f5532h = new Paint(1);
        this.f5533i = 0.0f;
        this.f5534j = 0;
        this.f5535k = 0;
        this.f5536l = false;
        this.f5537m = new Path();
        this.f5538n = new Path();
        this.f5539o = new RectF();
    }

    @Override // p000.DT0
    /* renamed from: a */
    public final void mo1695a() {
        m4328v();
        invalidateSelf();
    }

    @Override // p000.DT0
    /* renamed from: c */
    public final void mo1696c() {
        Arrays.fill(this.f5530f, 0.0f);
        m4328v();
        invalidateSelf();
    }

    @Override // p000.DT0
    /* renamed from: d */
    public final void mo1697d(float f, int i) {
        this.f5534j = i;
        this.f5533i = f;
        m4328v();
        invalidateSelf();
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f5529e.set(getBounds());
        int iM26247x = AbstractC7222ym.m26247x(this.f5528d);
        Path path = this.f5537m;
        Paint paint = this.f5532h;
        if (iM26247x == 0) {
            super.draw(canvas);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f5535k);
            paint.setStrokeWidth(0.0f);
            paint.setFilterBitmap(this.f5536l);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
        } else if (iM26247x == 1) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (this.f5534j != 0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.f5534j);
            paint.setStrokeWidth(this.f5533i);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f5538n, paint);
        }
    }

    @Override // p000.DT0
    /* renamed from: f */
    public final void mo1698f(boolean z) {
        if (this.f5536l != z) {
            this.f5536l = z;
            invalidateSelf();
        }
    }

    @Override // p000.DT0
    /* renamed from: i */
    public final void mo1699i() {
        m4328v();
        invalidateSelf();
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m4328v();
    }

    @Override // p000.DT0
    /* renamed from: q */
    public final void mo1701q() {
        m4328v();
        invalidateSelf();
    }

    @Override // p000.DT0
    /* renamed from: s */
    public final void mo1702s(float[] fArr) {
        float[] fArr2 = this.f5530f;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            ML1.m5335b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        m4328v();
        invalidateSelf();
    }

    /* renamed from: v */
    public final void m4328v() {
        Path path = this.f5537m;
        path.reset();
        Path path2 = this.f5538n;
        path2.reset();
        RectF rectF = this.f5539o;
        rectF.set(getBounds());
        rectF.inset(0.0f, 0.0f);
        if (this.f5528d == 1) {
            path.addRect(rectF, Path.Direction.CW);
        }
        Path.Direction direction = Path.Direction.CW;
        float[] fArr = this.f5530f;
        path.addRoundRect(rectF, fArr, direction);
        rectF.inset(-0.0f, -0.0f);
        float f = this.f5533i / 2.0f;
        rectF.inset(f, f);
        int i = 0;
        while (true) {
            float[] fArr2 = this.f5531g;
            if (i >= fArr2.length) {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                float f2 = (-this.f5533i) / 2.0f;
                rectF.inset(f2, f2);
                return;
            }
            fArr2[i] = (fArr[i] + 0.0f) - (this.f5533i / 2.0f);
            i++;
        }
    }

    @Override // p000.DT0
    /* renamed from: l */
    public final void mo1700l() {
    }
}
