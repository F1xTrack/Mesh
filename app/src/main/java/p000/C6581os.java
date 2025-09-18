package p000;

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

/* renamed from: os */
/* loaded from: classes.dex */
public final class C6581os extends Drawable implements Animatable {

    /* renamed from: g */
    public static final LinearInterpolator f39313g = new LinearInterpolator();

    /* renamed from: h */
    public static final C0092BS f39314h = new C0092BS(1);

    /* renamed from: i */
    public static final int[] f39315i = {-16777216};

    /* renamed from: a */
    public final C6516ns f39316a;

    /* renamed from: b */
    public float f39317b;

    /* renamed from: c */
    public final Resources f39318c;

    /* renamed from: d */
    public final ValueAnimator f39319d;

    /* renamed from: e */
    public float f39320e;

    /* renamed from: f */
    public boolean f39321f;

    public C6581os(Context context) {
        context.getClass();
        this.f39318c = context.getResources();
        C6516ns c6516ns = new C6516ns();
        this.f39316a = c6516ns;
        c6516ns.f38573i = f39315i;
        c6516ns.m23242a(0);
        c6516ns.f38572h = 2.5f;
        c6516ns.f38566b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C6390ls(this, c6516ns));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f39313g);
        valueAnimatorOfFloat.addListener(new C6453ms(this, c6516ns));
        this.f39319d = valueAnimatorOfFloat;
    }

    /* renamed from: d */
    public static void m23571d(float f, C6516ns c6516ns) {
        if (f <= 0.75f) {
            c6516ns.f38585u = c6516ns.f38573i[c6516ns.f38574j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = c6516ns.f38573i;
        int i = c6516ns.f38574j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        c6516ns.f38585u = ((((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - r1) * f2))) << 24) | ((((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - r3) * f2))) << 16) | ((((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - r4) * f2))) << 8) | ((i2 & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) (f2 * ((i3 & KotlinVersion.MAX_COMPONENT_VALUE) - r2))));
    }

    /* renamed from: a */
    public final void m23572a(float f, C6516ns c6516ns, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f39321f) {
            m23571d(f, c6516ns);
            float fFloor = (float) (Math.floor(c6516ns.f38577m / 0.8f) + 1.0d);
            float f2 = c6516ns.f38575k;
            float f3 = c6516ns.f38576l;
            c6516ns.f38569e = (((f3 - 0.01f) - f2) * f) + f2;
            c6516ns.f38570f = f3;
            float f4 = c6516ns.f38577m;
            c6516ns.f38571g = AbstractC1374Vq.m8585d(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = c6516ns.f38577m;
            C0092BS c0092bs = f39314h;
            if (f < 0.5f) {
                interpolation = c6516ns.f38575k;
                interpolation2 = (c0092bs.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = c6516ns.f38575k + 0.79f;
                interpolation = f6 - (((1.0f - c0092bs.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f39320e) * 216.0f;
            c6516ns.f38569e = interpolation;
            c6516ns.f38570f = interpolation2;
            c6516ns.f38571g = f7;
            this.f39317b = f8;
        }
    }

    /* renamed from: b */
    public final void m23573b(float f, float f2, float f3, float f4) {
        float f5 = this.f39318c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        C6516ns c6516ns = this.f39316a;
        c6516ns.f38572h = f6;
        c6516ns.f38566b.setStrokeWidth(f6);
        c6516ns.f38581q = f * f5;
        c6516ns.m23242a(0);
        c6516ns.f38582r = (int) (f3 * f5);
        c6516ns.f38583s = (int) (f4 * f5);
    }

    /* renamed from: c */
    public final void m23574c(int i) {
        if (i == 0) {
            m23573b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m23573b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f39317b, bounds.exactCenterX(), bounds.exactCenterY());
        C6516ns c6516ns = this.f39316a;
        RectF rectF = c6516ns.f38565a;
        float f = c6516ns.f38581q;
        float fMin = (c6516ns.f38572h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((c6516ns.f38582r * c6516ns.f38580p) / 2.0f, c6516ns.f38572h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = c6516ns.f38569e;
        float f3 = c6516ns.f38571g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((c6516ns.f38570f + f3) * 360.0f) - f4;
        Paint paint = c6516ns.f38566b;
        paint.setColor(c6516ns.f38585u);
        paint.setAlpha(c6516ns.f38584t);
        float f6 = c6516ns.f38572h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c6516ns.f38568d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        if (c6516ns.f38578n) {
            Path path = c6516ns.f38579o;
            if (path == null) {
                Path path2 = new Path();
                c6516ns.f38579o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (c6516ns.f38582r * c6516ns.f38580p) / 2.0f;
            c6516ns.f38579o.moveTo(0.0f, 0.0f);
            c6516ns.f38579o.lineTo(c6516ns.f38582r * c6516ns.f38580p, 0.0f);
            Path path3 = c6516ns.f38579o;
            float f9 = c6516ns.f38582r;
            float f10 = c6516ns.f38580p;
            path3.lineTo((f9 * f10) / 2.0f, c6516ns.f38583s * f10);
            c6516ns.f38579o.offset((rectF.centerX() + fMin2) - f8, (c6516ns.f38572h / 2.0f) + rectF.centerY());
            c6516ns.f38579o.close();
            Paint paint2 = c6516ns.f38567c;
            paint2.setColor(c6516ns.f38585u);
            paint2.setAlpha(c6516ns.f38584t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c6516ns.f38579o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f39316a.f38584t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f39319d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f39316a.f38584t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f39316a.f38566b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f39319d.cancel();
        C6516ns c6516ns = this.f39316a;
        float f = c6516ns.f38569e;
        c6516ns.f38575k = f;
        float f2 = c6516ns.f38570f;
        c6516ns.f38576l = f2;
        c6516ns.f38577m = c6516ns.f38571g;
        if (f2 != f) {
            this.f39321f = true;
            this.f39319d.setDuration(666L);
            this.f39319d.start();
            return;
        }
        c6516ns.m23242a(0);
        c6516ns.f38575k = 0.0f;
        c6516ns.f38576l = 0.0f;
        c6516ns.f38577m = 0.0f;
        c6516ns.f38569e = 0.0f;
        c6516ns.f38570f = 0.0f;
        c6516ns.f38571g = 0.0f;
        this.f39319d.setDuration(1332L);
        this.f39319d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f39319d.cancel();
        this.f39317b = 0.0f;
        C6516ns c6516ns = this.f39316a;
        if (c6516ns.f38578n) {
            c6516ns.f38578n = false;
        }
        c6516ns.m23242a(0);
        c6516ns.f38575k = 0.0f;
        c6516ns.f38576l = 0.0f;
        c6516ns.f38577m = 0.0f;
        c6516ns.f38569e = 0.0f;
        c6516ns.f38570f = 0.0f;
        c6516ns.f38571g = 0.0f;
        invalidateSelf();
    }
}
