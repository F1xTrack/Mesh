package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC6397lz;
import p000.AbstractC7677Gz1;
import p000.AbstractC8765al1;
import p000.C4032f6;
import p000.C6588oz;
import p000.C8433Vn1;
import p000.NG0;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC8765al1 {

    /* renamed from: c */
    public final Rect f18065c;

    /* renamed from: d */
    public final Rect f18066d;

    /* renamed from: e */
    public int f18067e;

    /* renamed from: f */
    public final int f18068f;

    public AppBarLayout$ScrollingViewBehavior() {
        this.f18065c = new Rect();
        this.f18066d = new Rect();
        this.f18067e = 0;
    }

    /* renamed from: u */
    public static C4032f6 m11181u(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = (View) list.get(i);
            if (view instanceof C4032f6) {
                return (C4032f6) view;
            }
        }
        return null;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: b */
    public final boolean mo11182b(View view, View view2) {
        return view2 instanceof C4032f6;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: d */
    public boolean mo11183d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC6397lz abstractC6397lz = ((C6588oz) view2.getLayoutParams()).f39405a;
        if (abstractC6397lz instanceof AppBarLayout$BaseBehavior) {
            int bottom = (((view2.getBottom() - view.getTop()) + ((AppBarLayout$BaseBehavior) abstractC6397lz).f18060j) + this.f18067e) - m11186v(view2);
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            view.offsetTopAndBottom(bottom);
        }
        if (!(view2 instanceof C4032f6)) {
            return false;
        }
        C4032f6 c4032f6 = (C4032f6) view2;
        if (!c4032f6.f27061k) {
            return false;
        }
        c4032f6.m18184e(c4032f6.m18185f(view));
        return false;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: e */
    public final void mo11184e(CoordinatorLayout coordinatorLayout, View view) {
        if (view instanceof C4032f6) {
            AbstractC10944rk1.m24482n(coordinatorLayout, null);
        }
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: i */
    public final boolean mo11169i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        C4032f6 c4032f6M11181u;
        C8433Vn1 lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (c4032f6M11181u = m11181u(coordinatorLayout.m9966j(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            if (c4032f6M11181u.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m8552a() + lastWindowInsets.m8555d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = c4032f6M11181u.getTotalScrollRange() + size;
        int measuredHeight = c4032f6M11181u.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.m9971q(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: m */
    public final boolean mo11185m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        C4032f6 c4032f6M11181u = m11181u(coordinatorLayout.m9966j(view));
        if (c4032f6M11181u != null) {
            Rect rect2 = new Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            int width = coordinatorLayout.getWidth();
            int height = coordinatorLayout.getHeight();
            Rect rect3 = this.f18065c;
            rect3.set(0, 0, width, height);
            if (!rect3.contains(rect2)) {
                c4032f6M11181u.m18183d(false, !z, true);
                return true;
            }
        }
        return false;
    }

    @Override // p000.AbstractC8765al1
    /* renamed from: t */
    public final void mo9812t(CoordinatorLayout coordinatorLayout, View view, int i) {
        C4032f6 c4032f6M11181u = m11181u(coordinatorLayout.m9966j(view));
        if (c4032f6M11181u == null) {
            coordinatorLayout.m9970p(i, view);
            this.f18067e = 0;
            return;
        }
        C6588oz c6588oz = (C6588oz) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c6588oz).leftMargin;
        int bottom = c4032f6M11181u.getBottom() + ((ViewGroup.MarginLayoutParams) c6588oz).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c6588oz).rightMargin;
        int bottom2 = ((c4032f6M11181u.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c6588oz).bottomMargin;
        Rect rect = this.f18065c;
        rect.set(paddingLeft, bottom, width, bottom2);
        C8433Vn1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.m8553b() + rect.left;
                rect.right -= lastWindowInsets.m8554c();
            }
        }
        int i2 = c6588oz.f39407c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int i3 = i2;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f18066d;
        Gravity.apply(i3, measuredWidth, measuredHeight, rect, rect2, i);
        int iM11186v = m11186v(c4032f6M11181u);
        view.layout(rect2.left, rect2.top - iM11186v, rect2.right, rect2.bottom - iM11186v);
        this.f18067e = rect2.top - c4032f6M11181u.getBottom();
    }

    /* renamed from: v */
    public final int m11186v(View view) {
        int i;
        if (this.f18068f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof C4032f6) {
            C4032f6 c4032f6 = (C4032f6) view;
            int totalScrollRange = c4032f6.getTotalScrollRange();
            int downNestedPreScrollRange = c4032f6.getDownNestedPreScrollRange();
            AbstractC6397lz abstractC6397lz = ((C6588oz) c4032f6.getLayoutParams()).f39405a;
            int iM11178x = abstractC6397lz instanceof AppBarLayout$BaseBehavior ? ((AppBarLayout$BaseBehavior) abstractC6397lz).m11178x() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iM11178x > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iM11178x / i) + 1.0f;
            }
        }
        int i2 = this.f18068f;
        return AbstractC7677Gz1.m3204a((int) (f * i2), 0, i2);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f18065c = new Rect();
        this.f18066d = new Rect();
        this.f18067e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.f7711y);
        this.f18068f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
