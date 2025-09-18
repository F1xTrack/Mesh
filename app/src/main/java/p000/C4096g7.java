package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: g7 */
/* loaded from: classes.dex */
public final class C4096g7 extends Spinner {

    /* renamed from: i */
    public static final int[] f27567i = {R.attr.spinnerMode};

    /* renamed from: a */
    public final C4218i3 f27568a;

    /* renamed from: b */
    public final Context f27569b;

    /* renamed from: c */
    public final C1391W6 f27570c;

    /* renamed from: d */
    public SpinnerAdapter f27571d;

    /* renamed from: e */
    public final boolean f27572e;

    /* renamed from: f */
    public final InterfaceC4033f7 f27573f;

    /* renamed from: g */
    public int f27574g;

    /* renamed from: h */
    public final Rect f27575h;

    /* JADX WARN: Removed duplicated region for block: B:67:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4096g7(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130969622(0x7f040416, float:1.7547931E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f27575h = r1
            android.content.Context r1 = r12.getContext()
            p000.R91.m6917a(r12, r1)
            int[] r1 = p000.AbstractC8704aH0.f15444v
            Xo1 r2 = p000.C8539Xo1.m9117J(r13, r14, r1, r0)
            i3 r3 = new i3
            r3.<init>(r12)
            r12.f27568a = r3
            java.lang.Object r3 = r2.f13982c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            Ry r6 = new Ry
            r6.<init>(r13, r4)
            r12.f27569b = r6
            goto L37
        L35:
            r12.f27569b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = p000.C4096g7.f27567i     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L5b
            if (r8 == 0) goto L4d
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L5b
            goto L4d
        L4a:
            r13 = move-exception
            r6 = r7
            goto L55
        L4d:
            r7.recycle()
            goto L5e
        L51:
            r13 = move-exception
            goto L55
        L53:
            r7 = r6
            goto L5b
        L55:
            if (r6 == 0) goto L5a
            r6.recycle()
        L5a:
            throw r13
        L5b:
            if (r7 == 0) goto L5e
            goto L4d
        L5e:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L98
            if (r4 == r8) goto L65
            goto La5
        L65:
            d7 r4 = new d7
            android.content.Context r9 = r12.f27569b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f27569b
            Xo1 r1 = p000.C8539Xo1.m9117J(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f13982c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f27574g = r9
            android.graphics.drawable.Drawable r9 = r1.m9121C(r8)
            r4.m3564h(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f25818D = r7
            r1.m9130M()
            r12.f27573f = r4
            W6 r1 = new W6
            r1.<init>(r12, r12, r4)
            r12.f27570c = r1
            goto La5
        L98:
            Z6 r1 = new Z6
            r1.<init>(r12)
            r12.f27573f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f14722c = r4
        La5:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131558547(0x7f0d0093, float:1.8742413E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lbc:
            r2.m9130M()
            r12.f27572e = r8
            android.widget.SpinnerAdapter r13 = r12.f27571d
            if (r13 == 0) goto Lca
            r12.setAdapter(r13)
            r12.f27571d = r6
        Lca:
            i3 r13 = r12.f27568a
            r13.m18947l(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4096g7.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final int m18402a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f27575h;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4218i3 c4218i3 = this.f27568a;
        if (c4218i3 != null) {
            c4218i3.m18937a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        return interfaceC4033f7 != null ? interfaceC4033f7.mo9476c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        return interfaceC4033f7 != null ? interfaceC4033f7.mo9485m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f27573f != null ? this.f27574g : super.getDropDownWidth();
    }

    public final InterfaceC4033f7 getInternalPopup() {
        return this.f27573f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        return interfaceC4033f7 != null ? interfaceC4033f7.mo9479f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f27569b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        return interfaceC4033f7 != null ? interfaceC4033f7.mo9478e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4218i3 c4218i3 = this.f27568a;
        if (c4218i3 != null) {
            return c4218i3.m18944i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4218i3 c4218i3 = this.f27568a;
        if (c4218i3 != null) {
            return c4218i3.m18945j();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        if (interfaceC4033f7 == null || !interfaceC4033f7.mo9475a()) {
            return;
        }
        interfaceC4033f7.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f27573f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m18402a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C3970e7 c3970e7 = (C3970e7) parcelable;
        super.onRestoreInstanceState(c3970e7.getSuperState());
        if (!c3970e7.f26543a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1454X6(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C3970e7 c3970e7 = new C3970e7(super.onSaveInstanceState());
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        c3970e7.f26543a = interfaceC4033f7 != null && interfaceC4033f7.mo9475a();
        return c3970e7;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1391W6 c1391w6 = this.f27570c;
        if (c1391w6 == null || !c1391w6.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        if (interfaceC4033f7 == null) {
            return super.performClick();
        }
        if (interfaceC4033f7.mo9475a()) {
            return true;
        }
        this.f27573f.mo9484l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4218i3 c4218i3 = this.f27568a;
        if (c4218i3 != null) {
            c4218i3.m18950o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C4218i3 c4218i3 = this.f27568a;
        if (c4218i3 != null) {
            c4218i3.m18951p(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        if (interfaceC4033f7 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC4033f7.mo9483k(i);
            interfaceC4033f7.mo9477d(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        if (interfaceC4033f7 != null) {
            interfaceC4033f7.mo9482i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f27573f != null) {
            this.f27574g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        if (interfaceC4033f7 != null) {
            interfaceC4033f7.mo9481h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC11918zN1.m26394b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        if (interfaceC4033f7 != null) {
            interfaceC4033f7.mo9480g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4218i3 c4218i3 = this.f27568a;
        if (c4218i3 != null) {
            c4218i3.m18956u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4218i3 c4218i3 = this.f27568a;
        if (c4218i3 != null) {
            c4218i3.m18957v(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f27572e) {
            this.f27571d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC4033f7 interfaceC4033f7 = this.f27573f;
        if (interfaceC4033f7 != null) {
            Context context = this.f27569b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C1644a7 c1644a7 = new C1644a7();
            c1644a7.f15314a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c1644a7.f15315b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC1517Y6.m9221a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC4033f7.mo3567o(c1644a7);
        }
    }
}
