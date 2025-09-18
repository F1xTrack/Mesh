package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p000.C10690pl1;
import p000.C6338l2;
import p000.C6527o2;
import p000.C8170Qm0;
import p000.C9518gb1;
import p000.InterfaceC3915dE;
import p000.InterfaceC7045vy;
import p000.LayoutInflaterFactory2C0448H6;
import p000.MenuC7450Cq0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    public TypedValue f15857a;

    /* renamed from: b */
    public TypedValue f15858b;

    /* renamed from: c */
    public TypedValue f15859c;

    /* renamed from: d */
    public TypedValue f15860d;

    /* renamed from: e */
    public TypedValue f15861e;

    /* renamed from: f */
    public TypedValue f15862f;

    /* renamed from: g */
    public final Rect f15863g;

    /* renamed from: h */
    public InterfaceC7045vy f15864h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15863g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f15861e == null) {
            this.f15861e = new TypedValue();
        }
        return this.f15861e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f15862f == null) {
            this.f15862f = new TypedValue();
        }
        return this.f15862f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f15859c == null) {
            this.f15859c = new TypedValue();
        }
        return this.f15859c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f15860d == null) {
            this.f15860d = new TypedValue();
        }
        return this.f15860d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f15857a == null) {
            this.f15857a = new TypedValue();
        }
        return this.f15857a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f15858b == null) {
            this.f15858b = new TypedValue();
        }
        return this.f15858b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7045vy interfaceC7045vy = this.f15864h;
        if (interfaceC7045vy != null) {
            interfaceC7045vy.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C6527o2 c6527o2;
        super.onDetachedFromWindow();
        InterfaceC7045vy interfaceC7045vy = this.f15864h;
        if (interfaceC7045vy != null) {
            LayoutInflaterFactory2C0448H6 layoutInflaterFactory2C0448H6 = (LayoutInflaterFactory2C0448H6) ((C8170Qm0) interfaceC7045vy).f9780b;
            InterfaceC3915dE interfaceC3915dE = layoutInflaterFactory2C0448H6.f4099r;
            if (interfaceC3915dE != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC3915dE;
                actionBarOverlayLayout.m9842k();
                ActionMenuView actionMenuView = ((C9518gb1) actionBarOverlayLayout.f15819e).f27862a.f15889a;
                if (actionMenuView != null && (c6527o2 = actionMenuView.f15846t) != null) {
                    c6527o2.m23311b();
                    C6338l2 c6338l2 = c6527o2.f38709t;
                    if (c6338l2 != null && c6338l2.m7121b()) {
                        c6338l2.f10453i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0448H6.f4105w != null) {
                layoutInflaterFactory2C0448H6.f4092l.getDecorView().removeCallbacks(layoutInflaterFactory2C0448H6.f4106x);
                if (layoutInflaterFactory2C0448H6.f4105w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0448H6.f4105w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0448H6.f4105w = null;
            }
            C10690pl1 c10690pl1 = layoutInflaterFactory2C0448H6.f4107y;
            if (c10690pl1 != null) {
                c10690pl1.m23871b();
            }
            MenuC7450Cq0 menuC7450Cq0 = layoutInflaterFactory2C0448H6.m3269A(0).f3576h;
            if (menuC7450Cq0 != null) {
                menuC7450Cq0.m1404c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0062  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC7045vy interfaceC7045vy) {
        this.f15864h = interfaceC7045vy;
    }
}
