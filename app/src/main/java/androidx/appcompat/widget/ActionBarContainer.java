package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import p000.AbstractC8704aH0;
import p000.C1760b2;
import p000.PW0;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f15781a;

    /* renamed from: b */
    public View f15782b;

    /* renamed from: c */
    public View f15783c;

    /* renamed from: d */
    public Drawable f15784d;

    /* renamed from: e */
    public Drawable f15785e;

    /* renamed from: f */
    public Drawable f15786f;

    /* renamed from: g */
    public final boolean f15787g;

    /* renamed from: h */
    public boolean f15788h;

    /* renamed from: i */
    public final int f15789i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1760b2(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8704aH0.f15423a);
        boolean z = false;
        this.f15784d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f15785e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f15789i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f15787g = true;
            this.f15786f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f15787g ? !(this.f15784d != null || this.f15785e != null) : this.f15786f == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f15784d;
        if (drawable != null && drawable.isStateful()) {
            this.f15784d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f15785e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f15785e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f15786f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f15786f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15784d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f15785e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f15786f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f15782b = findViewById(R.id.action_bar);
        this.f15783c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f15781a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f15787g) {
            Drawable drawable = this.f15786f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f15784d == null) {
                z2 = false;
            } else if (this.f15782b.getVisibility() == 0) {
                this.f15784d.setBounds(this.f15782b.getLeft(), this.f15782b.getTop(), this.f15782b.getRight(), this.f15782b.getBottom());
            } else {
                View view = this.f15783c;
                if (view == null || view.getVisibility() != 0) {
                    this.f15784d.setBounds(0, 0, 0, 0);
                } else {
                    this.f15784d.setBounds(this.f15783c.getLeft(), this.f15783c.getTop(), this.f15783c.getRight(), this.f15783c.getBottom());
                }
            }
            this.f15788h = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f15782b == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f15789i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f15782b == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f15784d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f15784d);
        }
        this.f15784d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f15782b;
            if (view != null) {
                this.f15784d.setBounds(view.getLeft(), this.f15782b.getTop(), this.f15782b.getRight(), this.f15782b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f15787g ? !(this.f15784d != null || this.f15785e != null) : this.f15786f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f15786f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f15786f);
        }
        this.f15786f = drawable;
        boolean z = this.f15787g;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f15786f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f15784d != null || this.f15785e != null) : this.f15786f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f15785e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f15785e);
        }
        this.f15785e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f15788h && this.f15785e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f15787g ? !(this.f15784d != null || this.f15785e != null) : this.f15786f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f15781a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f15784d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f15785e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f15786f;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f15784d;
        boolean z = this.f15787g;
        return (drawable == drawable2 && !z) || (drawable == this.f15785e && this.f15788h) || ((drawable == this.f15786f && z) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(PW0 pw0) {
    }
}
