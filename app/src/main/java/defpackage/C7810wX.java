package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: wX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7810wX extends Drawable implements Drawable.Callback, InterfaceC6110nc1, InterfaceC5919mc1, InterfaceC5293jL {
    public Drawable a;
    public final C5808m20 b = new C5808m20();
    public Drawable c;

    static {
        new Matrix();
    }

    public C7810wX(Drawable drawable) {
        this.a = drawable;
        AbstractC2432c02.f(drawable, this, this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void e(Matrix matrix) {
        t(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.a;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // defpackage.InterfaceC5293jL
    public final Drawable k(Drawable drawable) {
        return u(drawable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, nc1] */
    @Override // defpackage.InterfaceC6110nc1
    public final void m(RectF rectF) {
        ?? r0 = this.c;
        if (r0 != 0) {
            r0.m(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // defpackage.InterfaceC5293jL
    public final Drawable p() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5919mc1
    public final void r(InterfaceC6110nc1 interfaceC6110nc1) {
        this.c = (Drawable) interfaceC6110nc1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.a = i;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C5808m20 c5808m20 = this.b;
        c5808m20.e = colorFilter;
        c5808m20.b = colorFilter != null;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.b.c = z ? 1 : 0;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.b.d = z ? 1 : 0;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.a;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable, nc1] */
    public final void t(Matrix matrix) {
        ?? r0 = this.c;
        if (r0 != 0) {
            r0.e(matrix);
        } else {
            matrix.reset();
        }
    }

    public Drawable u(Drawable drawable) {
        Drawable drawable2 = this.a;
        AbstractC2432c02.f(drawable2, null, null);
        AbstractC2432c02.f(drawable, null, null);
        AbstractC2432c02.g(drawable, this.b);
        AbstractC2432c02.a(drawable, this);
        AbstractC2432c02.f(drawable, this, this);
        this.a = drawable;
        invalidateSelf();
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
