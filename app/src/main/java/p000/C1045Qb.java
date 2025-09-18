package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.C1932a;

/* renamed from: Qb */
/* loaded from: classes2.dex */
public final class C1045Qb extends C1932a {

    /* renamed from: a */
    public final C0982Pb f9682a;

    /* renamed from: b */
    public boolean f9683b;

    /* renamed from: c */
    public boolean f9684c;

    /* renamed from: d */
    public double f9685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1045Qb(S91 s91) {
        super(s91);
        O90.m5968f(s91, "context");
        this.f9682a = new C0982Pb();
        this.f9685d = 1.0d;
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
            if ((childAt instanceof InterfaceC1060Qq) && ((InterfaceC1060Qq) childAt).getIndex() == -1) {
                return childAt;
            }
        }
        return null;
    }

    private final int getFooterDiff() {
        int bottom;
        int top;
        int childCount = getChildCount();
        C0982Pb c0982Pb = this.f9682a;
        if (childCount == 0) {
            c0982Pb.f9158h = 0;
        } else if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            c0982Pb.f9158h = c0982Pb.f9151a ? childAt.getRight() : childAt.getBottom();
        }
        if (c0982Pb.f9151a) {
            bottom = getRight();
            top = getLeft();
        } else {
            bottom = getBottom();
            top = getTop();
        }
        return c0982Pb.f9158h - (bottom - top);
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
    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int iMax;
        O90.m5968f(canvas, "canvas");
        int childCount = getChildCount();
        C0982Pb c0982Pb = this.f9682a;
        if (childCount > 1 && !this.f9684c) {
            int childCount2 = getChildCount();
            InterfaceC1060Qq[] interfaceC1060QqArr = new InterfaceC1060Qq[childCount2];
            for (int i = 0; i < childCount2; i++) {
                View childAt = getChildAt(i);
                if (!(childAt instanceof InterfaceC1060Qq)) {
                    throw new IllegalStateException("CellRendererComponent outer view should always be CellContainer. Learn more here: https://shopify.github.io/flash-list/docs/usage#cellrenderercomponent.");
                }
                interfaceC1060QqArr[i] = childAt;
            }
            if (childCount2 > 1) {
                AbstractC0576J8.m4199z(interfaceC1060QqArr, new C8774aq0(3));
            }
            c0982Pb.f9153c = c0982Pb.f9151a ? getLeft() : getTop();
            c0982Pb.f9158h = 0;
            int i2 = childCount2 - 1;
            int iMin = Integer.MAX_VALUE;
            int i3 = 0;
            int iMax2 = 0;
            int i4 = 0;
            while (i3 < i2) {
                C1122Rq c1122Rq = interfaceC1060QqArr[i3];
                i3++;
                C1122Rq c1122Rq2 = interfaceC1060QqArr[i3];
                boolean z = c1122Rq2.getIndex() == c1122Rq.getIndex() + 1;
                if (c0982Pb.m6386a(c1122Rq) || c0982Pb.m6386a(c1122Rq2)) {
                    if (c0982Pb.f9151a) {
                        iMax2 = Math.max(i4, c1122Rq.getRight());
                        iMin = Math.min(iMin, c1122Rq.getLeft());
                        if (z) {
                            if (c1122Rq.getTop() < c1122Rq2.getTop()) {
                                if (c1122Rq.getBottom() != c1122Rq2.getTop()) {
                                    c1122Rq2.setBottom(c1122Rq2.getHeight() + c1122Rq.getBottom());
                                    c1122Rq2.setTop(c1122Rq.getBottom());
                                }
                                if (c1122Rq.getLeft() != c1122Rq2.getLeft()) {
                                    c1122Rq2.setRight(c1122Rq2.getWidth() + c1122Rq.getLeft());
                                    c1122Rq2.setLeft(c1122Rq.getLeft());
                                }
                            } else {
                                c1122Rq2.setRight(c1122Rq2.getWidth() + iMax2);
                                c1122Rq2.setLeft(iMax2);
                            }
                        }
                        if (c0982Pb.m6386a(c1122Rq2)) {
                            iMax = Math.max(iMax2, c1122Rq2.getRight());
                            int i5 = iMax;
                            i4 = iMax2;
                            iMax2 = i5;
                        }
                        i4 = iMax2;
                    } else {
                        iMax2 = Math.max(i4, c1122Rq.getBottom());
                        iMin = Math.min(iMin, c1122Rq.getTop());
                        if (z) {
                            if (c1122Rq.getLeft() < c1122Rq2.getLeft()) {
                                if (c1122Rq.getRight() != c1122Rq2.getLeft()) {
                                    c1122Rq2.setRight(c1122Rq2.getWidth() + c1122Rq.getRight());
                                    c1122Rq2.setLeft(c1122Rq.getRight());
                                }
                                if (c1122Rq.getTop() != c1122Rq2.getTop()) {
                                    c1122Rq2.setBottom(c1122Rq2.getHeight() + c1122Rq.getTop());
                                    c1122Rq2.setTop(c1122Rq.getTop());
                                }
                            } else {
                                c1122Rq2.setBottom(c1122Rq2.getHeight() + iMax2);
                                c1122Rq2.setTop(iMax2);
                            }
                        }
                        if (c0982Pb.m6386a(c1122Rq2)) {
                            iMax = Math.max(iMax2, c1122Rq2.getBottom());
                            int i52 = iMax;
                            i4 = iMax2;
                            iMax2 = i52;
                        }
                        i4 = iMax2;
                    }
                }
                int iMax3 = Math.max(c0982Pb.f9158h, c0982Pb.f9151a ? c1122Rq.getRight() : c1122Rq.getBottom());
                c0982Pb.f9158h = iMax3;
                c0982Pb.f9158h = Math.max(iMax3, c0982Pb.f9151a ? c1122Rq2.getRight() : c1122Rq2.getBottom());
            }
            c0982Pb.f9159i = iMax2;
            c0982Pb.f9160j = iMin;
        }
        View parentScrollView = getParentScrollView();
        if (!this.f9684c && parentScrollView != null && (!c0982Pb.f9151a ? getBottom() <= parentScrollView.getHeight() : getRight() <= parentScrollView.getWidth())) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            View footer = getFooter();
            int footerDiff = getFooterDiff();
            if (footerDiff != 0 && footer != null && view != null) {
                if (c0982Pb.f9151a) {
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
        if (!this.f9683b || parentScrollView2 == null) {
            return;
        }
        int width = c0982Pb.f9151a ? parentScrollView2.getWidth() : parentScrollView2.getHeight();
        int scrollX = c0982Pb.f9151a ? parentScrollView2.getScrollX() : parentScrollView2.getScrollY();
        int left = c0982Pb.f9151a ? getLeft() : getTop();
        int right = c0982Pb.f9151a ? getRight() : getBottom();
        int iMax4 = Math.max(left - scrollX, 0);
        int iMax5 = Math.max((width + scrollX) - right, 0);
        int i6 = scrollX - c0982Pb.f9153c;
        int i7 = (c0982Pb.f9160j - i6) - iMax4;
        c0982Pb.f9156f = i7;
        int i8 = (((i6 + c0982Pb.f9154d) - c0982Pb.f9155e) - c0982Pb.f9159i) - iMax5;
        c0982Pb.f9157g = i8;
        Math.max(i7, i8);
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) context, getId());
        if (interfaceC6947uPM6091b != null) {
            Context context2 = getContext();
            O90.m5966d(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            int iM6093d = OZ1.m6093d((ReactContext) context2);
            int id = getId();
            double d = c0982Pb.f9156f;
            double d2 = this.f9685d;
            interfaceC6947uPM6091b.mo11046g(new C6966ui(iM6093d, id, d / d2, c0982Pb.f9157g / d2));
        }
    }

    public final C0982Pb getAlShadow() {
        return this.f9682a;
    }

    public final boolean getDisableAutoLayout() {
        return this.f9684c;
    }

    public final boolean getEnableInstrumentation() {
        return this.f9683b;
    }

    public final double getPixelDensity() {
        return this.f9685d;
    }

    public final void setDisableAutoLayout(boolean z) {
        this.f9684c = z;
    }

    public final void setEnableInstrumentation(boolean z) {
        this.f9683b = z;
    }

    public final void setPixelDensity(double d) {
        this.f9685d = d;
    }
}
