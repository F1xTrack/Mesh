package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000.AbstractC10944rk1;
import p000.AbstractC11153tN0;
import p000.AbstractC6397lz;
import p000.AbstractC7222ym;
import p000.AbstractC8259Se1;
import p000.C0695L1;
import p000.C0804Mm;
import p000.C0989Pi;
import p000.C10043ki0;
import p000.C10439no0;
import p000.C11583wk1;
import p000.C1177Si;
import p000.C6588oz;
import p000.D01;
import p000.LZ0;
import p000.NG0;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC6397lz {

    /* renamed from: a */
    public C10043ki0 f18233a;

    /* renamed from: b */
    public final C10439no0 f18234b;

    /* renamed from: c */
    public final ColorStateList f18235c;

    /* renamed from: d */
    public final LZ0 f18236d;

    /* renamed from: e */
    public final C1177Si f18237e;

    /* renamed from: f */
    public final float f18238f;

    /* renamed from: g */
    public final boolean f18239g;

    /* renamed from: h */
    public int f18240h;

    /* renamed from: i */
    public C11583wk1 f18241i;

    /* renamed from: j */
    public boolean f18242j;

    /* renamed from: k */
    public final float f18243k;

    /* renamed from: l */
    public int f18244l;

    /* renamed from: m */
    public int f18245m;

    /* renamed from: n */
    public int f18246n;

    /* renamed from: o */
    public int f18247o;

    /* renamed from: p */
    public WeakReference f18248p;

    /* renamed from: q */
    public WeakReference f18249q;

    /* renamed from: r */
    public final int f18250r;

    /* renamed from: s */
    public VelocityTracker f18251s;

    /* renamed from: t */
    public int f18252t;

    /* renamed from: u */
    public final LinkedHashSet f18253u;

    /* renamed from: v */
    public final C0989Pi f18254v;

    public SideSheetBehavior() {
        this.f18237e = new C1177Si(this);
        this.f18239g = true;
        this.f18240h = 5;
        this.f18243k = 0.1f;
        this.f18250r = -1;
        this.f18253u = new LinkedHashSet();
        this.f18254v = new C0989Pi(this, 1);
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: c */
    public final void mo11205c(C6588oz c6588oz) {
        this.f18248p = null;
        this.f18241i = null;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: f */
    public final void mo11206f() {
        this.f18248p = null;
        this.f18241i = null;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: g */
    public final boolean mo11168g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C11583wk1 c11583wk1;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC10944rk1.m24473e(view) == null) || !this.f18239g) {
            this.f18242j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f18251s) != null) {
            velocityTracker.recycle();
            this.f18251s = null;
        }
        if (this.f18251s == null) {
            this.f18251s = VelocityTracker.obtain();
        }
        this.f18251s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f18252t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f18242j) {
            this.f18242j = false;
            return false;
        }
        return (this.f18242j || (c11583wk1 = this.f18241i) == null || !c11583wk1.m25691q(motionEvent)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x00ce  */
    @Override // p000.AbstractC6397lz
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo9810h(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.mo9810h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: i */
    public final boolean mo11169i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: n */
    public final void mo11172n(View view, Parcelable parcelable) {
        int i = ((D01) parcelable).f1798c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f18240h = i;
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: o */
    public final Parcelable mo11173o(View view) {
        return new D01(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p000.AbstractC6397lz
    /* renamed from: r */
    public final boolean mo11176r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f18240h == 1 && actionMasked == 0) {
            return true;
        }
        if (m11249t()) {
            this.f18241i.m25684j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f18251s) != null) {
            velocityTracker.recycle();
            this.f18251s = null;
        }
        if (this.f18251s == null) {
            this.f18251s = VelocityTracker.obtain();
        }
        this.f18251s.addMovement(motionEvent);
        if (m11249t() && actionMasked == 2 && !this.f18242j && m11249t()) {
            float fAbs = Math.abs(this.f18252t - motionEvent.getX());
            C11583wk1 c11583wk1 = this.f18241i;
            if (fAbs > c11583wk1.f45055b) {
                c11583wk1.m25676b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f18242j;
    }

    /* renamed from: s */
    public final void m11248s(int i) {
        View view;
        if (this.f18240h == i) {
            return;
        }
        this.f18240h = i;
        WeakReference weakReference = this.f18248p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f18240h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f18253u.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
        m11251v();
    }

    /* renamed from: t */
    public final boolean m11249t() {
        return this.f18241i != null && (this.f18239g || this.f18240h == 1);
    }

    /* renamed from: u */
    public final void m11250u(int i, View view, boolean z) {
        int iM22243b;
        if (i == 3) {
            iM22243b = this.f18233a.m22243b();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "Invalid state to get outer edge offset: "));
            }
            iM22243b = this.f18233a.m22244c();
        }
        C11583wk1 c11583wk1 = this.f18241i;
        if (c11583wk1 == null || (!z ? c11583wk1.m25692r(view, iM22243b, view.getTop()) : c11583wk1.m25690p(iM22243b, view.getTop()))) {
            m11248s(i);
        } else {
            m11248s(2);
            this.f18237e.m7419a(i);
        }
    }

    /* renamed from: v */
    public final void m11251v() {
        View view;
        WeakReference weakReference = this.f18248p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC10944rk1.m24479k(262144, view);
        AbstractC10944rk1.m24476h(0, view);
        AbstractC10944rk1.m24479k(1048576, view);
        AbstractC10944rk1.m24476h(0, view);
        if (this.f18240h != 5) {
            AbstractC10944rk1.m24480l(view, C0695L1.f6460m, new C0804Mm(this, 5, 6));
        }
        if (this.f18240h != 3) {
            AbstractC10944rk1.m24480l(view, C0695L1.f6458k, new C0804Mm(this, 3, 6));
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f18237e = new C1177Si(this);
        this.f18239g = true;
        this.f18240h = 5;
        this.f18243k = 0.1f;
        this.f18250r = -1;
        this.f18253u = new LinkedHashSet();
        this.f18254v = new C0989Pi(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NG0.f7681A);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f18235c = AbstractC8259Se1.m7406e(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f18236d = LZ0.m5024b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m8561c();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f18250r = resourceId;
            WeakReference weakReference = this.f18249q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f18249q = null;
            WeakReference weakReference2 = this.f18248p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        LZ0 lz0 = this.f18236d;
        if (lz0 != null) {
            C10439no0 c10439no0 = new C10439no0(lz0);
            this.f18234b = c10439no0;
            c10439no0.m23236h(context);
            ColorStateList colorStateList = this.f18235c;
            if (colorStateList != null) {
                this.f18234b.m23238j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f18234b.setTint(typedValue.data);
            }
        }
        this.f18238f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f18239g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
