package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class V6 extends CC0 {
    public final U6 h;
    public Drawable i;
    public ColorStateList j;
    public PorterDuff.Mode k;
    public boolean l;
    public boolean m;

    public V6(U6 u6) {
        super(u6);
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        this.h = u6;
    }

    @Override // defpackage.CC0
    public final void c1(AttributeSet attributeSet, int i) {
        super.c1(attributeSet, R.attr.seekBarStyle);
        U6 u6 = this.h;
        Context context = u6.getContext();
        int[] iArr = AbstractC2104aH0.g;
        C1857Xo1 c1857Xo1J = C1857Xo1.J(context, attributeSet, iArr, R.attr.seekBarStyle);
        AbstractC6897rk1.m(u6, u6.getContext(), iArr, attributeSet, (TypedArray) c1857Xo1J.c, R.attr.seekBarStyle, 0);
        Drawable drawableD = c1857Xo1J.D(0);
        if (drawableD != null) {
            u6.setThumb(drawableD);
        }
        Drawable drawableC = c1857Xo1J.C(1);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.i = drawableC;
        if (drawableC != null) {
            drawableC.setCallback(u6);
            AbstractC4326iL.b(drawableC, u6.getLayoutDirection());
            if (drawableC.isStateful()) {
                drawableC.setState(u6.getDrawableState());
            }
            p1();
        }
        u6.invalidate();
        TypedArray typedArray = (TypedArray) c1857Xo1J.c;
        if (typedArray.hasValue(3)) {
            this.k = AbstractC6820rL.c(typedArray.getInt(3, -1), this.k);
            this.m = true;
        }
        if (typedArray.hasValue(2)) {
            this.j = c1857Xo1J.B(2);
            this.l = true;
        }
        c1857Xo1J.M();
        p1();
    }

    public final void p1() {
        Drawable drawable = this.i;
        if (drawable != null) {
            if (this.l || this.m) {
                Drawable drawableMutate = drawable.mutate();
                this.i = drawableMutate;
                if (this.l) {
                    AbstractC4135hL.h(drawableMutate, this.j);
                }
                if (this.m) {
                    AbstractC4135hL.i(this.i, this.k);
                }
                if (this.i.isStateful()) {
                    this.i.setState(this.h.getDrawableState());
                }
            }
        }
    }

    public final void q1(Canvas canvas) {
        if (this.i != null) {
            int max = this.h.getMax();
            if (max > 1) {
                int intrinsicWidth = this.i.getIntrinsicWidth();
                int intrinsicHeight = this.i.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.i.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.i.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
