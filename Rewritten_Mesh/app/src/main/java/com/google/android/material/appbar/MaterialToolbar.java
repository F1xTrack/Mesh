package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC11256uA1;
import p000.AbstractC4173hL;
import p000.AbstractC8593Yp1;
import p000.AbstractC9057d02;
import p000.AbstractC9536gk1;
import p000.C10439no0;
import p000.C8774aq0;
import p000.DJ1;
import p000.MenuC7450Cq0;
import p000.NG0;
import p000.NJ1;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: c0 */
    public static final ImageView.ScaleType[] f18069c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: U */
    public Integer f18070U;

    /* renamed from: V */
    public boolean f18071V;

    /* renamed from: W */
    public boolean f18072W;

    /* renamed from: a0 */
    public ImageView.ScaleType f18073a0;

    /* renamed from: b0 */
    public Boolean f18074b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC11256uA1.m25127b(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM1627d = DJ1.m1627d(context2, attributeSet, NG0.f7709w, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM1627d.hasValue(2)) {
            setNavigationIconTint(typedArrayM1627d.getColor(2, -1));
        }
        this.f18071V = typedArrayM1627d.getBoolean(4, false);
        this.f18072W = typedArrayM1627d.getBoolean(3, false);
        int i = typedArrayM1627d.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f18069c0;
            if (i < scaleTypeArr.length) {
                this.f18073a0 = scaleTypeArr[i];
            }
        }
        if (typedArrayM1627d.hasValue(0)) {
            this.f18074b0 = Boolean.valueOf(typedArrayM1627d.getBoolean(0, false));
        }
        typedArrayM1627d.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC9057d02.m17462a(background);
        if (colorStateListValueOf != null) {
            C10439no0 c10439no0 = new C10439no0();
            c10439no0.m23238j(colorStateListValueOf);
            c10439no0.m23236h(context2);
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            c10439no0.m23237i(AbstractC9536gk1.m18614i(this));
            setBackground(c10439no0);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f18073a0;
    }

    public Integer getNavigationIconTint() {
        return this.f18070U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: m */
    public final void mo9861m(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuC7450Cq0;
        if (z) {
            ((MenuC7450Cq0) menu).m1424w();
        }
        super.mo9861m(i);
        if (z) {
            ((MenuC7450Cq0) menu).m1423v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C10439no0) {
            AbstractC8593Yp1.m9386b(this, (C10439no0) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f18071V || this.f18072W) {
            ArrayList arrayListM5624c = NJ1.m5624c(this, getTitle());
            boolean zIsEmpty = arrayListM5624c.isEmpty();
            C8774aq0 c8774aq0 = NJ1.f7726a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListM5624c, c8774aq0);
            ArrayList arrayListM5624c2 = NJ1.m5624c(this, getSubtitle());
            TextView textView2 = arrayListM5624c2.isEmpty() ? null : (TextView) Collections.max(arrayListM5624c2, c8774aq0);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f18071V && textView != null) {
                    m11187x(textView, pair);
                }
                if (this.f18072W && textView2 != null) {
                    m11187x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f18074b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f18073a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C10439no0) {
            ((C10439no0) background).m23237i(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f18074b0;
        if (bool == null || bool.booleanValue() != z) {
            this.f18074b0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f18073a0 != scaleType) {
            this.f18073a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f18070U != null) {
            drawable = drawable.mutate();
            AbstractC4173hL.m18805g(drawable, this.f18070U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f18070U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f18072W != z) {
            this.f18072W = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f18071V != z) {
            this.f18071V = z;
            requestLayout();
        }
    }

    /* renamed from: x */
    public final void m11187x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
