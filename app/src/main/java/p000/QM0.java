package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* loaded from: classes.dex */
public final class QM0 extends AbstractC11378v71 {

    /* renamed from: T */
    public boolean f9597T;

    /* renamed from: U */
    public Integer f9598U;

    /* renamed from: V */
    public Integer f9599V;

    public QM0(Context context) {
        super(context);
        this.f9597T = true;
        this.f9598U = null;
        this.f9599V = null;
    }

    /* renamed from: e */
    public final void m6673e(boolean z) throws Resources.NotFoundException {
        if (isChecked() != z) {
            super.setChecked(z);
            Integer num = this.f9599V;
            if (num != null || this.f9598U != null) {
                if (!z) {
                    num = this.f9598U;
                }
                m6675g(num);
            }
        }
        this.f9597T = true;
    }

    /* renamed from: f */
    public final void m6674f(Integer num) {
        Drawable thumbDrawable = super.getThumbDrawable();
        if (num == null) {
            thumbDrawable.clearColorFilter();
        } else {
            thumbDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
        if (num == null || !(getBackground() instanceof RippleDrawable)) {
            return;
        }
        ((RippleDrawable) getBackground()).setColor(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}}, new int[]{num.intValue()}));
    }

    /* renamed from: g */
    public final void m6675g(Integer num) {
        Drawable trackDrawable = super.getTrackDrawable();
        if (num == null) {
            trackDrawable.clearColorFilter();
        } else {
            trackDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}}, new int[]{i}), new ColorDrawable(i), null));
    }

    @Override // p000.AbstractC11378v71, android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) throws Resources.NotFoundException {
        if (!this.f9597T || isChecked() == z) {
            super.setChecked(isChecked());
            return;
        }
        this.f9597T = false;
        super.setChecked(z);
        Integer num = this.f9599V;
        if (num == null && this.f9598U == null) {
            return;
        }
        if (!z) {
            num = this.f9598U;
        }
        m6675g(num);
    }
}
