package defpackage;

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
public final class C3902g7 extends Spinner {
    public static final int[] i = {R.attr.spinnerMode};
    public final C4271i3 a;
    public final Context b;
    public final W6 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final InterfaceC3711f7 f;
    public int g;
    public final Rect h;

    /* JADX WARN: Removed duplicated region for block: B:67:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3902g7(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 2130969622(0x7f040416, float:1.7547931E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.h = r1
            android.content.Context r1 = r12.getContext()
            defpackage.R91.a(r12, r1)
            int[] r1 = defpackage.AbstractC2104aH0.v
            Xo1 r2 = defpackage.C1857Xo1.J(r13, r14, r1, r0)
            i3 r3 = new i3
            r3.<init>(r12)
            r12.a = r3
            java.lang.Object r3 = r2.c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            Ry r6 = new Ry
            r6.<init>(r13, r4)
            r12.b = r6
            goto L37
        L35:
            r12.b = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = defpackage.C3902g7.i     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
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
            android.content.Context r9 = r12.b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.b
            Xo1 r1 = defpackage.C1857Xo1.J(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.g = r9
            android.graphics.drawable.Drawable r9 = r1.C(r8)
            r4.h(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.D = r7
            r1.M()
            r12.f = r4
            W6 r1 = new W6
            r1.<init>(r12, r12, r4)
            r12.c = r1
            goto La5
        L98:
            Z6 r1 = new Z6
            r1.<init>(r12)
            r12.f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.c = r4
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
            r2.M()
            r12.e = r8
            android.widget.SpinnerAdapter r13 = r12.d
            if (r13 == 0) goto Lca
            r12.setAdapter(r13)
            r12.d = r6
        Lca:
            i3 r13 = r12.a
            r13.l(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3902g7.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
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
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
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
        Rect rect = this.h;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        return interfaceC3711f7 != null ? interfaceC3711f7.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        return interfaceC3711f7 != null ? interfaceC3711f7.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    public final InterfaceC3711f7 getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        return interfaceC3711f7 != null ? interfaceC3711f7.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        return interfaceC3711f7 != null ? interfaceC3711f7.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            return c4271i3.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            return c4271i3.j();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        if (interfaceC3711f7 == null || !interfaceC3711f7.a()) {
            return;
        }
        interfaceC3711f7.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C3520e7 c3520e7 = (C3520e7) parcelable;
        super.onRestoreInstanceState(c3520e7.getSuperState());
        if (!c3520e7.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new X6(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C3520e7 c3520e7 = new C3520e7(super.onSaveInstanceState());
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        c3520e7.a = interfaceC3711f7 != null && interfaceC3711f7.a();
        return c3520e7;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        W6 w6 = this.c;
        if (w6 == null || !w6.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        if (interfaceC3711f7 == null) {
            return super.performClick();
        }
        if (interfaceC3711f7.a()) {
            return true;
        }
        this.f.l(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.p(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        if (interfaceC3711f7 == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            interfaceC3711f7.k(i2);
            interfaceC3711f7.d(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        if (interfaceC3711f7 != null) {
            interfaceC3711f7.i(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        if (interfaceC3711f7 != null) {
            interfaceC3711f7.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(AbstractC8352zN1.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        if (interfaceC3711f7 != null) {
            interfaceC3711f7.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4271i3 c4271i3 = this.a;
        if (c4271i3 != null) {
            c4271i3.v(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC3711f7 interfaceC3711f7 = this.f;
        if (interfaceC3711f7 != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C2073a7 c2073a7 = new C2073a7();
            c2073a7.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c2073a7.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                Y6.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC3711f7.o(c2073a7);
        }
    }
}
