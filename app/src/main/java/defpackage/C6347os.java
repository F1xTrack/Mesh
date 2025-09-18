package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.KotlinVersion;

/* renamed from: os, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6347os extends Drawable implements Animatable {
    public static final LinearInterpolator g = new LinearInterpolator();
    public static final BS h = new BS(1);
    public static final int[] i = {-16777216};
    public final C6156ns a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public C6347os(Context context) {
        context.getClass();
        this.c = context.getResources();
        C6156ns c6156ns = new C6156ns();
        this.a = c6156ns;
        c6156ns.i = i;
        c6156ns.a(0);
        c6156ns.h = 2.5f;
        c6156ns.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C5774ls(this, c6156ns));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(g);
        valueAnimatorOfFloat.addListener(new C5965ms(this, c6156ns));
        this.d = valueAnimatorOfFloat;
    }

    public static void d(float f, C6156ns c6156ns) {
        if (f <= 0.75f) {
            c6156ns.u = c6156ns.i[c6156ns.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = c6156ns.i;
        int i2 = c6156ns.j;
        int i3 = iArr[i2];
        int i4 = iArr[(i2 + 1) % iArr.length];
        c6156ns.u = ((((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - r1) * f2))) << 24) | ((((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - r3) * f2))) << 16) | ((((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - r4) * f2))) << 8) | ((i3 & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) (f2 * ((i4 & KotlinVersion.MAX_COMPONENT_VALUE) - r2))));
    }

    public final void a(float f, C6156ns c6156ns, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f) {
            d(f, c6156ns);
            float fFloor = (float) (Math.floor(c6156ns.m / 0.8f) + 1.0d);
            float f2 = c6156ns.k;
            float f3 = c6156ns.l;
            c6156ns.e = (((f3 - 0.01f) - f2) * f) + f2;
            c6156ns.f = f3;
            float f4 = c6156ns.m;
            c6156ns.g = AbstractC1705Vq.d(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = c6156ns.m;
            BS bs = h;
            if (f < 0.5f) {
                interpolation = c6156ns.k;
                interpolation2 = (bs.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = c6156ns.k + 0.79f;
                interpolation = f6 - (((1.0f - bs.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.e) * 216.0f;
            c6156ns.e = interpolation;
            c6156ns.f = interpolation2;
            c6156ns.g = f7;
            this.b = f8;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        C6156ns c6156ns = this.a;
        c6156ns.h = f6;
        c6156ns.b.setStrokeWidth(f6);
        c6156ns.q = f * f5;
        c6156ns.a(0);
        c6156ns.r = (int) (f3 * f5);
        c6156ns.s = (int) (f4 * f5);
    }

    public final void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        C6156ns c6156ns = this.a;
        RectF rectF = c6156ns.a;
        float f = c6156ns.q;
        float fMin = (c6156ns.h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c6156ns.r * c6156ns.p) / 2.0f, c6156ns.h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = c6156ns.e;
        float f3 = c6156ns.g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c6156ns.f + f3) * 360.0f) - f4;
        Paint paint = c6156ns.b;
        paint.setColor(c6156ns.u);
        paint.setAlpha(c6156ns.t);
        float f6 = c6156ns.h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c6156ns.d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        if (c6156ns.n) {
            Path path = c6156ns.o;
            if (path == null) {
                Path path2 = new Path();
                c6156ns.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (c6156ns.r * c6156ns.p) / 2.0f;
            c6156ns.o.moveTo(0.0f, 0.0f);
            c6156ns.o.lineTo(c6156ns.r * c6156ns.p, 0.0f);
            Path path3 = c6156ns.o;
            float f9 = c6156ns.r;
            float f10 = c6156ns.p;
            path3.lineTo((f9 * f10) / 2.0f, c6156ns.s * f10);
            c6156ns.o.offset((rectF.centerX() + fMin2) - f8, (c6156ns.h / 2.0f) + rectF.centerY());
            c6156ns.o.close();
            Paint paint2 = c6156ns.c;
            paint2.setColor(c6156ns.u);
            paint2.setAlpha(c6156ns.t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c6156ns.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.a.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.d.cancel();
        C6156ns c6156ns = this.a;
        float f = c6156ns.e;
        c6156ns.k = f;
        float f2 = c6156ns.f;
        c6156ns.l = f2;
        c6156ns.m = c6156ns.g;
        if (f2 != f) {
            this.f = true;
            this.d.setDuration(666L);
            this.d.start();
            return;
        }
        c6156ns.a(0);
        c6156ns.k = 0.0f;
        c6156ns.l = 0.0f;
        c6156ns.m = 0.0f;
        c6156ns.e = 0.0f;
        c6156ns.f = 0.0f;
        c6156ns.g = 0.0f;
        this.d.setDuration(1332L);
        this.d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        C6156ns c6156ns = this.a;
        if (c6156ns.n) {
            c6156ns.n = false;
        }
        c6156ns.a(0);
        c6156ns.k = 0.0f;
        c6156ns.l = 0.0f;
        c6156ns.m = 0.0f;
        c6156ns.e = 0.0f;
        c6156ns.f = 0.0f;
        c6156ns.g = 0.0f;
        invalidateSelf();
    }
}
