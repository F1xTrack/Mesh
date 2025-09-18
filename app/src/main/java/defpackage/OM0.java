package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.runtime.ReactHostImpl;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class OM0 extends ReactRootView {
    public final T71 t;
    public final C0645Ia0 u;
    public final C0177Ca0 v;
    public boolean w;
    public int x;
    public int y;

    public OM0(Context context, T71 t71) {
        super(context);
        this.t = t71;
        this.u = new C0645Ia0(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.v = new C0177Ca0(this);
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.facebook.react.ReactRootView, defpackage.InterfaceC7418uT0
    public final void a(ViewGroup viewGroup, MotionEvent motionEvent) {
        O90.f(motionEvent, "ev");
        if (this.t.D() == null) {
            return;
        }
        this.u.c = false;
        C0177Ca0 c0177Ca0 = this.v;
        if (c0177Ca0 != null) {
            c0177Ca0.e = -1;
        }
    }

    @Override // com.facebook.react.ReactRootView, defpackage.InterfaceC7418uT0
    public final void b(Throwable th) {
        O90.e((ReactHostImpl) ((AtomicReference) this.t.b).get(), "getReactHost(...)");
        String string = Objects.toString(th.getMessage(), "");
        O90.c(string);
        C2262b60 c2262b60 = new C2262b60(string, this, th);
        int i = ReactHostImpl.a;
        c2262b60.getMessage();
        throw null;
    }

    @Override // com.facebook.react.ReactRootView, defpackage.InterfaceC7418uT0
    public final void c(ViewGroup viewGroup, MotionEvent motionEvent) {
        C0177Ca0 c0177Ca0;
        O90.f(motionEvent, "ev");
        C7080si c7080siD = this.t.D();
        if (c7080siD == null) {
            return;
        }
        this.u.c(motionEvent, c7080siD);
        if (viewGroup == null || (c0177Ca0 = this.v) == null) {
            return;
        }
        c0177Ca0.f(viewGroup, motionEvent, c7080siD);
    }

    @Override // com.facebook.react.ReactRootView
    public final void e(MotionEvent motionEvent, boolean z) {
        O90.f(motionEvent, "event");
        C0177Ca0 c0177Ca0 = this.v;
        if (c0177Ca0 == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                AbstractC3393dS.p("ReactSurfaceView");
            }
        } else {
            C7080si c7080siD = this.t.D();
            if (c7080siD != null) {
                c0177Ca0.d(motionEvent, c7080siD, z);
            } else {
                AbstractC3393dS.p("ReactSurfaceView");
            }
        }
    }

    @Override // com.facebook.react.ReactRootView
    public final void f(MotionEvent motionEvent) {
        O90.f(motionEvent, "event");
        C7080si c7080siD = this.t.D();
        if (c7080siD != null) {
            this.u.b(motionEvent, c7080siD);
        } else {
            AbstractC3393dS.p("ReactSurfaceView");
        }
    }

    @Override // com.facebook.react.ReactRootView
    public final boolean g() {
        T71 t71 = this.t;
        if (((AtomicReference) t71.b).get() == null) {
            return false;
        }
        ((ReactHostImpl) ((AtomicReference) t71.b).get()).getClass();
        throw null;
    }

    @Override // com.facebook.react.ReactRootView
    public ReactContext getCurrentReactContext() {
        T71 t71 = this.t;
        if (!(((AtomicReference) t71.b).get() != null)) {
            return null;
        }
        ((ReactHostImpl) ((AtomicReference) t71.b).get()).getClass();
        throw null;
    }

    @Override // com.facebook.react.ReactRootView, defpackage.InterfaceC5870mM0
    public String getJSModuleName() {
        String moduleName = ((SurfaceHandlerBinding) this.t.c).getModuleName();
        O90.e(moduleName, "<get-moduleName>(...)");
        return moduleName;
    }

    @Override // com.facebook.react.ReactRootView, defpackage.InterfaceC5870mM0
    public int getUIManagerType() {
        return 2;
    }

    @Override // com.facebook.react.ReactRootView
    public final boolean h() {
        T71 t71 = this.t;
        if (((AtomicReference) t71.b).get() == null) {
            return false;
        }
        ((ReactHostImpl) ((AtomicReference) t71.b).get()).getClass();
        return false;
    }

    @Override // com.facebook.react.ReactRootView
    public final boolean j() {
        return ((AtomicReference) this.t.b).get() != null;
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.w && z) {
            Point viewportOffset = getViewportOffset();
            this.t.T(this.x, this.y, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int size2;
        MT1.b("ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                iMax = Math.max(iMax, childAt.getPaddingRight() + childAt.getPaddingLeft() + childAt.getMeasuredWidth() + childAt.getLeft());
            }
            size = iMax;
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int iMax2 = 0;
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = getChildAt(i4);
                iMax2 = Math.max(iMax2, childAt2.getPaddingBottom() + childAt2.getPaddingTop() + childAt2.getMeasuredHeight() + childAt2.getTop());
            }
            size2 = iMax2;
        } else {
            size2 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, size2);
        this.w = true;
        this.x = i;
        this.y = i2;
        Point viewportOffset = getViewportOffset();
        this.t.T(i, i2, viewportOffset.x, viewportOffset.y);
        Trace.endSection();
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // com.facebook.react.ReactRootView
    public void setIsFabric(boolean z) {
        super.setIsFabric(true);
    }
}
