package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ru.mes.dnevnik.R;

/* renamed from: V6 */
/* loaded from: classes.dex */
public final class C1328V6 extends CC0 {

    /* renamed from: h */
    public final C1265U6 f12348h;

    /* renamed from: i */
    public Drawable f12349i;

    /* renamed from: j */
    public ColorStateList f12350j;

    /* renamed from: k */
    public PorterDuff.Mode f12351k;

    /* renamed from: l */
    public boolean f12352l;

    /* renamed from: m */
    public boolean f12353m;

    public C1328V6(C1265U6 c1265u6) {
        super(c1265u6);
        this.f12350j = null;
        this.f12351k = null;
        this.f12352l = false;
        this.f12353m = false;
        this.f12348h = c1265u6;
    }

    @Override // p000.CC0
    /* renamed from: c1 */
    public final void mo1061c1(AttributeSet attributeSet, int i) {
        super.mo1061c1(attributeSet, R.attr.seekBarStyle);
        C1265U6 c1265u6 = this.f12348h;
        Context context = c1265u6.getContext();
        int[] iArr = AbstractC8704aH0.f15429g;
        C8539Xo1 c8539Xo1M9117J = C8539Xo1.m9117J(context, attributeSet, iArr, R.attr.seekBarStyle);
        AbstractC10944rk1.m24481m(c1265u6, c1265u6.getContext(), iArr, attributeSet, (TypedArray) c8539Xo1M9117J.f13982c, R.attr.seekBarStyle, 0);
        Drawable drawableM9122D = c8539Xo1M9117J.m9122D(0);
        if (drawableM9122D != null) {
            c1265u6.setThumb(drawableM9122D);
        }
        Drawable drawableM9121C = c8539Xo1M9117J.m9121C(1);
        Drawable drawable = this.f12349i;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f12349i = drawableM9121C;
        if (drawableM9121C != null) {
            drawableM9121C.setCallback(c1265u6);
            AbstractC4236iL.m19004b(drawableM9121C, c1265u6.getLayoutDirection());
            if (drawableM9121C.isStateful()) {
                drawableM9121C.setState(c1265u6.getDrawableState());
            }
            m8295p1();
        }
        c1265u6.invalidate();
        TypedArray typedArray = (TypedArray) c8539Xo1M9117J.f13982c;
        if (typedArray.hasValue(3)) {
            this.f12351k = AbstractC6737rL.m24317c(typedArray.getInt(3, -1), this.f12351k);
            this.f12353m = true;
        }
        if (typedArray.hasValue(2)) {
            this.f12350j = c8539Xo1M9117J.m9120B(2);
            this.f12352l = true;
        }
        c8539Xo1M9117J.m9130M();
        m8295p1();
    }

    /* renamed from: p1 */
    public final void m8295p1() {
        Drawable drawable = this.f12349i;
        if (drawable != null) {
            if (this.f12352l || this.f12353m) {
                Drawable drawableMutate = drawable.mutate();
                this.f12349i = drawableMutate;
                if (this.f12352l) {
                    AbstractC4173hL.m18806h(drawableMutate, this.f12350j);
                }
                if (this.f12353m) {
                    AbstractC4173hL.m18807i(this.f12349i, this.f12351k);
                }
                if (this.f12349i.isStateful()) {
                    this.f12349i.setState(this.f12348h.getDrawableState());
                }
            }
        }
    }

    /* renamed from: q1 */
    public final void m8296q1(Canvas canvas) {
        if (this.f12349i != null) {
            int max = this.f12348h.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f12349i.getIntrinsicWidth();
                int intrinsicHeight = this.f12349i.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f12349i.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f12349i.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
