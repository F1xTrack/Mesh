package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: wX */
/* loaded from: classes.dex */
public class C7081wX extends Drawable implements Drawable.Callback, InterfaceC10416nc1, InterfaceC10288mc1, InterfaceC6231jL {

    /* renamed from: a */
    public Drawable f44934a;

    /* renamed from: b */
    public final C10213m20 f44935b = new C10213m20();

    /* renamed from: c */
    public Drawable f44936c;

    static {
        new Matrix();
    }

    public C7081wX(Drawable drawable) {
        this.f44934a = drawable;
        AbstractC8924c02.m10558f(drawable, this, this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f44934a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo8644e(Matrix matrix) {
        m25643t(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f44934a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f44934a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f44934a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f44934a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f44934a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f44934a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f44934a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // p000.InterfaceC6231jL
    /* renamed from: k */
    public final Drawable mo22023k(Drawable drawable) {
        return mo24392u(drawable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, nc1] */
    @Override // p000.InterfaceC10416nc1
    /* renamed from: m */
    public final void mo23154m(RectF rectF) {
        ?? r0 = this.f44936c;
        if (r0 != 0) {
            r0.mo23154m(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f44934a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f44934a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f44934a;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f44934a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // p000.InterfaceC6231jL
    /* renamed from: p */
    public final Drawable mo22024p() {
        return this.f44934a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC10288mc1
    /* renamed from: r */
    public final void mo5005r(InterfaceC10416nc1 interfaceC10416nc1) {
        this.f44936c = (Drawable) interfaceC10416nc1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f44935b.f37420a = i;
        Drawable drawable = this.f44934a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C10213m20 c10213m20 = this.f44935b;
        c10213m20.f37424e = colorFilter;
        c10213m20.f37421b = colorFilter != null;
        Drawable drawable = this.f44934a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f44935b.f37422c = z ? 1 : 0;
        Drawable drawable = this.f44934a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f44935b.f37423d = z ? 1 : 0;
        Drawable drawable = this.f44934a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f44934a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f44934a;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, nc1] */
    /* renamed from: t */
    public final void m25643t(Matrix matrix) {
        ?? r0 = this.f44936c;
        if (r0 != 0) {
            r0.mo8644e(matrix);
        } else {
            matrix.reset();
        }
    }

    /* renamed from: u */
    public Drawable mo24392u(Drawable drawable) {
        Drawable drawable2 = this.f44934a;
        AbstractC8924c02.m10558f(drawable2, null, null);
        AbstractC8924c02.m10558f(drawable, null, null);
        AbstractC8924c02.m10559g(drawable, this.f44935b);
        AbstractC8924c02.m10553a(drawable, this);
        AbstractC8924c02.m10558f(drawable, this, this);
        this.f44934a = drawable;
        invalidateSelf();
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
