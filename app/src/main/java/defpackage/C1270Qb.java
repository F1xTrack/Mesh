package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.a;

/* renamed from: Qb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1270Qb extends a {
    public final C1192Pb a;
    public boolean b;
    public boolean c;
    public double d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1270Qb(S91 s91) {
        super(s91);
        O90.f(s91, "context");
        this.a = new C1192Pb();
        this.d = 1.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getFooter() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC1315Qq) && ((InterfaceC1315Qq) childAt).getIndex() == -1) {
                return childAt;
            }
        }
        return null;
    }

    private final int getFooterDiff() {
        int bottom;
        int top;
        int childCount = getChildCount();
        C1192Pb c1192Pb = this.a;
        if (childCount == 0) {
            c1192Pb.h = 0;
        } else if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            c1192Pb.h = c1192Pb.a ? childAt.getRight() : childAt.getBottom();
        }
        if (c1192Pb.a) {
            bottom = getRight();
            top = getLeft();
        } else {
            bottom = getBottom();
            top = getTop();
        }
        return c1192Pb.h - (bottom - top);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getParentScrollView() {
        for (ViewParent parent = getParent(); parent != 0; parent = parent.getParent()) {
            if ((parent instanceof ScrollView) || (parent instanceof HorizontalScrollView)) {
                return (View) parent;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int iMax;
        O90.f(canvas, "canvas");
        int childCount = getChildCount();
        C1192Pb c1192Pb = this.a;
        if (childCount > 1 && !this.c) {
            int childCount2 = getChildCount();
            InterfaceC1315Qq[] interfaceC1315QqArr = new InterfaceC1315Qq[childCount2];
            for (int i = 0; i < childCount2; i++) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof InterfaceC1315Qq)) {
                    throw new IllegalStateException("CellRendererComponent outer view should always be CellContainer. Learn more here: https://shopify.github.io/flash-list/docs/usage#cellrenderercomponent.");
                }
                interfaceC1315QqArr[i] = childAt;
            }
            if (childCount2 > 1) {
                J8.z(interfaceC1315QqArr, new C2209aq0(3));
            }
            c1192Pb.c = c1192Pb.a ? getLeft() : getTop();
            c1192Pb.h = 0;
            int i2 = childCount2 - 1;
            int iMin = Integer.MAX_VALUE;
            int i3 = 0;
            int iMax2 = 0;
            int i4 = 0;
            while (i3 < i2) {
                C1393Rq c1393Rq = interfaceC1315QqArr[i3];
                i3++;
                C1393Rq c1393Rq2 = interfaceC1315QqArr[i3];
                boolean z = c1393Rq2.getIndex() == c1393Rq.getIndex() + 1;
                if (c1192Pb.a(c1393Rq) || c1192Pb.a(c1393Rq2)) {
                    if (c1192Pb.a) {
                        iMax2 = Math.max(i4, c1393Rq.getRight());
                        iMin = Math.min(iMin, c1393Rq.getLeft());
                        if (z) {
                            if (c1393Rq.getTop() < c1393Rq2.getTop()) {
                                if (c1393Rq.getBottom() != c1393Rq2.getTop()) {
                                    c1393Rq2.setBottom(c1393Rq2.getHeight() + c1393Rq.getBottom());
                                    c1393Rq2.setTop(c1393Rq.getBottom());
                                }
                                if (c1393Rq.getLeft() != c1393Rq2.getLeft()) {
                                    c1393Rq2.setRight(c1393Rq2.getWidth() + c1393Rq.getLeft());
                                    c1393Rq2.setLeft(c1393Rq.getLeft());
                                }
                            } else {
                                c1393Rq2.setRight(c1393Rq2.getWidth() + iMax2);
                                c1393Rq2.setLeft(iMax2);
                            }
                        }
                        if (c1192Pb.a(c1393Rq2)) {
                            iMax = Math.max(iMax2, c1393Rq2.getRight());
                            int i5 = iMax;
                            i4 = iMax2;
                            iMax2 = i5;
                        }
                        i4 = iMax2;
                    } else {
                        iMax2 = Math.max(i4, c1393Rq.getBottom());
                        iMin = Math.min(iMin, c1393Rq.getTop());
                        if (z) {
                            if (c1393Rq.getLeft() < c1393Rq2.getLeft()) {
                                if (c1393Rq.getRight() != c1393Rq2.getLeft()) {
                                    c1393Rq2.setRight(c1393Rq2.getWidth() + c1393Rq.getRight());
                                    c1393Rq2.setLeft(c1393Rq.getRight());
                                }
                                if (c1393Rq.getTop() != c1393Rq2.getTop()) {
                                    c1393Rq2.setBottom(c1393Rq2.getHeight() + c1393Rq.getTop());
                                    c1393Rq2.setTop(c1393Rq.getTop());
                                }
                            } else {
                                c1393Rq2.setBottom(c1393Rq2.getHeight() + iMax2);
                                c1393Rq2.setTop(iMax2);
                            }
                        }
                        if (c1192Pb.a(c1393Rq2)) {
                            iMax = Math.max(iMax2, c1393Rq2.getBottom());
                            int i52 = iMax;
                            i4 = iMax2;
                            iMax2 = i52;
                        }
                        i4 = iMax2;
                    }
                }
                int iMax3 = Math.max(c1192Pb.h, c1192Pb.a ? c1393Rq.getRight() : c1393Rq.getBottom());
                c1192Pb.h = iMax3;
                c1192Pb.h = Math.max(iMax3, c1192Pb.a ? c1393Rq2.getRight() : c1393Rq2.getBottom());
            }
            c1192Pb.i = iMax2;
            c1192Pb.j = iMin;
        }
        View parentScrollView = getParentScrollView();
        if (!this.c && parentScrollView != null && (!c1192Pb.a ? getBottom() <= parentScrollView.getHeight() : getRight() <= parentScrollView.getWidth())) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            View footer = getFooter();
            int footerDiff = getFooterDiff();
            if (footerDiff != 0 && footer != null && view != null) {
                if (c1192Pb.a) {
                    footer.offsetLeftAndRight(footerDiff);
                    setRight(getRight() + footerDiff);
                    view.setRight(view.getRight() + footerDiff);
                } else {
                    footer.offsetTopAndBottom(footerDiff);
                    setBottom(getBottom() + footerDiff);
                    view.setBottom(view.getBottom() + footerDiff);
                }
            }
        }
        super.dispatchDraw(canvas);
        View parentScrollView2 = getParentScrollView();
        if (!this.b || parentScrollView2 == null) {
            return;
        }
        int width = c1192Pb.a ? parentScrollView2.getWidth() : parentScrollView2.getHeight();
        int scrollX = c1192Pb.a ? parentScrollView2.getScrollX() : parentScrollView2.getScrollY();
        int left = c1192Pb.a ? getLeft() : getTop();
        int right = c1192Pb.a ? getRight() : getBottom();
        int iMax4 = Math.max(left - scrollX, 0);
        int iMax5 = Math.max((width + scrollX) - right, 0);
        int i6 = scrollX - c1192Pb.c;
        int i7 = (c1192Pb.j - i6) - iMax4;
        c1192Pb.f = i7;
        int i8 = (((i6 + c1192Pb.d) - c1192Pb.e) - c1192Pb.i) - iMax5;
        c1192Pb.g = i8;
        Math.max(i7, i8);
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC7405uP interfaceC7405uPB = OZ1.b((ReactContext) context, getId());
        if (interfaceC7405uPB != null) {
            Context context2 = getContext();
            O90.d(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            int iD = OZ1.d((ReactContext) context2);
            int id = getId();
            double d = c1192Pb.f;
            double d2 = this.d;
            interfaceC7405uPB.g(new C7462ui(iD, id, d / d2, c1192Pb.g / d2));
        }
    }

    public final C1192Pb getAlShadow() {
        return this.a;
    }

    public final boolean getDisableAutoLayout() {
        return this.c;
    }

    public final boolean getEnableInstrumentation() {
        return this.b;
    }

    public final double getPixelDensity() {
        return this.d;
    }

    public final void setDisableAutoLayout(boolean z) {
        this.c = z;
    }

    public final void setEnableInstrumentation(boolean z) {
        this.b = z;
    }

    public final void setPixelDensity(double d) {
        this.d = d;
    }
}
