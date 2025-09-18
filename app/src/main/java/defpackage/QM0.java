package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* loaded from: classes.dex */
public final class QM0 extends AbstractC7544v71 {
    public boolean T;
    public Integer U;
    public Integer V;

    public QM0(Context context) {
        super(context);
        this.T = true;
        this.U = null;
        this.V = null;
    }

    public final void e(boolean z) throws Resources.NotFoundException {
        if (isChecked() != z) {
            super.setChecked(z);
            Integer num = this.V;
            if (num != null || this.U != null) {
                if (!z) {
                    num = this.U;
                }
                g(num);
            }
        }
        this.T = true;
    }

    public final void f(Integer num) {
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

    public final void g(Integer num) {
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

    @Override // defpackage.AbstractC7544v71, android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) throws Resources.NotFoundException {
        if (!this.T || isChecked() == z) {
            super.setChecked(isChecked());
            return;
        }
        this.T = false;
        super.setChecked(z);
        Integer num = this.V;
        if (num == null && this.U == null) {
            return;
        }
        if (!z) {
            num = this.U;
        }
        g(num);
    }
}
