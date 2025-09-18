package p000;

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

/* renamed from: Ig */
/* loaded from: classes.dex */
public abstract class AbstractC0547Ig extends FrameLayout {

    /* renamed from: i */
    public static final ViewOnTouchListenerC0484Hg f5071i = new ViewOnTouchListenerC0484Hg(0);

    /* renamed from: a */
    public final LZ0 f5072a;

    /* renamed from: b */
    public int f5073b;

    /* renamed from: c */
    public final float f5074c;

    /* renamed from: d */
    public final float f5075d;

    /* renamed from: e */
    public final int f5076e;

    /* renamed from: f */
    public final int f5077f;

    /* renamed from: g */
    public ColorStateList f5078g;

    /* renamed from: h */
    public PorterDuff.Mode f5079h;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0547Ig(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(AbstractC11256uA1.m25127b(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, NG0.f7682B);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            AbstractC9536gk1.m18624s(this, dimensionPixelSize);
        }
        this.f5073b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f5072a = LZ0.m5024b(context2, attributeSet, 0, 0).m8561c();
        }
        this.f5074c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC8259Se1.m7406e(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(S02.m7147c(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f5075d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f5076e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f5077f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f5071i);
        setFocusable(true);
        if (getBackground() == null) {
            int iM22234i = AbstractC10036ke1.m22234i(AbstractC10036ke1.m22230e(R.attr.colorSurface, this), getBackgroundOverlayColorAlpha(), AbstractC10036ke1.m22230e(R.attr.colorOnSurface, this));
            LZ0 lz0 = this.f5072a;
            if (lz0 != null) {
                int i = AbstractC0610Jg.f5666a;
                C10439no0 c10439no0 = new C10439no0(lz0);
                c10439no0.m23238j(ColorStateList.valueOf(iM22234i));
                gradientDrawable = c10439no0;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC0610Jg.f5666a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iM22234i);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f5078g;
            if (colorStateList != null) {
                AbstractC4173hL.m18806h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f5075d;
    }

    public int getAnimationMode() {
        return this.f5073b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f5074c;
    }

    public int getMaxInlineActionWidth() {
        return this.f5077f;
    }

    public int getMaxWidth() {
        return this.f5076e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        AbstractC9280ek1.m18029c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f5076e;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f5073b = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f5078g != null) {
            drawable = drawable.mutate();
            AbstractC4173hL.m18806h(drawable, this.f5078g);
            AbstractC4173hL.m18807i(drawable, this.f5079h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f5078g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC4173hL.m18806h(drawableMutate, colorStateList);
            AbstractC4173hL.m18807i(drawableMutate, this.f5079h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f5079h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            AbstractC4173hL.m18807i(drawableMutate, mode);
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
        setOnTouchListener(onClickListener != null ? null : f5071i);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC0610Jg abstractC0610Jg) {
    }
}
