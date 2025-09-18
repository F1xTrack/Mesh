package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: oX */
/* loaded from: classes.dex */
public abstract class AbstractC6558oX extends AbstractC8474Wi0 {

    /* renamed from: p */
    public Drawable f39067p;

    /* renamed from: q */
    public final Rect f39068q;

    /* renamed from: r */
    public final Rect f39069r;

    /* renamed from: s */
    public int f39070s;

    /* renamed from: t */
    public final boolean f39071t;

    /* renamed from: u */
    public boolean f39072u;

    public AbstractC6558oX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f39068q = new Rect();
        this.f39069r = new Rect();
        this.f39070s = 119;
        this.f39071t = true;
        this.f39072u = false;
        int[] iArr = NG0.f7696j;
        DJ1.m1624a(context, attributeSet, 0, 0);
        DJ1.m1625b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f39070s = typedArrayObtainStyledAttributes.getInt(1, this.f39070s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f39071t = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f39067p;
        if (drawable != null) {
            if (this.f39072u) {
                this.f39072u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f39071t;
                Rect rect = this.f39068q;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f39070s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f39069r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f39067p;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f39067p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f39067p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f39067p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f39070s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f39067p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p000.AbstractC8474Wi0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f39072u = z | this.f39072u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f39072u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f39067p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f39067p);
            }
            this.f39067p = drawable;
            this.f39072u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f39070s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f39070s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f39070s = i;
            if (i == 119 && this.f39067p != null) {
                this.f39067p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f39067p;
    }
}
