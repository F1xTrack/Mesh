package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: Ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0662Ig extends FrameLayout {
    public static final ViewOnTouchListenerC0584Hg i = new ViewOnTouchListenerC0584Hg(0);
    public final LZ0 a;
    public int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0662Ig(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(AbstractC7362uA1.b(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, NG0.B);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            AbstractC4021gk1.s(this, dimensionPixelSize);
        }
        this.b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.a = LZ0.b(context2, attributeSet, 0, 0).c();
        }
        this.c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC1437Se1.e(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(S02.c(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(i);
        setFocusable(true);
        if (getBackground() == null) {
            int i2 = AbstractC5543ke1.i(AbstractC5543ke1.e(R.attr.colorSurface, this), getBackgroundOverlayColorAlpha(), AbstractC5543ke1.e(R.attr.colorOnSurface, this));
            LZ0 lz0 = this.a;
            if (lz0 != null) {
                int i3 = AbstractC0740Jg.a;
                C6145no0 c6145no0 = new C6145no0(lz0);
                c6145no0.j(ColorStateList.valueOf(i2));
                gradientDrawable = c6145no0;
            } else {
                Resources resources = getResources();
                int i4 = AbstractC0740Jg.a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(i2);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.g;
            if (colorStateList != null) {
                AbstractC4135hL.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.d;
    }

    public int getAnimationMode() {
        return this.b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.c;
    }

    public int getMaxInlineActionWidth() {
        return this.f;
    }

    public int getMaxWidth() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        AbstractC3639ek1.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.g != null) {
            drawable = drawable.mutate();
            AbstractC4135hL.h(drawable, this.g);
            AbstractC4135hL.i(drawable, this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC4135hL.h(drawableMutate, colorStateList);
            AbstractC4135hL.i(drawableMutate, this.h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC4135hL.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : i);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC0740Jg abstractC0740Jg) {
    }
}
