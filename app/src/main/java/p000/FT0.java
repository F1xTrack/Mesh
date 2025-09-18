package p000;

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

    /* renamed from: i */
    public final int f3270i;

    /* renamed from: a */
    public final float[] f3262a = new float[8];

    /* renamed from: b */
    public final float[] f3263b = new float[8];

    /* renamed from: c */
    public final Paint f3264c = new Paint(1);

    /* renamed from: d */
    public float f3265d = 0.0f;

    /* renamed from: e */
    public int f3266e = 0;

    /* renamed from: f */
    public boolean f3267f = false;

    /* renamed from: g */
    public final Path f3268g = new Path();

    /* renamed from: h */
    public final Path f3269h = new Path();

    /* renamed from: j */
    public final RectF f3271j = new RectF();

    /* renamed from: k */
    public int f3272k = KotlinVersion.MAX_COMPONENT_VALUE;

    public FT0(int i) {
        this.f3270i = 0;
        if (this.f3270i != i) {
            this.f3270i = i;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public final void m2666b() {
        Path path = this.f3268g;
        path.reset();
        Path path2 = this.f3269h;
        path2.reset();
        RectF rectF = this.f3271j;
        rectF.set(getBounds());
        float f = this.f3265d / 2.0f;
        rectF.inset(f, f);
        int i = 0;
        while (true) {
            float[] fArr = this.f3263b;
            int length = fArr.length;
            float[] fArr2 = this.f3262a;
            if (i >= length) {
                Path.Direction direction = Path.Direction.CW;
                path2.addRoundRect(rectF, fArr, direction);
                float f2 = (-this.f3265d) / 2.0f;
                rectF.inset(f2, f2);
                rectF.inset(0.0f, 0.0f);
                path.addRoundRect(rectF, fArr2, direction);
                rectF.inset(-0.0f, -0.0f);
                return;
            }
            fArr[i] = (fArr2[i] + 0.0f) - (this.f3265d / 2.0f);
            i++;
        }
    }

    @Override // p000.DT0
    /* renamed from: c */
    public final void mo1696c() {
        Arrays.fill(this.f3262a, 0.0f);
        m2666b();
        invalidateSelf();
    }

    @Override // p000.DT0
    /* renamed from: d */
    public final void mo1697d(float f, int i) {
        if (this.f3266e != i) {
            this.f3266e = i;
            invalidateSelf();
        }
        if (this.f3265d != f) {
            this.f3265d = f;
            m2666b();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f3264c;
        paint.setColor(AbstractC8924c02.m10556d(this.f3270i, this.f3272k));
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(this.f3267f);
        canvas.drawPath(this.f3268g, paint);
        if (this.f3265d != 0.0f) {
            paint.setColor(AbstractC8924c02.m10556d(this.f3266e, this.f3272k));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f3265d);
            canvas.drawPath(this.f3269h, paint);
        }
    }

    @Override // p000.DT0
    /* renamed from: f */
    public final void mo1698f(boolean z) {
        if (this.f3267f != z) {
            this.f3267f = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3272k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iM10556d = AbstractC8924c02.m10556d(this.f3270i, this.f3272k) >>> 24;
        if (iM10556d == 255) {
            return -1;
        }
        return iM10556d == 0 ? -2 : -3;
    }

    @Override // p000.DT0
    /* renamed from: i */
    public final void mo1699i() {
        m2666b();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2666b();
    }

    @Override // p000.DT0
    /* renamed from: s */
    public final void mo1702s(float[] fArr) {
        float[] fArr2 = this.f3262a;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            ML1.m5335b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        m2666b();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.f3272k) {
            this.f3272k = i;
            invalidateSelf();
        }
    }

    @Override // p000.DT0
    /* renamed from: a */
    public final void mo1695a() {
    }

    @Override // p000.DT0
    /* renamed from: l */
    public final void mo1700l() {
    }

    @Override // p000.DT0
    /* renamed from: q */
    public final void mo1701q() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
